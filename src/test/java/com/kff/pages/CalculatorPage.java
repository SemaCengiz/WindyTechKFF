package com.kff.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kff.utilities.Driver;

public class CalculatorPage {

	public CalculatorPage() {
		PageFactory.initElements(Driver.getDriver(), this);

	}
	
	//1222
	@FindBy(xpath="//select[@name='employer-coverage']/option[1]")
	public WebElement isCoverageBtn;

	@FindBy(xpath="//a[@id='hs-eu-confirmation-button']")
	public WebElement acceptBtn;
	
	
}
