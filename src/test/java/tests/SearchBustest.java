package tests;

import java.util.HashMap;

import org.testng.annotations.Test;
import util.Execution;
import pages.SearchBus;

public class SearchBustest extends BaseTest {
	private String sheetName = "Search Bus";

	@Test
	public void searchBusValid() throws InterruptedException {

		String testName = "Valid Search Bus";
	
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testName);
		String fromLocation = testData.get("From");
		String toLocation = testData.get("To");
		String dateVal = testData.get("Date");
		// if execution required field is no
		String executionRequired = testData.get("Execution Required").toLowerCase();
		Execution.toCheckExecutionRequired(executionRequired);
		extentTest = extent.startTest("Valid search bus test");
		SearchBus user = new SearchBus(driver);
		user.clickBusTicket();
		user.UserSource(fromLocation);
		Thread.sleep(1000);
		user.UserDestination(toLocation);
		Thread.sleep(1000);
		user.clickDate(dateVal);
		user.SearchButton();
		logger.info("Valid Search Bus Test Case Passed");
	}
	
}