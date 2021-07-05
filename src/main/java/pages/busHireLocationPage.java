package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.datetimepicker;

public class busHireLocationPage {
	WebDriver driver;

	public busHireLocationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "redBus Bus Hire")
	public WebElement link;

	@FindBy(how = How.XPATH, using = "//body/div[@id='reactContentMount']/div[1]/div[5]/div[2]/object[1]")
	public WebElement Window;

	@FindBy(how = How.XPATH, using = "//input[@id='numberOfPax']")
	public WebElement traveller;

	@FindBy(how = How.XPATH, using = "//button[@id='proceedButtonLocal']")
	private WebElement button;
	
	@FindBy(how = How.XPATH, using = "//*[@id='to_datepicker']/div/div/input")
	private WebElement timedateto;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Local')]")
	public WebElement local;

	@FindBy(how = How.ID, using = "locationTextFieldLocal")
	public WebElement PickUp;

	@FindBy(how = How.XPATH, using = "//input[@class=\"MuiInputBase-input MuiInput-input\"]")
	private WebElement localdate;
	
	@FindBy(how=How.XPATH , using ="//button[@id='proceedButtonSummary']")
	public WebElement viewVechiles;
	
	

	public void naviToBusHire() {

		link.click();
	}

	public void LocalMenu() throws InterruptedException {

		driver.switchTo().frame(Window);
		Thread.sleep(1000);
		local.click();
		Thread.sleep(1000);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void pickupAddress(String pickup)
	{
		PickUp.sendKeys(pickup);
		driver.findElement(By.xpath("//span[contains(text(),'Noida Sector 18, Noida, Uttar Pradesh, India')]")).click();
	}

	
	
	public void selectdate(String from ) throws InterruptedException {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", localdate);

		Thread.sleep(500);

		// selecting date and time
		try {
			datetimepicker.selectDateAndTimeAtBusHirePage(driver, from);
		} catch (Exception e) {

			e.printStackTrace();
		}
		//timedateto.click();
	}
	
	public void TotalPassenger(String passenger) {
		traveller.sendKeys(passenger);
	}

	public void Proceed() throws Throwable {
		button.click();
		Thread.sleep(1000);

	}

}
