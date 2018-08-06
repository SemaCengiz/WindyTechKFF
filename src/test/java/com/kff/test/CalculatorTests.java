package com.kff.test;


import static org.testng.Assert.assertTrue;

import java.util.List;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.Driver;

public class CalculatorTests extends TestBase {
	

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();

	

// Test Case 1214
	@Test
	public void enterIncomeFunctionality() {
		
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		
		extentLogger = report.createTest("Positive login test");
		
		extentLogger = report.createTest("Positive login test");
		calc.cookieAcceptButton.click();
		assertTrue(calc.incomeAs.isEnabled());
		assertTrue(calc.option2018Dollars.isSelected(), "2018 Dollars option is not selected");
		calc.incomeAs.click();
		assertTrue(calc.option2018Dollars.isDisplayed());
		assertTrue(calc.optionpercentOfPoverty.isDisplayed());	
		 extentLogger.pass("verify About State Health FactsL ink");
	}
	
	

@Test
public void accordionMenuTest() throws InterruptedException {
	Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
	
	extentLogger = report.createTest("Positive login test");
	
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
    extentLogger.pass("verify About State Health FactsL ink");
    
}
    //Test Case 1210 by Guldana
     @Test 
     public void testCase1210() {
   	 
     Driver.getDriver().get(ConfigReader.getProperties("urlcalculator")); 
    
     extentLogger = report.createTest("Positive login test");
     
        calc.householdIncomeButton.sendKeys("12345");
        calc.submitBtnOnCalculatorPage.click();
        calc.resultsSection.isDisplayed();
        extentLogger.pass("verify About State Health FactsL ink");
   }

}
