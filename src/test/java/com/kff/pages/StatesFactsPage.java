package com.kff.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kff.utilities.Driver;

public class StatesFactsPage {

	public StatesFactsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	
	//1213
	@FindBy(xpath="//ul[@class='top-left-list']/li")
	public WebElement ChooseCategLink;
	
	 @FindBy(xpath="//div[@class='box light-blue']/h1")
	    public WebElement ChooseCategoryText;
	
	//1204
	@FindBy(xpath ="//select[@name='geo-picker']")
	public WebElement stateSelectBtn;
	
   @FindBy(xpath="//a[@id='hs-eu-confirmation-button']")
   public WebElement acceptBtnCookie;

   
   @FindBy(xpath="//div[@class='box']//h2")
   public WebElement statePageTitle;

//   @FindBy(xpath ="//select[@class='geo-picker']//option[2]")
//	public WebElement stateSelectBtn2;
   




}