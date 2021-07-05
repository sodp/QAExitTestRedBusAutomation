package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.signinPage;
import util.Execution;

public class signinTest extends BaseTest {
	private String sheetName = "Home Page";

	@Test
	public void signinValid() throws Throwable {

		String testName = "Sign In Valid";
		extentTest = extent.startTest("Valid Signin scenario test");
		signinPage usersignin = new signinPage(driver);
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testName);
		//Check Execution Required 
		String executionRequired = testData.get("Execution Required").toLowerCase();
		String mobile = testData.get("Mobile Number");

		Execution.toCheckExecutionRequired(executionRequired);
		usersignin.naviSignin();
		Thread.sleep(1000);
		usersignin.signinButton();
		Thread.sleep(1000);
		usersignin.validSignIn(mobile);
		Thread.sleep(1000);
		logger.info("Valid Signin Test Case Passed");
	}

	@Test
	public void signinInvalid() throws Throwable {

		String testName = "Sign In Invalid";
		extentTest = extent.startTest("Valid Signin scenario test");
		signinPage usersignin = new signinPage(driver);
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testName);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		String mobile = testData.get("Mobile Number");
		Execution.toCheckExecutionRequired(executionRequired);

		usersignin.naviSignin();
		Thread.sleep(1000);
		usersignin.signinButton();
		Thread.sleep(1000);
		usersignin.validSignIn(mobile);
		Thread.sleep(1000);
		logger.info("Invalid Signin Test Case Passed");

	}
}
