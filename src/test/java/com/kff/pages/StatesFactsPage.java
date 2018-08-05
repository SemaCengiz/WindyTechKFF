package com.kff.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kff.utilities.Driver;

public class StatesFactsPage {
	WebDriver driver = Driver.getDriver();
	public StatesFactsPage() {
		PageFactory.initElements(driver,  this);
	}

	
	
	
@FindBy(id= "search-field")
public WebElement searchBox;

@FindBy(id = "search-submit")
public WebElement sumbitButton;

@FindBy(xpath = "//*[name()='svg']/*[name()='g' and @class='datamaps-subunits']")
public WebElement CheckIfMapIsVisible;

@FindBy(id="hs-eu-confirmation-button")
public WebElement cookie;


@FindBy(xpath = "//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit OH']")
public WebElement Ohio;

@FindBy(xpath = "//*[@id=\"state-path-wrapper\"]/div[1]/h2")
public WebElement CathandIndisdesplayed;

@FindBy(xpath = "//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit AL']")
public WebElement Alabama;

@FindBy(xpath = "//*[@id=\"state-path-wrapper\"]/div[1]/h2")
public WebElement CathandIndAl;

@FindBy(xpath = "//*[name()='svg']/*[name()='g']/*[name()='path'  and @class='datamaps-subunit NC']")
public WebElement NorthCaralina;


@FindBy(xpath="//*[@id=\"state-path-wrapper\"]/div[1]/h2")
public WebElement CatandIndiNorth;




}



