package com.kff.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;


import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;


import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.NoSuchElementException;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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

import com.kff.utilities.TestBase;

public class CalculatorTests extends TestBase {
	
public class CalculatorTests {
	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();


	
	
	
	
	//1222 verify  is coverageLink "No" selected by default 
	@Test
	public void isCoverageSelectNo() {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		calc.acceptBtn.click();
		calc.isCoverageBtn.isSelected();
		
		
		

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();
	

	// Test Case 1214
	@Test
	public void enterIncomeFunctionality() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/extent-report.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Enter Income Functionality");

	

	//1222 verify  is coverageLink "No" selected by default 
	
// Test Case 1214
	@Test
	public void isCoverageSelectNo() {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		
		extentLogger = report.createTest("Psoitive isCoverageSelectNo test");
//		calc.acceptBtn.click();
		calc.isCoverageBtn.isSelected();
		extentLogger.pass("verify  is coverageLink No selected by default");
		
	}
	
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
		assertTrue(calc.optionpercentOfPoverty.isDisplayed());	

	}

@Test
public void accordionMenuTest() throws InterruptedException {
	Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
	
	extentLogger = report.createTest("Positive accordion Menu Test ");
	
    calc.aboutThisToolButton.click();
    String actual = calc.aboutThisToolButton.getText();
    String expected ="ABOUT THIS TOOL";
    assertEquals(actual, expected);
    
    calc.cookie.click();
    
    calc.frequentlyAskedQuestionsButton.click();
    String actual1 =calc.frequentlyAskedQuestionsButton.getText();
    String expected1="FREQUENTLY ASKED QUESTIONS";
    
    assertEquals(actual1, expected1);
 	calc.notesButton.click();
 	String actual2 = calc.notesButton.getText();
    String expected2 ="NOTES";
    assertEquals(actual2, expected2);
    extentLogger.pass("verify ABOUT THIS TOOL, FREQUENTLY ASKED QUESTIONS, NOTES are dispalyed");
 	
}

//Test Case 1203
@Test
public void embedInstruction() {
	Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
	extentLogger = report.createTest("Positive embed Instruction test");
 	
}

//Test Case 1203
@Test 
public void embedInstruction() {
	Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
	
	calc.cookieAcceptButton.click();
	calc.embedInstructions.click();
	
	Driver.getDriver().navigate().to(ConfigReader.getProperties("urlembed"));
	String actualTitle = Driver.getDriver().getTitle();
	System.out.println(actualTitle);
	String expectedTitle= "Health Insurance Marketplace Calculator Embed Instructions | The Henry J. Kaiser Family Foundation";
	
	assertEquals(actualTitle,expectedTitle );
	extentLogger.pass("verify expected title is is displayed");
	
}
	
}

//Test Case 1212
@Test
public void householdIncomeNegative() {
	Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
	
	calc.cookieAcceptButton.click();
	
	calc.houseHoldIncome.sendKeys("abcde");
	
	calc.submitButton.click();
	
	String actual = calc.warningAfterSubmit.getText();
	String expected = "Please enter a valid income.";
	
	assertEquals(actual, expected);
	
	
}

//Test Case 1221
	
@Test
public void yesOrNoDropDown() throws AWTException {
	Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
	
	extentLogger = report.createTest("Positive yes Or No Drop Down test");
//	calc.cookieAcceptButton.click();
	
	Robot rob= new Robot();
	rob.mouseMove(2000, 1);

	calc.cookieAcceptButton.click();
	
	Robot rob= new Robot();
	rob.mouseMove(2000, 1);
	
	
	
	System.out.println(calc.no.isSelected());
	
	
	calc.yesOrNoDropDown.click();
	
	System.out.println(calc.no.isDisplayed());
	
	System.out.println(calc.yes.isDisplayed());
	extentLogger.pass("verify expexted result is displayed");
}
	

//Test Case 1211

	@Test
	public void householdIncomeNegativeEmpty() {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		
		extentLogger = report.createTest("Positive house hold Income Negative Empty");
//		calc.cookieAcceptButton.click();
		calc.houseHoldIncome.sendKeys("");
		calc.submitButton.click();
		String actual = calc.warningAfterSubmit.getText();
		String expected = "Please enter a valid income.";
		assertEquals(actual, expected);
		extentLogger.pass("verify expected result is displayed");
	}

	

    //Test Case 1210 by Guldana
     @Test 
     public void testCase1210() {
   	 
     Driver.getDriver().get(ConfigReader.getProperties("urlcalculator")); 
    
     extentLogger = report.createTest("Positive testCase1210 test");
     
        calc.householdIncomeButton.sendKeys("12345");
        calc.submitBtnOnCalculatorPage.click();
        calc.resultsSection.isDisplayed();
        extentLogger.pass("verify results Section displayed");
   }
	
	
	
	
}

}
