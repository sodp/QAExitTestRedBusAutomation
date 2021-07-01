package util;

import org.testng.SkipException;

import tests.BaseTest;

public class commonUtil extends BaseTest {

	public static void toCheckExecutionRequired(String executionRequired) {
		// if execution required field is no
		if (executionRequired.equals("no")) {
			throw new SkipException("Skipping this exception");
		} // if execution required field is empty
		if (executionRequired.equals("")) {

			throw new SkipException("Skipping this exception");
		}
	}
}
