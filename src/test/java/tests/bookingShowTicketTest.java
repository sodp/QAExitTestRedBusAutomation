package tests;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.bookingManagingPage;
import util.Execution;



public class bookingShowTicketTest extends BaseTest {
	private String sheetName = "Manage Booking"; 

	@Test
	public void ShowTicket() throws Throwable {
		extentTest = extent.startTest("ShowTicket navigation scenario test");
		String testcase = "Show My Ticket Page"; 

		bookingManagingPage show_ticket = new bookingManagingPage(driver);
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		Execution.toCheckExecutionRequired(executionRequired);

		show_ticket.ShowTicket();

		logger.info("ShowTicket functionality Test Case Passed");
		Assert.assertEquals("", driver.getTitle());
		Thread.sleep(1000);
	}

}
