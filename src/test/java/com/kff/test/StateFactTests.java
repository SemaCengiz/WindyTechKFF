package com.kff.test;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.Driver;

public class StateFactTests {
	
	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();
	
	
	
	
	
	//1209
	@Test
	
	
	public void SearchBoxTest() {
		Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
		
		fact.searchBox.sendKeys("flu");
		fact.sumbitButton.click();
	}
	
	
	
	//1218
     @Test
	
	public void MapTest() {
		Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
		fact.cookie.click();
		
		fact.CheckIfMapIsVisible.isDisplayed();
		
		fact.Ohio.click();
		String actual = fact.CathandIndisdesplayed.getText();
		String expected = "Ohio: Categories and Indicators";
		assertEquals(actual, expected);
		
		
	  
       
         Driver.getDriver().navigate().back();
       
		fact.Alabama.click();
		String actual1= fact.CathandIndAl.getText();
		String expected1 = "Alabama: Categories and Indicators";
		assertEquals(actual, expected);
		
		 Driver.getDriver().navigate().back();
		fact.NorthCaralina.click();
		String actual2= fact.CatandIndiNorth.getText();
		String expected2 = "North Carolina: Categories and Indicators";
    	assertEquals(actual, expected);	
		
		
	}
	
	}
