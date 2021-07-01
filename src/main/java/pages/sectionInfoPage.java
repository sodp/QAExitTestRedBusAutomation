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

//	@FindBy(how = How.XPATH, using = "//input[@class='sc-htoDjs gdSuEF']")
//	public WebElement enterMobileNumber;

//	@FindBy(how = How.ID, using = "recaptcha-anchor-label")
//	public WebElement clickcaptcha;

	public void naviToTC() {
		termcondition.sendKeys(Keys.ENTER);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	public void navitoprivacypolicy() {
		privacypolicy.sendKeys(Keys.ENTER);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	public void navitofaq() {
		faq.sendKeys(Keys.ENTER);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	public void navitoblog() {
		blog.sendKeys(Keys.ENTER);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	public void navitooperatorregistration(String mobile_number) {
		operatorregistration.sendKeys(Keys.ENTER);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		signin.sendKeys(Keys.ENTER);
		//enterMobileNumber.sendKeys(mobile_number);
		//clickcaptcha.sendKeys(Keys.ENTER);
	}

	public void navitoinsurance() {
		insurance.sendKeys(Keys.ENTER);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	public void navitouseragreement() {
		useragreement.sendKeys(Keys.ENTER);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	public void navitoagentRegistration() {
		agentRegistration.sendKeys(Keys.ENTER);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

}
