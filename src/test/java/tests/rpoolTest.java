package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.rpoolPage;
import util.Execution;

public class rpoolTest extends BaseTest {
	private String sheetName = "Home Page";

	@Test
	public void rpoolandriod() throws Throwable {
		extentTest = extent.startTest("rpool Page Andriod App page test");
		String testcase = "rpool page andriod";

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		Execution.toCheckExecutionRequired(executionRequired);
		rpoolPage rpool = new rpoolPage(driver);
		rpool.navPool();
		rpool.serachCity();
		Assert.assertEquals("Carpool in Bangalore || The best Carpool app by redBus", driver.getTitle());
		Thread.sleep(1000);
		rpool.android();
		Assert.assertEquals(driver.getCurrentUrl(), "https://play.google.com/store/apps/details?id=in.redbus.android&amp;hl=en");
		logger.info("rpool Andriod Test Case Passed");
	}
	
	@Test
	public void rpoolios() throws Throwable {
		extentTest = extent.startTest("rPool Page functionality scenario test");
		String testcase = "rpool page ios";

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		Execution.toCheckExecutionRequired(executionRequired);
		rpoolPage rpool = new rpoolPage(driver);
		rpool.navPool();
		rpool.serachCity();

		String titleofpage = "Carpool in Bangalore || The best Carpool app by redBus";
		Assert.assertEquals(titleofpage, driver.getTitle());
		Thread.sleep(1000);
		rpool.ios();
		Assert.assertEquals(driver.getCurrentUrl(), "https://apps.apple.com/in/app/redbus/id733712604");
		
		logger.info("rpool ios Test Case Passed");
	}
}
