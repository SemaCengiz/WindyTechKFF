package com.kff.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

public class StateFactTests {

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();

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
		
	
		
	
	
	
	
}
