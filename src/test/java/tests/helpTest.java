package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.helpPage;
import util.Execution;

public class helpTest extends BaseTest {
	private String sheetName = "Home Page";

	@Test
	public void careers() throws Throwable {
		extentTest = extent.startTest("Valid HelpButton Navigationtest");
		String testcase = "Help Page";
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		//Check Execution Required 
		String executionRequired = data.get("Execution Required").toLowerCase();
		helpPage helpsection = new helpPage(driver);
		Execution.toCheckExecutionRequired(executionRequired);
		helpsection.HelpSection();
		helpsection.closePopup();

		Assert.assertEquals("red:Care", driver.getTitle());
		logger.info("HelpButton functionality Test Case Passed");
	}

}
