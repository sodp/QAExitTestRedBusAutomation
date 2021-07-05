package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.bookingManagingPage;
import util.Execution;

public class BookingCancelTest extends BaseTest {
	private String sheetName = "Manage Booking";

	@Test
	public void careers() throws Throwable {
		extentTest = extent.startTest("Cancel Ticket Page Navigation");

		String testcase = "Cancel Ticket Page";

		bookingManagingPage cancelticket = new bookingManagingPage(driver);
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		//Check Execution Required 
		String executionRequired = data.get("Execution Required").toLowerCase();
		Execution.toCheckExecutionRequired(executionRequired);

		cancelticket.ManageBooking();
		Thread.sleep(1000);
		cancelticket.CancelButton();
		Thread.sleep(1000);
		Assert.assertEquals("Cancel Ticket - redBus", driver.getTitle());
		logger.info("Cancel Ticket Navigation Test Case Passed");
		Thread.sleep(1000);
	}

}
