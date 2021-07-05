package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.datetimepicker;

public class busHireOutstationPage {
	WebDriver driver;

	public busHireOutstationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "redBus Bus Hire")
	public WebElement link;

	@FindBy(how = How.XPATH, using = "//body/div[@id='reactContentMount']/div[1]/div[5]/div[2]/object[1]")
	public WebElement Window;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Outstation')]")
	public WebElement outStationMenu;

	@FindBy(how = How.ID, using = "locationTextFieldLocal")
	public WebElement pickaddress;

	@FindBy(how = How.ID, using = "local_dest_name")
	public WebElement destiaddress;

	@FindBy(how = How.ID, using = "numberOfPax")
	public WebElement traveller;

	@FindBy(how = How.ID, using = "proceedButtonOutstation")
	public WebElement button;

	@FindBy(how = How.XPATH, using = "//*[@id='to_datepicker']/div/div/input")
	public WebElement timedateto;

	@FindBy(how = How.XPATH, using = "//*[@id='from_datepicker']/div/div/input")
	public WebElement timedatefrom;

	@FindBy(how = How.XPATH, using = "//button[@id='proceedButtonSummary']")
	public WebElement viewVechiles;

	public void naviToBusHire() {

		link.click();
	}

	public void OutstationMenu() throws InterruptedException {

		driver.switchTo().frame(Window);
		Thread.sleep(1000);
		outStationMenu.click();
		Thread.sleep(1000);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void PickAddress(String pickAddress) throws Throwable {
		pickaddress.sendKeys(pickAddress);
		driver.findElement(By.xpath("//span[contains(text(),'Noida Sector 18, Noida, Uttar Pradesh, India')]")).click();
		Thread.sleep(1000);

	}

	public void DestinationAddress(String destAddress) throws Throwable {
		destiaddress.sendKeys(destAddress);
		driver.findElement(By.xpath("//span[contains(text(),'Ludhiana, Punjab, India')]")).click();
		Thread.sleep(1000);

	}

	public void TotalPassenger(String passenger) {
		traveller.sendKeys(passenger);
	}

	public void enterDateAndTimeForOutstation(String fromVal, String tillVal) throws InterruptedException {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", timedatefrom);

		// selecting date and time
		Thread.sleep(500);
		try {
			datetimepicker.selectDateAndTimeAtBusHirePage(driver, fromVal);
		} catch (Exception e) {

			e.printStackTrace();
		}
		timedateto.click();

		// selecting date and time
		try {
			datetimepicker.selectDateAndTimeAtBusHirePage(driver, tillVal);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void Proceed() throws Throwable {
		button.click();
		Thread.sleep(1000);

	}

}
