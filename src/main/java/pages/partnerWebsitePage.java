package pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class partnerWebsitePage {
	WebDriver driver;

	public partnerWebsitePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Goibibo')]")
	public WebElement goibibo;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Makemytrip')]")
	public WebElement makemytrip;

	public void GoibiboSite() throws InterruptedException {
		goibibo.click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
	}

	public void MakemytripSite() throws InterruptedException {
		makemytrip.click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(5000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
	}

}
