package com.kff.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kff.utilities.Driver;

public class CalculatorPage {

	public CalculatorPage() {
		PageFactory.initElements(Driver.getDriver(), this);

	}

	@FindBy(name="income-type")
	public WebElement incomeAs;
	
	@FindBy(xpath="//select[@name='income-type']/option")
	public WebElement option2018Dollars;
	
	@FindBy(xpath="//select[@name='income-type']/option[2]")
	public WebElement optionpercentOfPoverty;
	
	@FindBy(xpath="//div[@id='hs-eu-cookie-confirmation-inner']/div/a")
	public WebElement cookieAcceptButton;
	
	@FindBy(xpath="//a[@class='facebook']")
	public WebElement facebook;
	
	@FindBy(xpath="//a[@class='twitter']")
	public WebElement twitter ;
	
	@FindBy(xpath="//input[@class='button selected submit']")
	public WebElement twitterLogo;
	
	@FindBy(xpath="//a[@class='email']")
	public WebElement email ;
	
	@FindBy(xpath="//a[@class='linkedin']")
	public WebElement linkedIn ;
	
	@FindBy(className="title li-logo")
	public WebElement linkedInLogo;
	
	@FindBy(xpath="//a[@class='print']")
	public WebElement print;
	
	@FindBy(id="u_0_0")
	public WebElement facebookLoginButton;
	
}
