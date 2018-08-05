package com.kff.test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Ignore;

import static org.testng.Assert.assertTrue;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;

import com.kff.utilities.Driver;


import com.kff.utilities.ConvertUtilities;
import com.kff.utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class StateFactTests {

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();

	
	
	
	 //verifythe ListLink  1213

	@Test
	public void verifyStateHealthFactsLink() throws InterruptedException {
		Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
		fact.acceptBtnCookie.click();
		String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle = "State Health Facts | The Henry J. Kaiser Family Foundation";
		assertEquals(actualTitle, expectedTitle, "State Health Facts does not working ");
		Assert.assertTrue(fact.ChooseCategoryText.isDisplayed());
		
    List<WebElement> List = Driver.getDriver().findElements
    		(By.xpath("//div[@id='top-left-categories']//li/a"));
    System.out.println(List.size());
        for (int i = 0; i < List.size(); i++) {
      	if (List.equals(List.get(i))){
    		assertTrue(List.get(i).isDisplayed());
    		
    	}
        }
        }
	
  
	//1204 Select State Btn
	
    	@Test()
    	public void SelectStateBtn() {
    	Driver.getDriver().get(ConfigReader.getProperties("urlstate"));	
    	String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle = "State Health Facts | The Henry J. Kaiser Family Foundation";
		assertEquals(actualTitle, expectedTitle, "State Health Facts does not working ");
//		fact.StateSelectBtn.click();
    	List<WebElement> selectBtn = Driver.getDriver().findElements
    			(By.xpath("//select[@class='geo-picker']"));
    	selectBtn.remove(0);
    	List<String> actualStates = new ArrayList<>();
    	for(int i = 0; i < selectBtn.size(); i++) {
    		actualStates.add(selectBtn.get(i).getText());
    	}
    	List<String> expectedStates = new ArrayList<>(actualStates);
    	Collections.sort(expectedStates);
    	System.out.println(expectedStates);
    	
    Assert.assertEquals(actualStates, expectedStates,"They are alphabetical order");
    
    	Select select = new Select(fact.stateSelectBtn);
    	select.selectByValue("TX");
    	String expectedStateTitle="Texas: Categories and Indicators";
    	String actualStateTitle = fact.statePageTitle.getText();
    	assertEquals(actualStateTitle,expectedStateTitle,"texas Page is not loaded");
    	Driver.getDriver().navigate().back();
    	
    	select.selectByValue("VA");
    	expectedStateTitle="Virginia: Categories and Indicators";
    	actualStateTitle= fact.statePageTitle.getText();
    	assertEquals(actualStateTitle,expectedStateTitle,"Virginia Page is not loaded");
    	Driver.getDriver().navigate().back();

    	select.selectByValue("AL");
    	expectedStateTitle="Alabama: Categories and Indicators";
    	actualStateTitle= fact.statePageTitle.getText();
    	assertEquals(actualStateTitle,expectedStateTitle,"Alabama Page is not loaded");

    		}
    	
		}
    		
    	
    	
  
    	

    	





// Test Case 1205	
	@Test
	public void verifyAboutStateHealthFactsLink() {
		Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
		//fact.cookieAcceptButtonStateFacts.click();
		fact.aboutStateHealthFactsLink.click();
		String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle = "About State Health Facts | The Henry J. Kaiser Family Foundation";
		assertEquals(actualTitle, expectedTitle, "About State Health Facts link does not work");
	}

// Test case 1224
	@Test
	public void newAndUpdatedIndicators() {
		Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
		
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
		
	}
		
	
		

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

