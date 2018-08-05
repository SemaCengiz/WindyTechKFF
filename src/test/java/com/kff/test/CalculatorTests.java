package com.kff.test;


import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.Driver;

public class CalculatorTests {

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();
	

	
	
// Test Case 1214
	@Ignore
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
	
	
	
	



	@Ignore
@Test
public void accordionMenuTest() throws InterruptedException {
	Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
	
	
	
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
 	
 	
}

//Test Case 1203
	@Ignore
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
	
	
}

//Test Case 1212
	@Ignore
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
	
	calc.cookieAcceptButton.click();
	
	Robot rob= new Robot();
	rob.mouseMove(2000, 1);
	
	
	
	System.out.println(calc.no.isSelected());
	
	
	calc.yesOrNoDropDown.click();
	
	System.out.println(calc.no.isDisplayed());
	
	System.out.println(calc.yes.isDisplayed());
	
	
	
	
}


}
