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

	// 1222
	@FindBy(xpath = "//select[@name='employer-coverage']/option[1]")
	public WebElement isCoverageBtn;

	@FindBy(xpath = "//a[@id='hs-eu-confirmation-button']")
	public WebElement acceptBtn;

	@FindBy(xpath = "//div[@id='hs-eu-cookie-confirmation-inner']/div/a")
	public WebElement cookieAcceptButton;

	@FindBy(name = "income")
	public WebElement houseHoldIncome;

	@FindBy(xpath = "//p[@class='buttons']/input[2]")
	public WebElement submitButton;

	@FindBy(xpath = "//p[@class='form-message']")
	public WebElement warningAfterSubmit;

	@FindBy(name = "income-type")
	public WebElement incomeAs;

	@FindBy(xpath = "//select[@name='income-type']/option")
	public WebElement option2018Dollars;

	@FindBy(xpath = "//select[@name='income-type']/option[2]")
	public WebElement optionpercentOfPoverty;

	@FindBy(linkText = "embed instructions")
	public WebElement embedInstructions;

	@FindBy(xpath = "//select[@name='employer-coverage']")
	public WebElement yesOrNoDropDown;

	@FindBy(xpath = "//select[@name='employer-coverage']/option[contains(text(),'No')]")
	public WebElement no;

	@FindBy(xpath = "//select[@name='employer-coverage']/option[contains(text(),'Yes')]")
	public WebElement yes;

	@FindBy(xpath = "//*[@id=\"subsidy-calculator-new\"]/div[1]/h1")
	public WebElement calcTitle;

	@FindBy(xpath = "//*[@id=\"subsidy-calculator-new\"]/div[3]/div/dl/dt/a[1]/h5")
	public WebElement aboutThisToolButton;

	@FindBy(xpath = "//*[@id=\"subsidy-calculator-new\"]/div[6]/div/dl/dt/a[1]/h5")
	public WebElement notesButton;

	@FindBy(xpath = "//*[@id=\"subsidy-calculator-new\"]/div[7]/div/dl/dt/a[1]/h5")
	public WebElement frequentlyAskedQuestionsButton;

	@FindBy(xpath = "//*[@id=\"hs-eu-confirmation-button\"]")
	public WebElement cookie;

	@FindBy(xpath = "//select[@name='child-count']")
	public WebElement numberOfChildren;

	@FindBy(xpath = "//select[@name='children[0][age]']")
	public WebElement numberOfChildrenAge;

	@FindBy(xpath = "//select[@name='children[0][tobacco]']")
	public WebElement numberOfChildrenTobacco;

	@FindBy(xpath = "//select[@name='children[1][age]']")
	public WebElement numberOfChildrenAge2;

	@FindBy(xpath = "//select[@name='children[1][tobacco]']")
	public WebElement numberOfChildrenTobacco2;

	@FindBy(xpath = "//select[@name='children[2][age]']")
	public WebElement numberOfChildrenAge3;

	@FindBy(xpath = "//select[@name='children[2][tobacco]']")
	public WebElement numberOfChildrenTobacco3;

	@FindBy(xpath = "//p[@class='buttons']/input[1]")
	public WebElement clearButton;

	@FindBy(xpath = "//div [@ class='box full-post beige subsidy-results-wrapper']/h2")
	public WebElement submitResultBox;

	@FindBy(xpath = "//input [@name='income']")
	public WebElement annualIncome;

	@FindBy(xpath = "//select[@id='state-dd']")
	public WebElement selectState;

	@FindBy(xpath = "//input [@name='zip']")
	public WebElement zipCode;

	// Test case 1210 WebElemnts
	@FindBy(name = "income")
	public WebElement householdIncomeButton;

	@FindBy(xpath = "//input[@value='Submit']")
	public WebElement submitBtnOnCalculatorPage;

	@FindBy(xpath = "//h2[text()='Results']")
	public WebElement resultsSection;
	
	@FindBy(xpath="//a[@class='facebook']")
	public WebElement facebook;
	
	@FindBy(xpath="//a[@class='twitter']")
	public WebElement twitter;
	
	@FindBy(xpath="//a[@class='linkedin']")
	public WebElement linkedIn ;

}
