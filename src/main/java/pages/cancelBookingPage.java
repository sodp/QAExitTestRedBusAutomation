package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class cancelBookingPage {

	WebDriver driver;

	public cancelBookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Manage Booking')]")
	public WebElement managebooking;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	public WebElement clickcancel;

	public void mangaeBooking() {
		managebooking.click();

	}

	public void cancelButton() {
		clickcancel.click();
	}

}
