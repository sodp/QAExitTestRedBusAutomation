package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.calender;

public class modifySearchBusPage {
	WebDriver driver;

	public modifySearchBusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")
	public WebElement selectdate;



	@FindBy(how = How.ID, using = "src")
	public WebElement source;

	@FindBy(how = How.ID, using = "dest")
	public WebElement destination;

	@FindBy(how = How.XPATH, using = "//button[@id='search_btn']")
	public WebElement searchbus;

	@FindBy(how = How.XPATH, using = "//div[@class='onward-modify-btn g-button clearfix fl']")
	public WebElement modifysearchbus;

	@FindBy(how = How.XPATH, using = "//button[@class=' button ms-btn']")
	public WebElement modifysearchbusbutton;

	public void selectsource(String sourcellocation) {
		//source.clear();
		source.sendKeys(sourcellocation);
	}

	public void selectdestination(String destloaction)   {
		//destination.clear();
		destination.sendKeys(destloaction);
	}

	public void dateSelectButton() throws Throwable   {

		calender.selectDate(selectdate, "2021", "July", "10", driver);
	
	}

	public void clicksearchbutton()   {
		searchbus.click();
	}

	public void modifylocation(String sourcellocation, String destloaction)  {
		modifysearchbus.click();
		source.clear();
		source.sendKeys(sourcellocation);
		source.sendKeys(Keys.ENTER);
		destination.clear();
		destination.sendKeys(destloaction);
		destination.sendKeys(Keys.ENTER);
		
	}

	public void modifySearch() {
		modifysearchbusbutton.click();
	}

	
}
