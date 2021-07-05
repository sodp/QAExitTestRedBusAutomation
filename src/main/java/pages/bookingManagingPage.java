package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class bookingManagingPage {
	WebDriver driver;

	public bookingManagingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Manage Booking')]")
	public WebElement managebooking;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
	public WebElement clickcancel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Change Travel Date')]")
	public WebElement changetraveldate;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Show My Ticket')]")
	public WebElement showticket ;
	

	public void ManageBooking() {
		managebooking.click();

	}

	public void CancelButton() {
		clickcancel.click();
	}
	
	public void TravelDate() {
		managebooking.click();
		changetraveldate.click();

	}

	public void ShowTicket() {
		managebooking.click();
		showticket.click();
	}
}
