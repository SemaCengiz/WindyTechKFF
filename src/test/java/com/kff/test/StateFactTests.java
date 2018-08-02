package com.kff.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.Driver;

public class StateFactTests {

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();

	@Test
	public void MapTest() throws IOException{
		
		Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
	
	    Actions action = new Actions(Driver.getDriver());
	 
        action.moveToElement(fact.Texas).build().perform();
        
        boolean bool = fact.Texas.isDisplayed();
        
        assertTrue(bool);
        
         action.moveToElement(fact.Colorado).build().perform();
        
        boolean bool1 = fact.Colorado.isDisplayed();
        
        assertTrue(bool);
        
        action.moveToElement(fact.Minnesota).build().perform();
        
        boolean bool3 = fact.Minnesota.isDisplayed();
        
        assertTrue(bool);
        
	
	
	
}
}