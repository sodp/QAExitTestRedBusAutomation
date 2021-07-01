package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class aboutusPage {

	WebDriver driver;

	public aboutusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'About Us')]")
	public  WebElement home_page_about_us_btn;
	
	public  void clickAboutUs() {
		home_page_about_us_btn.click();
	}
}
