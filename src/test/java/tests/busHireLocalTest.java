package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.busHireLocationPage;
import util.Execution;

public class busHireLocalTest extends BaseTest {
	private String sheetName = "Bus Hire";

	@Test
	public void all_bus_operators() throws Throwable {
	
		extentTest = extent.startTest("Bus Hire Outstaion Functionality");
		String testName = "Local Functionality";
		
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testName);
		String fromLocation = testData.get("From");
		String toLocation = testData.get("To");
		String sourceTime = testData.get("Source");
		String destinationTime = testData.get("Destination");
		String passengers = testData.get("No Of Passengers");
		
		// if execution required field is no
		String executionRequired = testData.get("Execution Required").toLowerCase();
		Execution.toCheckExecutionRequired(executionRequired);
	
		busHireLocationPage Local  = new busHireLocationPage(driver);
		
		Local.naviToBusHire();
		Local.LocalMenu();
		Local.pickupAddress(fromLocation);
		Local.selectdate(sourceTime);
		Thread.sleep(2000);
		Local.TotalPassenger(passengers);
		Thread.sleep(2000);
		Local.Proceed();
		Assert.assertEquals(Local.viewVechiles.getText(), "VIEW VEHICLES");
		logger.info("All Operators Test Case Passed");


	}

}
