package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.careerPage;
import util.Execution;

public class careerTest extends BaseTest {
	private String sheetName = "Home Page";

	@Test
	public void careers() throws Throwable {
		extentTest = extent.startTest("Valid careers page scenario test");
		String testcase = "Career Page";
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		//Check Execution Required 
		String executionRequired = data.get("Execution Required").toLowerCase();

		careerPage career = new careerPage(driver);
		Execution.toCheckExecutionRequired(executionRequired);
		career.careeerButton();
		Thread.sleep(1000);
		career.goHome();
		Thread.sleep(1000);

		Assert.assertEquals("Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India", driver.getTitle());
		logger.info("CareersPage Test Case Passed");
		Thread.sleep(1000);
	}
}
