package tests;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.busOperatorPage;
import util.commonUtil;

public class busOperatorTest  extends BaseTest{
	private String sheetName = "RedbusFunctionality";

	@Test
	public void all_bus_operators() throws Throwable {
		extentTest = extent.startTest("All Operators page scenario test");
		String testcase = "all_bus_operators";
		busOperatorPage operator  = new busOperatorPage(driver);
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		commonUtil.toCheckExecutionRequired(executionRequired);
		operator.all_operators();
		String title = "Find list of bus operators in India. Get more than 2000 bus operators information in redBus, India's largest bus booking site.";
		logger.info("All Operators Test Case Passed");
		Assert.assertEquals(title, driver.getTitle());
		Thread.sleep(5000);
	}

}
