package com.kff.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kff.utilities.Driver;

public class StatesFactsPage {
WebDriver driver = Driver.getDriver();
	public StatesFactsPage() {
		PageFactory.initElements(driver, this);
	}

	 
			
		  
		@FindBy(xpath="//*[@class=\"datamaps-subunit TX\"]")
		public WebElement Texas;
		
		@FindBy(xpath="//*[@class=\"datamaps-subunit CO\"]")
		public WebElement Colorado;
		
		@FindBy(xpath="//*[@class=\"datamaps-subunit MN\"]")
		public WebElement Minnesota;
		
}
