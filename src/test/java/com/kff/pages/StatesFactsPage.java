package com.kff.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kff.utilities.Driver;

public class StatesFactsPage {

	public StatesFactsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath="//div[@class='inner']/ul/li/a")
	public WebElement aboutStateHealthFactsLink;
	
	@FindBy(xpath="//div[@id='hs-eu-cookie-confirmation-inner']/div/a")
	public WebElement cookieAcceptButton;
	
	@FindBy(xpath="//a[@id='hs-eu-confirmation-button']")
	public WebElement cookieAcceptButtonStateFacts;
	
}
