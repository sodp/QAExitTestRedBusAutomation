package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.cancelBookingPage;

public class cancelBookingTest extends BaseTest{
	@Test
	public void careers() throws Throwable {
		//extentTest = extent.startTest("Cancel ticket functionality scenario test");
		cancelBookingPage cancelticket = new cancelBookingPage(driver);

		cancelticket.mangaeBooking();
		cancelticket.cancelButton();

		logger.info("Cancel ticket functionality Test Case Passed");
		Assert.assertEquals("Cancel Ticket - redBus", driver.getTitle());
		Thread.sleep(5000);
	}

}
