package com.kff.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kff.utilities.Driver;

public class CalculatorPage {
	WebDriver driver = Driver.getDriver();
	public CalculatorPage() {
		PageFactory.initElements(driver, this);
	}

		

	
	@FindBy(xpath= "//*[@id=\"subsidy-calculator-new\"]/div[3]/div/dl/dt/a[1]/h5")
	public WebElement aboutThisToolButton;
	
	
	@FindBy(xpath="//*[@id=\"subsidy-calculator-new\"]/div[6]/div/dl/dt/a[1]/h5")
	public WebElement notesButton;
	
	@FindBy(xpath="//*[@id=\"subsidy-calculator-new\"]/div[7]/div/dl/dt/a[1]/h5")
	public WebElement frequentlyAskedQuestionsButton;
	
	@FindBy(xpath="//*[@id=\"hs-eu-confirmation-button\"]")
	public WebElement cookie;
	

}
