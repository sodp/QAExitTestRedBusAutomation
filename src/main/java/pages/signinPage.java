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

	@FindBy(how = How.XPATH, using = "//*[@id=\"mobileNoInp\"]")
	public WebElement mobile;

	@FindBy(how = How.CLASS_NAME, using = "recaptcha-checkbox-border")
	public WebElement captcha;

	@FindBy(how = How.CLASS_NAME, using = "modalIframe")
	public WebElement frame;

	@FindBy(how = How.CLASS_NAME, using = "//span[contains(text(),'Please enter valid mobile number')]")
	public WebElement invalid;

	public void naviSignin() {
		signin_button.click();
	}

	public void signinButton() {
		clicksignin.click();

	}

	public void signIn() {
		driver.switchTo()
				.frame(driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/iframe[1]")));
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[8]/div[1]")).click();

	}

	public void validSignIn(String Mobile) throws InterruptedException {
		driver.switchTo().frame(frame);
		mobile.sendKeys(Mobile);
	}

	public String charRemoveAt(String str, int p) {
		return str.substring(0, p) + str.substring(p + 1);
	}

	public String GetInvalid() {
		return invalid.getText();
	}

}
