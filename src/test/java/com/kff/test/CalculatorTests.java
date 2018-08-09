package com.kff.test;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.ConvertUtilities;
import com.kff.utilities.Driver;
//
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalculatorTests {

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();

	// Test Case 1214
	@Test
	public void enterIncomeFunctionality() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/extent-report.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Enter Income Functionality");

		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		calc.cookieAcceptButton.click();
		assertTrue(calc.incomeAs.isEnabled());
		assertTrue(calc.option2018Dollars.isSelected(), "2018 Dollars option is not selected");
		calc.incomeAs.click();
		assertTrue(calc.option2018Dollars.isDisplayed());
		assertTrue(calc.optionpercentOfPoverty.isDisplayed());
		logger.log(Status.INFO, "checking functionality");
		logger.log(Status.PASS, "functinality works");
		logger.pass("Verified log out link displayed");
		extent.flush();
		File screenshotFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File("User/hasanistan/desktop/failure.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Test Case 1216
	@Ignore
	@Test
	public void socialMediaButtonsOnCalculatorPage() throws InterruptedException {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		Driver.getDriver().manage().window().fullscreen();

		calc.facebook.click();
		ConvertUtilities.verifyWindowTitle("Facebook");
		calc.twitter.click();
		ConvertUtilities.verifyWindowTitle("Share a link on Twitter");

		String parent = Driver.getDriver().getWindowHandle();
		calc.linkedIn.click();
		Thread.sleep(2000);
		for (String handle : Driver.getDriver().getWindowHandles()) {
			if (!handle.equalsIgnoreCase(parent)) {
				Driver.getDriver().switchTo().window(handle);
				break;
			}
		}
		assertTrue(Driver.getDriver().getTitle().equals("LinkedIn")
				|| Driver.getDriver().getTitle().equals("Sign Up | LinkedIn"));

		Driver.getDriver().close();
		Driver.getDriver().switchTo().window(parent);

	}

	@Test
	public void accordionMenuTest() throws InterruptedException {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));

		calc.aboutThisToolButton.click();
		String actual = calc.aboutThisToolButton.getText();
		String expected = "ABOUT THIS TOOL";
		assertEquals(actual, expected);

		calc.cookie.click();

		calc.frequentlyAskedQuestionsButton.click();
		String actual1 = calc.frequentlyAskedQuestionsButton.getText();
		String expected1 = "FREQUENTLY ASKED QUESTIONS";

		assertEquals(actual1, expected1);
		calc.notesButton.click();
		String actual2 = calc.notesButton.getText();
		String expected2 = "NOTES";
		assertEquals(actual2, expected2);

	}
}
