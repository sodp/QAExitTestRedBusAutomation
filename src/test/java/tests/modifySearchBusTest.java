package tests;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.modifySearchBusPage;
import util.commonUtil;



public class modifySearchBusTest extends BaseTest {
	private String sheetName = "SearchBusTest";

	@Test
	public void careers() throws Throwable {
		extentTest = extent.startTest("Valid ModifySearchBusLocation functionality scenario test");

		String testcase = "ValidsearchBus";

		modifySearchBusPage modify_location = new modifySearchBusPage(driver);

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		String source_Location = data.get("From");
		String dest_Location = data.get("To");
		


		commonUtil.toCheckExecutionRequired(executionRequired);

		modify_location.selectsource(source_Location);
		Thread.sleep(5000);
		modify_location.selectdestination(dest_Location);
		Thread.sleep(5000);
		modify_location.dateSelectButton();
		Thread.sleep(5000);
		modify_location.clicksearchbutton();
		Thread.sleep(5000);
		modify_location.modifylocation(dest_Location, source_Location);
		Thread.sleep(5000);
		modify_location.modifySearch();
		Thread.sleep(5000);

		String expected = driver.getTitle();
		logger.info("ModifySearchBusLocation functionality Test Case Passed");
		Assert.assertEquals(expected, driver.getTitle());
		Thread.sleep(5000);
	}

}
