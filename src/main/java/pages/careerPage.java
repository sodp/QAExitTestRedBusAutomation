package pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class careerPage {
	WebDriver driver;

	public careerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// ------------------------Careers link locators & methods------------------------

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Careers')]")
	public WebElement careers;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'redbus')]")
	public WebElement home;

	public void careeerButton() {
		careers.sendKeys(Keys.ENTER);
	}

	public void goHome() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		home.click();
		driver.switchTo().window(tabs.get(0));
	}
	// ---------------------------------------------------------------------------

}
