package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.helpPage;



public class helpTest extends BaseTest {
	@Test
	public void careers() throws Throwable {
		extentTest = extent.startTest("Valid HelpButton functionality scenario test");
		helpPage helpsection = new helpPage(driver);

		helpsection.naviHelpSection();
		helpsection.closePopup();

		logger.info("HelpButton functionality Test Case Passed");
		Assert.assertEquals("red:Care", driver.getTitle());
		//Thread.sleep(5000);
	}

}
