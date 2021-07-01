package tests;

import org.testng.annotations.Test;

import pages.signinPage;

public class signinTest extends BaseTest {
	@Test
	public void signin() throws Throwable {
		//extentTest = extent.startTest("Valid Signin scenario test");
		signinPage usersignin = new signinPage(driver);

		usersignin.naviSignin();
		usersignin.signinButton();
		usersignin.signIn();
		usersignin.closePopUp();

		//logger.info("Signin Test Case Passed");

		Thread.sleep(9000);
	}

}
