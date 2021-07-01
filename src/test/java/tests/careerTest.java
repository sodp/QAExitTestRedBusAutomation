package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.careerPage;

public class careerTest extends BaseTest{

	@Test
	public void careers() throws Throwable {
		extentTest = extent.startTest("Valid careers page scenario test");
		careerPage buildcareer = new careerPage(driver);

		buildcareer.careeerButton();
		buildcareer.goHome();

		logger.info("CareersPage Test Case Passed");
		Assert.assertEquals("Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India", driver.getTitle());
		Thread.sleep(5000);
	}
}
