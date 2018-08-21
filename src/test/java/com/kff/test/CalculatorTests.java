package com.kff.test;

import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertTrue;

import java.util.List;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.NoSuchElementException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.ConvertUtilities;
import com.kff.utilities.Driver;

public class CalculatorTests extends TestBase {

	
		StatesFactsPage fact = new StatesFactsPage();
		CalculatorPage calc = new CalculatorPage();

		@Test(priority=0)
		public void accordionMenuTest() throws InterruptedException {
			Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));

			extentLogger = report.createTest("Positive accordion Menu Test ");

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
			extentLogger.pass("verify ABOUT THIS TOOL, FREQUENTLY ASKED QUESTIONS, NOTES are dispalyed");
			report.flush();

		}

		// Test Case 1216
				@Test(priority=1)
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

		// Test Case 1203
		@Test(priority=2)
		public void embedInstruction() {
			Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
			extentLogger = report.createTest("Positive embed Instruction test");

			String parent = Driver.getDriver().getWindowHandle();

			calc.embedInstructions.click();
			for (String handle : Driver.getDriver().getWindowHandles()) {
				if (!handle.equalsIgnoreCase(parent)) {
					Driver.getDriver().switchTo().window(handle);
					break;
				}
			}

			String actualTitle = Driver.getDriver().getTitle();
			System.out.println(actualTitle);
			String expectedTitle = "Health Insurance Marketplace Calculator Embed Instructions | The Henry J. Kaiser Family Foundation";

			assertEquals(actualTitle, expectedTitle);
			Driver.getDriver().switchTo().window(parent);

			extentLogger.pass("verify expected title is is displayed");
			report.flush();
		}

		

}
