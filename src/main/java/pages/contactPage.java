package pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class contactPage {
	WebDriver driver;

	public contactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Contact Us')]")
	public WebElement contactus;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Click Here')]")
	public WebElement clickhere;

	@FindBy(how = How.XPATH, using = "//i[@class='icon-close']")
	public WebElement closePopUp;

	public void contactusButton() throws Throwable {
		contactus.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

	}

	public void clickSupport() throws Throwable {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
		clickhere.click();
		Thread.sleep(1000);
	}


	public void close() throws Throwable {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(2));
		Thread.sleep(1000);
		closePopUp.click();
		Thread.sleep(1000);
	}
}
