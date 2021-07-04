package pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class busOperatorPage {
	WebDriver driver;

	public busOperatorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'All Operators >')]")
	public WebElement busoperators;
	
	public void AllOperators() {
		busoperators.sendKeys(Keys.ENTER);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

}
