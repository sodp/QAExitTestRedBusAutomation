package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signinPage {
	WebDriver driver;

	public signinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "signin-block")
	public WebElement signin_button;

	@FindBy(how = How.ID, using = "signInLink")
	public WebElement clicksignin;

	@FindBy(how = How.XPATH, using = "//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/iframe[1]")
	public WebElement googlesignin;

	@FindBy(how = How.XPATH, using = "//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/iframe[1]")
	public WebElement popupclose;

	public void naviSignin() {
		signin_button.click();
	}

	public void signinButton()  {
		clicksignin.click();

	}

	public void signIn() {
		driver.switchTo().frame(driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/iframe[1]")));
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[8]/div[1]")).click();

	}

	public void closePopUp() {
		driver.switchTo().frame(driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/iframe[1]")));
		popupclose.click();
	}


}
