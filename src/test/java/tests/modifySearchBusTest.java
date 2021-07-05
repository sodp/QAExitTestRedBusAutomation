package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.modifySearchBusPage;
import util.Execution;

public class modifySearchBusTest extends BaseTest {
	private String sheetName = "Search Bus"; // Search Bus

	@Test
	public void careers() throws Throwable {

		extentTest = extent.startTest("Valid Modify Search Bus Location Functionality Test");
		String testName = "Valid Modify Search Bus";

		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testName);
		String fromLocation = testData.get("From");
		String toLocation = testData.get("To");
		String dateVal = testData.get("Date");
		//Check Execution Required 
		String executionRequired = testData.get("Execution Required").toLowerCase();
		Execution.toCheckExecutionRequired(executionRequired);

		modifySearchBusPage modifylocation = new modifySearchBusPage(driver);

		Execution.toCheckExecutionRequired(executionRequired);

		modifylocation.selectsource(fromLocation);
		Thread.sleep(1000);
		modifylocation.selectdestination(toLocation);
		Thread.sleep(1000);
		modifylocation.dateSelectButton();
		Thread.sleep(1000);
		modifylocation.clicksearchbutton();
		Thread.sleep(1000);
		modifylocation.modifylocation(toLocation, fromLocation);
		Thread.sleep(1000);
		modifylocation.modifySearch();
		Thread.sleep(1000);

		String expected = driver.getTitle();
		logger.info(" Valid Modify Search BusLocation functionality Test Case Passed");
		Assert.assertEquals(expected, driver.getTitle());
		Thread.sleep(1000);
	}

}
