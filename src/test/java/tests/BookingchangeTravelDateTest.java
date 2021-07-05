package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.bookingManagingPage;
import util.Execution;

public class BookingchangeTravelDateTest extends BaseTest {
	private String sheetName = "Manage Booking";

	@Test
	public void TravelDate() throws Throwable {
		extentTest = extent.startTest("TravelDate functionality scenario test");
		String testcase = "Change Travel Date Page";

		bookingManagingPage changedate = new bookingManagingPage(driver);
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		//Check Execution Required 
		String executionRequired = data.get("Execution Required").toLowerCase();

		Execution.toCheckExecutionRequired(executionRequired);

		changedate.TravelDate();

		logger.info("TravelDate functionality Test Case Passed");
		Assert.assertEquals("", driver.getTitle());
		Thread.sleep(1000);
	}
}
