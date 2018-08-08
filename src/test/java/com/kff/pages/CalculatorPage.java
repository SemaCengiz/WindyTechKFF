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
		
	@FindBy(xpath= "//*[@id=\"subsidy-calculator-new\"]/div[3]/div/dl/dt/a[1]/h5")
	public WebElement aboutThisToolButton;
		
	@FindBy(xpath="//*[@id=\"subsidy-calculator-new\"]/div[6]/div/dl/dt/a[1]/h5")
	public WebElement notesButton;
	
	@FindBy(xpath="//*[@id=\"subsidy-calculator-new\"]/div[7]/div/dl/dt/a[1]/h5")
	public WebElement frequentlyAskedQuestionsButton;
	
	@FindBy(xpath="//*[@id=\"hs-eu-confirmation-button\"]")
	public WebElement cookie;
	


}
