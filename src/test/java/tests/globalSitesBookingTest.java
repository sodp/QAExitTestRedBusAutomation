package tests;

import java.util.HashMap;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.globalSiteBookingPage;
import util.Execution;

public class globalSitesBookingTest extends BaseTest {
	private String sheetName = "Global Booking";

	@Test
	public void open_singapore_Booking() throws Throwable {
		extentTest = extent.startTest("Global Site booking Singapore Navigation Scenario test");
		String testcase = "Singapore Booking Page";

		globalSiteBookingPage countrysingapore = new globalSiteBookingPage(driver);
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		Execution.toCheckExecutionRequired(executionRequired);

		countrysingapore.singaporeBooking();


		String page_title = "Singapore Bus tickets online, Singapore Express Bus, Super VIP Coach Booking - redBus";
		logger.info("Global website country  Singapore Test Case Passed");
		Assert.assertEquals(page_title, driver.getTitle());
		Thread.sleep(1000);
	}

	@Test
	public void open_Malaysia_Booking() throws Throwable {
		extentTest = extent.startTest("Global Site Booking of Malaysia Navigation Scenario test");
		String testcase = "Malaysia Booking Page";

		globalSiteBookingPage countrymalaysia = new globalSiteBookingPage(driver);
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		Execution.toCheckExecutionRequired(executionRequired);

		countrymalaysia.MalaysiaBooking();
		String page_title = "Bus Tickets Online, Ferry Booking | Best Online Bus Booking Platform - redBus Malaysia";
		logger.info("Global website country  Malaysia Test Case Passed");
		Assert.assertEquals(page_title, driver.getTitle());
		Thread.sleep(1000);
	}

	@Test
	public void open_indonesia_Booking() throws Throwable {
		extentTest = extent.startTest("Global Site Booking of Indonesia Navigation Scenario test");
		String testcase = "Indonesia Booking Page";

		globalSiteBookingPage countryindonesia = new globalSiteBookingPage(driver);
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		Execution.toCheckExecutionRequired(executionRequired);
		countryindonesia.indonesiaBooking();

		String page_title = "Tiket Bus Online | Pesan Tiket Bus - redBus Indonesia";
		logger.info("Global website country  Indonesia Test Case Passed");
		Assert.assertEquals(page_title, driver.getTitle());
		Thread.sleep(5000);
	}

	@Test
	public void open_peru_Booking() throws Throwable {
		extentTest = extent.startTest("Global Site Booking of Peru Navigation Scenario Test");
		String testcase = "Peru Booking Page";

		globalSiteBookingPage countryperu = new globalSiteBookingPage(driver);
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		Execution.toCheckExecutionRequired(executionRequired);

		countryperu.peruBooking();
		Thread.sleep(1000);
		String page_title = "redBus | La forma más fácil de comprar pasajes de bus";
		logger.info("Global website country Peru Test Case Passed");
		Assert.assertEquals(page_title, driver.getTitle());
		Thread.sleep(1000);
	}

	@Test
	public void open_colombia_Booking() throws Throwable {
		extentTest = extent.startTest("Globally Site Booking of Colombia Navigation Scenario Test");
		String testcase = "Colombia Booking Page";

		globalSiteBookingPage countrycolombia = new globalSiteBookingPage(driver);
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();

		Execution.toCheckExecutionRequired(executionRequired);

		countrycolombia.colombiaBooking();
		String page_title = "Compra Pasajes de Bus Online - redBus Colombia";
		logger.info("Global website country Colombia Test Case Passed");
		Assert.assertEquals(page_title, driver.getTitle());
		Thread.sleep(1000);
	}
}
