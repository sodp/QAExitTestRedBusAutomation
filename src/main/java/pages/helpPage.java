package pages;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class helpPage {

	WebDriver driver;

	public helpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Help')]")
	public WebElement helpbutton;

	@FindBy(how = How.XPATH, using = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	public WebElement cross;

	public void naviHelpSection() {
		helpbutton.click();
	}

	public void closePopup() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		cross.click();

	}

}
