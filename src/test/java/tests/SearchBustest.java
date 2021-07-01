package tests;

import java.util.HashMap;

import org.testng.annotations.Test;
import util.commonUtil;
import pages.SearchBus;

public class SearchBustest extends BaseTest {
	private String sheetName = "SearchBusTest";

	@Test
	public void searchBus() throws InterruptedException {

		String testName = "whenUserEntersValidFromAndValidToAndValidDate";
		// Fetching all test data from excel file
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testName);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		String fromLocation = testData.get("From");
		String toLocation = testData.get("To");
		String dateVal = testData.get("Date");
		// if execution required field is no
		commonUtil.toCheckExecutionRequired(executionRequired);
		extentTest = extent.startTest("Valid serarch bus test");
		SearchBus user = new SearchBus(driver);
		user.clickBusTicket();
		user.UserSource(fromLocation);
		Thread.sleep(2200);
		user.UserDestination(toLocation);
		Thread.sleep(5000);
		user.clickDate(dateVal);
		user.SearchButton();
	}

}