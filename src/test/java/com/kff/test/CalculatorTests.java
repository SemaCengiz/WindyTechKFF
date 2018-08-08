package com.kff.test;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.ConvertUtilities;
import com.kff.utilities.Driver;

public class CalculatorTests{

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();

	
	
// Test Case 1214
	@Ignore
	@Test
	public void enterIncomeFunctionality() {
		// name of the test
		//extentLogger = report.createTest("Positive login test");
				// info ()  --> to print a message
		//extentLogger.info("entering user credentials");
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		calc.cookieAcceptButton.click();
		assertTrue(calc.incomeAs.isEnabled());
		assertTrue(calc.option2018Dollars.isSelected(), "2018 Dollars option is not selected");
		calc.incomeAs.click();
		assertTrue(calc.option2018Dollars.isDisplayed());
		assertTrue(calc.optionpercentOfPoverty.isDisplayed());	
		//extentLogger.pass("Verified log out link displayed");
	}
	
	
	
// Test Case 1216
	@Test
	public void socialMediaButtonsOnCalculatorPage() throws InterruptedException {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		Driver.getDriver().manage().window().fullscreen();
	    
	    calc.facebook.click();
	    ConvertUtilities.verifyWindowTitle("Facebook");
	    calc.twitter.click();
	    ConvertUtilities.verifyWindowTitle("Share a link on Twitter");
	    
	    String parent= Driver.getDriver().getWindowHandle();
	    calc.linkedIn.click();
		Thread.sleep(2000);
		for(String handle: Driver.getDriver().getWindowHandles()) {
			if(!handle.equalsIgnoreCase(parent)) {
				Driver.getDriver().switchTo().window(handle);
				break;
			}
		}
		assertTrue(Driver.getDriver().getTitle().equals("LinkedIn") || Driver.getDriver().getTitle().equals("Sign Up | LinkedIn"));
	
		Driver.getDriver().close();
		Driver.getDriver().switchTo().window(parent);
	    
	    
	    
	    //ConvertUtilities. verifyWindowTitle("LinkedIn");
	   
	}




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
}
