package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class mobileAppLink {

	WebDriver driver;

	public mobileAppLink(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='smsTXTBOX']")
	public WebElement mobAppLink;
	@FindBy(how = How.XPATH, using = "//input[@id='sendLinkButton']")
	public WebElement mobAppLinkSend;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Invalid Mobile No')]")
	public WebElement errorInvalidMob;
	@FindBy(how = How.XPATH, using = "//div[@id='failure']")
	public WebElement validMobMsg;

	public void sendAppLink(String mob) throws InterruptedException {
		mobAppLink.sendKeys(mob);
		Thread.sleep(2000);
		mobAppLinkSend.click();
		Thread.sleep(2000);
	}


}
