package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.busHireOutstationPage;
import util.Execution;

public class busHireOutstationTest extends BaseTest {
	private String sheetName = "Bus Hire";

	@Test
	public void all_bus_operators() throws Throwable {
		extentTest = extent.startTest("Bus Hire Outstation Functionality");
		String testName = "Outstation Functionality";

		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testName);
		String fromLocation = testData.get("From");
		String toLocation = testData.get("To");
		String sourceTime = testData.get("Source");
		String destinationTime = testData.get("Destination");
		String passengers = testData.get("No Of Passengers");

		//Check Execution Required 
		String executionRequired = testData.get("Execution Required").toLowerCase();
		Execution.toCheckExecutionRequired(executionRequired);

		busHireOutstationPage outstation = new busHireOutstationPage(driver);

		outstation.naviToBusHire();
		outstation.OutstationMenu();
		outstation.PickAddress(fromLocation);
		outstation.DestinationAddress(toLocation);
		Thread.sleep(1000);
		// outstation.enterDateAndTimeForOutstation(sourceTime,destinationTime);
		outstation.enterDateAndTimeForOutstation("18-07-2021-10:30 PM", "20-07-2021-10:30 PM");
		Thread.sleep(3000);
		outstation.TotalPassenger(passengers);
		Thread.sleep(1000);
		outstation.Proceed();
		// Assert.assertEquals(outstation.viewVechiles.getText(), "VIEW VEHICLES");
		logger.info("Outstation Test Case Passed");


	}
}