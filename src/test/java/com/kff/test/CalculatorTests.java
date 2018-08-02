package com.kff.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.Driver;

public class CalculatorTests {

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();
	
	
// Test Case 1214
	@Test
	public void enterIncomeFunctionality() {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		calc.cookieAcceptButton.click();
		assertTrue(calc.incomeAs.isEnabled());
		assertTrue(calc.option2018Dollars.isSelected(), "2018 Dollars option is not selected");
		calc.incomeAs.click();
		assertTrue(calc.option2018Dollars.isDisplayed());
		assertTrue(calc.optionpercentOfPoverty.isDisplayed());	
	}
	
	
	
	
}
