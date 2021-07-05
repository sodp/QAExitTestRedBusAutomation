package tests;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.busOperatorPage;
import util.Execution;

public class busOperatorTest  extends BaseTest{
	private String sheetName = "Home Page";

	@Test
	public void allBusOperators() throws Throwable {
		extentTest = extent.startTest("All Bus Operators Navigation Test");
		
		String testcase = "Bus Operator Page"; 
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		Execution.toCheckExecutionRequired(executionRequired);
		
		busOperatorPage operator  = new busOperatorPage(driver);
		
		operator.AllOperators();
		Thread.sleep(1000);
		String title = "Find list of bus operators in India. Get more than 2000 bus operators information in redBus, India's largest bus booking site.";
		Assert.assertEquals(title, driver.getTitle());
		Thread.sleep(1000);
		logger.info("All Bus Operators Navigation Test");
	}

}
