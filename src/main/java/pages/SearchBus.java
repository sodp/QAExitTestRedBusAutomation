package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchBus {
	WebDriver driver;
	public SearchBus(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "redBus")
	public WebElement busticket;

	public void clickBusTicket() {
		busticket.click();
	}

	@FindBy(how = How.ID, using = "txtSource")
	public WebElement source;
	@FindBy(how = How.XPATH, using = "//li[@class=\"C120_slist-item C120_suggestion-active\"]")
	public WebElement sourceclick;

	public void UserSource(String Source) throws InterruptedException {
		source.sendKeys(Source);
		Thread.sleep(500);
		sourceclick.click();
	}

	@FindBy(how = How.ID, using = "txtDestination")
	public WebElement destination;

	public void UserDestination(String Destination) throws InterruptedException {
		destination.sendKeys(Destination);
		Thread.sleep(500);
		sourceclick.click();
	}

	// select start date
	@FindBy(how = How.ID, using = "txtOnwardCalendar")
	public WebElement ClickDate;
	
	public static void selectDate(WebDriver driver,WebElement element , String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"')", element);
	}

	public void clickDate(String Date) {
		selectDate(driver,ClickDate,Date);
		//ClickDate.sendKeys(Date);
	}

	@FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement search;

	public void SearchButton() {
		search.click();
	}

}
