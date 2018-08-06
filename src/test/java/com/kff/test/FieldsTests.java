package com.kff.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.Driver;
import com.kff.utilities.TestBase;

public class FieldsTests extends TestBase{
	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();
	
	//Test Case 1212
	@Test
	public void householdIncomeNegative() {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		extentLogger = report.createTest("Positive house hold IncomeNegative test");
		calc.cookieAcceptButton.click();
		
		calc.houseHoldIncome.sendKeys("abcde");
		
		calc.submitButton.click();
		
		String actual = calc.warningAfterSubmit.getText();
		String expected = "Please enter a valid income.";
		
		assertEquals(actual, expected);
		extentLogger.pass("verify expected text is displayed");
		
	}
	
	// Test Case 1214
	
		@Test
		public void enterIncomeFunctionality() {
			Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
			extentLogger = report.createTest("Positive enterIncomeFunctionality test");
//			calc.cookieAcceptButton.click();
			assertTrue(calc.incomeAs.isEnabled());
			assertTrue(calc.option2018Dollars.isSelected(), "2018 Dollars option is not selected");
			Select sel = new Select(calc.incomeAs);
		
			assertTrue(calc.option2018Dollars.isDisplayed());
			assertTrue(calc.optionpercentOfPoverty.isDisplayed());	
			extentLogger.pass("verify all the options displayed");

		}
	
		// Test Case 1211
		@Test
		public void householdIncomeNegativeEmpty1() {
			Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
			
			extentLogger = report.createTest("Positive householdIncomeNegativeEmpty1 test");
//			calc.cookieAcceptButton.click();
			calc.houseHoldIncome.sendKeys("");
			calc.submitButton.click();
			String actual = calc.warningAfterSubmit.getText();
			String expected = "Please enter a valid income.";
			assertEquals(actual, expected);
			extentLogger.pass("verify Please enter a valid income. is displayed");
		}

}
