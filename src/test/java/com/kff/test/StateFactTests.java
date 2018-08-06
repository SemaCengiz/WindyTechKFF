package com.kff.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.ConvertUtilities;
import com.kff.utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class StateFactTests extends TestBase{

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();

	
// Test Case 1205	
	
	@Test
	public void verifyAboutStateHealthFactsLink() {
		Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
		
		//extentLogger = report.createTest("Positive login test");
		//fact.cookieAcceptButtonStateFacts.click();
		fact.aboutStateHealthFactsLink.click();
		String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle = "About State Health Facts | The Henry J. Kaiser Family Foundation";
		assertEquals(actualTitle, expectedTitle, "About State Health Facts link does not work");
		
		//extentLogger.pass("verify About State Health FactsL ink");
	}
	
// Test case 1224
	
	@Test
	public void newAndUpdatedIndicators() {
		Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
		//extentLogger = report.createTest("Positive login test");
		fact.cookieAcceptButtonStateFacts.click();
		List<String> datesString = new ArrayList<>();
		for(int i =1; i <20; i++) {
			datesString.add( Driver.getDriver().findElement(By.xpath("//div[@class='indicators-list']//ul["+i+"]//div/a/p")).getText() );
		}
		
		List<Date> actualDates = new ArrayList<>();
		for(int i=0; i < datesString.size(); i++) {
			actualDates.add( ConvertUtilities.convertStringToDate( datesString.get(i) ));
		}
		
		List<Date> sortedDates = new ArrayList<>(actualDates);
		Collections.sort(sortedDates);
		Collections.reverse(sortedDates);
		
		assertEquals(actualDates, sortedDates, "Dates are not in descending order");
		//extentLogger.pass("verify About State Health FactsL ink");
	}
		
	
		
   
	@Test
	public void MapTest() throws IOException{
		
		Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
		//extentLogger = report.createTest("Positive login test");
	
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
       // extentLogger.pass("verify About State Health FactsL ink");
	}
	
    //Test case 1219 

    @Test
    public void testcase1219() {
    	
    	extentLogger = report.createTest("Positive login test");
    	
   	 Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
   	 
  	

   	 fact.mainSearchBtnOnKFF.clear();
   	 fact.mainSearchBtnOnKFF.sendKeys("hiv");
   	 fact.searchSubmitBtn.click();
     
   
   	 List<String> searchResults = new ArrayList<>();
   	 for (int i = 1; i < 10; i++) {
   		String test = Driver.getDriver().findElement(By.xpath("//div[@class='box']//section[@class='search-results-wrapper']//article[" +i+ "]//a")).getText();
   		searchResults.add(test);
   	 }
   	 
   	 for(int j=0; j < searchResults.size(); j++) {
   		assertTrue(searchResults.get(j).contains("HIV"),"Search result" + j + "does not include hiv"); 
   		extentLogger.pass("verify About State Health FactsL ink");
   	 }
   	 
    }
}