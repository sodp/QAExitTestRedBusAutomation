package pages;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class rpoolPage {
	WebDriver driver;

	public rpoolPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "cars")
	public WebElement rpool;

	@FindBy(how = How.XPATH, using = "//body/div[@id='reactContentMount']/div[1]/div[1]/div[12]/div[1]/ul[1]/li[1]/a[1]")
	public WebElement clickit;

	@FindBy(how = How.XPATH, using = "//img[@alt='play store link']")
	public WebElement playStore;

	@FindBy(how = How.XPATH, using = "//img[@alt='app store link']")
	public WebElement appleStore;

	public void navPool() {
		rpool.click();
	}

	public void serachCity()  {
		clickit.click();

	}

	public void android() throws InterruptedException {
		playStore.click();
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
	}
	public void ios() throws InterruptedException {
		appleStore.click();
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
	}
	

}
