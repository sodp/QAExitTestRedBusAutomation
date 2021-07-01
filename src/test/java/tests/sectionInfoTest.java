package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.sectionInfoPage;
import util.commonUtil;

public class sectionInfoTest extends BaseTest {
	private String sheetName = "InfoSection";

	@Test
	public void termAndCondition() throws Throwable {
		extentTest = extent.startTest("Navigate to term And Condition page scenario test");
		sectionInfoPage info = new sectionInfoPage(driver);
		String testcase = "termAndCondition";

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		commonUtil.toCheckExecutionRequired(executionRequired);

		info.naviToTC();

		logger.info("TermAndCondition Test Case Passed");
		Assert.assertEquals("Terms & Condition -redBus.in", driver.getTitle());

		Thread.sleep(2000);
	}

	@Test
	public void privacyPolicysection() throws Throwable {
		extentTest = extent.startTest("Navigate to Privacy Policy page  scenario test");
		sectionInfoPage info = new sectionInfoPage(driver);
		String testcase = "privacyPolicysection";

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		commonUtil.toCheckExecutionRequired(executionRequired);

		info.navitoprivacypolicy();

		logger.info("Info privacyPolicy  Test Case Passed");
		//Assert.assertEquals("redBus Bus Hire", driver.getTitle());
		// Assert.assertEquals("https://www.redbus.in/info/privacypolicy", driver.getTitle());

		Thread.sleep(2000);
	}

	@Test
	public void faqsection() throws Throwable {
		extentTest = extent.startTest("Navigate to FAQ Page  scenario test");
		sectionInfoPage info = new sectionInfoPage(driver);
		String testcase = "faqsection";

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		commonUtil.toCheckExecutionRequired(executionRequired);

		info.navitofaq();

		logger.info("Info FAQ  Test Case Passed");
		Assert.assertEquals("FAQ, Frequently Asked Question-redBus", driver.getTitle());

		Thread.sleep(2000);
	}

	@Test
	public void blogSection() throws Throwable {
		extentTest = extent.startTest("Navigate to Blog Section  scenario test");
		sectionInfoPage info = new sectionInfoPage(driver);
		String testcase = "blogSection";

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		commonUtil.toCheckExecutionRequired(executionRequired);

		info.navitoblog();

		logger.info("Info Blog Section  Test Case Passed");
		Assert.assertEquals("redBus Blog - redBus - Easiest Way to Buy Bus Tickets Online in India", driver.getTitle());

		Thread.sleep(2000);
	}

	@Test
	public void insuranceSection() throws Throwable {
		extentTest = extent.startTest("Navigate to Insurance Section  scenario test");
		sectionInfoPage info = new sectionInfoPage(driver);
		String testcase = "insuranceSection";

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		commonUtil.toCheckExecutionRequired(executionRequired);

		info.navitoinsurance();

		logger.info("Info Insurance Section  Test Case Passed");
		Assert.assertEquals("General Insurance - Buy Insurance Policy Online in India at ICICI Lombard",
				driver.getTitle());
		Thread.sleep(2000);
	}

	@Test
	public void userAgreementSection() throws Throwable {
		extentTest = extent.startTest("Navigate to User Agreement Section  scenario test");
		sectionInfoPage info = new sectionInfoPage(driver);
		String testcase = "useragreementSection";

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		commonUtil.toCheckExecutionRequired(executionRequired);

		info.navitouseragreement();

		logger.info("Info user Agreement Section   Test Case Passed");
		Assert.assertEquals("User Agreement -redBus.in", driver.getTitle());

		Thread.sleep(2000);
	}

	@Test
	public void agentRegistration() throws Throwable {
		extentTest = extent.startTest("Navigate to Agent Registration  scenario test");
		sectionInfoPage info = new sectionInfoPage(driver);
		String testcase = "agentRegistration";

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		commonUtil.toCheckExecutionRequired(executionRequired);

		info.navitoagentRegistration();

		logger.info("Info agentRegistration  Test Case Passed");

		Assert.assertEquals("Seat Seller", driver.getTitle());
		// Assert.assertEquals("User Agreement -redBus.in", driver.getTitle());

		Thread.sleep(2000);
	}
}
