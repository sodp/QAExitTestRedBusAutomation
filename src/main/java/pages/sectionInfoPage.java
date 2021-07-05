package pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class sectionInfoPage {
	WebDriver driver;

	public sectionInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'T & C')]")
	public WebElement termcondition;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Privacy Policy')]")
	public WebElement privacypolicy;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'FAQ')]")
	public WebElement faq;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Blog')]")
	public WebElement blog;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Bus Operator Registration')]")
	public WebElement operatorregistration;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Insurance Partner')]")
	public WebElement insurance;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'User Agreement')]")
	public WebElement useragreement;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Agent Registration')]")
	public WebElement agentRegistration;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign In / Sign Up')]")
	public WebElement signin;

	public void naviToTC() throws InterruptedException {
		termcondition.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
	}

	public void navitoprivacypolicy() throws InterruptedException {
		privacypolicy.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
	}

	public void navitofaq() throws InterruptedException {
		faq.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
	}

	public void navitoblog() throws InterruptedException {
		blog.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
	}

	public void navitooperatorregistration(String mobile_number) throws InterruptedException {
		operatorregistration.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
		signin.sendKeys(Keys.ENTER);
	}

	public void navitoinsurance() throws InterruptedException {
		insurance.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
	}

	public void navitouseragreement() throws InterruptedException {
		useragreement.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
	}

	public void navitoagentRegistration() throws InterruptedException {
		agentRegistration.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
	}

}
