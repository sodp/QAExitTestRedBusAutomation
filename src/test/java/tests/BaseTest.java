package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import util.ExcelFileIO;
import util.ScreenShots;
import util.webDriver;

public class BaseTest {

	// protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	public static String remote_url = "http://localhost:4444/wd/hub";

	public static WebDriver driver;
	public static ExtentReports extent; // set path where report would be generated
	public static ExtentTest extentTest;

	// Reading the config.properties and log4j.properties file
	public static Logger logger = Logger.getLogger(BaseTest.class);
	static File file = new File(".\\Resources\\conf.properties");
	static FileInputStream fis = null;

	public static String LOG_FILE = ".\\Resources\\log4j.properties";
	static FileInputStream logfile = null;

	public static ExcelFileIO reader = null;

	protected static Properties prop = new Properties();

	static {
		try {
			fis = new FileInputStream(file);
			logfile = new FileInputStream(LOG_FILE);
			PropertyConfigurator.configure(logfile);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fis);
			prop.load(logfile);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {

			reader = new util.ExcelFileIO(".\\Resources\\data.xlsx");
		} catch (Exception e) {

			logger.error(e.getMessage());
		}

	}

	@BeforeSuite
	public void setExtent() {
		extent = new ExtentReports(".\\Reports\\reports.html");
	}

	@AfterSuite
	public void endReport() {
		extent.flush();
		extent.close();
	}

	@AfterMethod
	public void attachScreenShot(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenshotPath = ScreenShots.takeScreenShot(driver, result.getName());
			System.out.print(screenshotPath);
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));
			extentTest.log(LogStatus.FAIL, "ERROR DESCRIPTION : " + result.getThrowable());

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Test case passed successfully");
		}
		extent.endTest(extentTest);
	}

//	@BeforeMethod
//	@Parameters({"Port"})
//	
//	
//    public static void initWebDriver(String value) throws Exception {
//        webDriver.initiateDriver(value);
//    }
//	
	@BeforeMethod
	public static void intializeWebdriver() throws Exception {
		String browser = prop.getProperty("browser");
		String headless = prop.getProperty("headless");
		String docker_flag = prop.getProperty("docker");
		// Check if parameter passed is firefox
		if (browser.equalsIgnoreCase("firefox")) {
			if (headless.equalsIgnoreCase("yes")) {
				System.setProperty(prop.getProperty("driverf"), prop.getProperty("pathf"));
				FirefoxBinary firefoxBinary = new FirefoxBinary();
				firefoxBinary.addCommandLineOptions("-headless");
				FirefoxOptions options = new FirefoxOptions();
				options.setBinary(firefoxBinary);
				driver = new FirefoxDriver(options);
			} else if (headless.equalsIgnoreCase("yes") && docker_flag.equalsIgnoreCase("true")) {
				System.out.println("****************FIREFOX HEADLESS*****************");
				FirefoxBinary firefoxBinary = new FirefoxBinary();
				firefoxBinary.addCommandLineOptions("-headless");
				FirefoxOptions options = new FirefoxOptions();
				driver = (new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), options));
			} else if (headless.equalsIgnoreCase("no") && docker_flag.equalsIgnoreCase("false")) {
				System.setProperty(prop.getProperty("driverf"), prop.getProperty("pathf"));
				driver = new FirefoxDriver();
			} else if (headless.equalsIgnoreCase("no") && docker_flag.equalsIgnoreCase("true")) {
				System.out.println("****************FIREFOX*****************");
				FirefoxOptions options = new FirefoxOptions();
				driver = (new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), options));
			} else {
				driver = new FirefoxDriver();
			}

		}

		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			if (headless.equalsIgnoreCase("yes")) {
				System.setProperty(prop.getProperty("driverc"), prop.getProperty("pathc"));
				ChromeOptions options = new ChromeOptions();

				options.addArguments("--disable-notifications");
				options.addArguments(
						"user-agent=Mozilla/5.0 (Windows NT 8.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.84 Safari/537.36");
				options.addArguments("headless");
				driver = new ChromeDriver(options);
			} else if (headless.equalsIgnoreCase("no") && docker_flag.equalsIgnoreCase("false")) {
				System.setProperty(prop.getProperty("driverc"), prop.getProperty("pathc"));
				driver = new ChromeDriver();
			} else if (headless.equalsIgnoreCase("no") && docker_flag.equalsIgnoreCase("true")) {
				System.out.println("****************CHROME*****************");
				ChromeOptions options = new ChromeOptions();
				driver = (new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), options));
			} else {
				driver = new ChromeDriver();
			}

		}
		// Check if parameter passed as 'Edge'
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty(prop.getProperty("drivere"), prop.getProperty("pathe"));
			// Create New Edge instance
			driver = new EdgeDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("PLEASE CHECK THE BROWSER NAME !");
		}

	}

	@BeforeMethod
	public static void openBrowser() {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	@AfterMethod
	public static void closeBrowser() {
		/// driver.close();
		driver.quit();
	}

}
