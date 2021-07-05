package util;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import tests.BaseTest;

public class webDriver extends BaseTest {
	public static void initiateDriver(String Port) throws MalformedURLException {
		if (Port.equalsIgnoreCase("5001")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-dev-shm-usage");
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		} else if (Port.equalsIgnoreCase("5002")) {
			FirefoxOptions options = new FirefoxOptions();
			driver = (new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options));
		}
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
