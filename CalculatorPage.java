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

	
	@FindBy(xpath= "//*[@id=\"subsidy-calculator-new\"]/div[3]/div/dl/dt/a[1]/h5")
	public WebElement aboutThisToolButton;
	
	
	@FindBy(xpath="//*[@id=\"subsidy-calculator-new\"]/div[6]/div/dl/dt/a[1]/h5")
	public WebElement notesButton;
	
	@FindBy(xpath="//*[@id=\"subsidy-calculator-new\"]/div[7]/div/dl/dt/a[1]/h5")
	public WebElement frequentlyAskedQuestionsButton;
	
	@FindBy(xpath="//*[@id=\"hs-eu-confirmation-button\"]")
	public WebElement cookie;
	
    @FindBy(linkText="embed instructions")
    public WebElement embedInstructions;
    
    @FindBy(name="income")
    public WebElement houseHoldIncome;
    
    @FindBy(xpath = "//p[@class='buttons']/input[2]")
    public WebElement submitButton;
    
    @FindBy(xpath="//p[@class='form-message']")
    public WebElement warningAfterSubmit;
    
    @FindBy(xpath="//select[@name='employer-coverage']")
    public WebElement yesOrNoDropDown;
    
    @FindBy(xpath="//select[@name='employer-coverage']/option[contains(text(),'No')]")
    public WebElement no;
    
    @FindBy(xpath="//select[@name='employer-coverage']/option[contains(text(),'Yes')]")
    public WebElement yes;
    
    @FindBy(xpath="//*[@id=\"subsidy-calculator-new\"]/div[1]/h1")
    public WebElement calcTitle;

}
