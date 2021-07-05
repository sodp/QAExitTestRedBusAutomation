package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class globalSiteBookingPage {

	WebDriver driver;

	public globalSiteBookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Singapore')]")
	public WebElement Singaporesitelink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Malaysia')]")
	public WebElement Malaysiasitelink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Indonesia')]")
	public WebElement Indonesiasitelink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Peru')]")
	public WebElement Perusitelink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Colombia')]")
	public WebElement Colombiasitelink;

	public void singaporeBooking() throws InterruptedException {
		Singaporesitelink.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);

	}

	public void MalaysiaBooking() throws InterruptedException {
		Malaysiasitelink.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);

	}

	public void indonesiaBooking() throws InterruptedException {
		Indonesiasitelink.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
	}

	public void peruBooking() throws InterruptedException {
		Perusitelink.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
	}

	public void colombiaBooking() throws InterruptedException {
		Colombiasitelink.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);

	}

}