package com.kff.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.Driver;
import java.util.List;

public class StateFactTests {

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();

// Test Case 1205	
	@Test
	public void verifyAboutStateHealthFactsLink() {
		Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
		fact.cookieAcceptButton.click();
		fact.aboutStateHealthFactsLink.click();
		String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle = "About State Health Facts | The Henry J. Kaiser Family Foundation";
		assertEquals(actualTitle, expectedTitle, "About State Health Facts link does not work");
	}

// Test case 1224
	@Test
	public void newAndUpdatedIndicators() {
		Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
		fact.cookieAcceptButton.click();
		List<WebElement> news = Driver.getDriver().findElements(By.xpath("//div[@class='indicators-list']/ul"));
		System.out.println("size of the list" + news.size());
	}
		
		
	
	
	
	
}
