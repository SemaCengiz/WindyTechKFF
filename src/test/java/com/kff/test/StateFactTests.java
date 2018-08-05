package com.kff.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.Driver;

public class StateFactTests {

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();
	
	
	
	 //verifythe ListLink  1213
@Ignore
	@Test
	public void verifyStateHealthFactsLink() throws InterruptedException {
		Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
		fact.acceptBtnCookie.click();
		String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle = "State Health Facts | The Henry J. Kaiser Family Foundation";
		assertEquals(actualTitle, expectedTitle, "State Health Facts does not working ");
		Assert.assertTrue(fact.ChooseCategoryText.isDisplayed());
		
    List<WebElement> List = Driver.getDriver().findElements
    		(By.xpath("//div[@id='top-left-categories']//li/a"));
    System.out.println(List.size());
        for (int i = 0; i < List.size(); i++) {
      	if (List.equals(List.get(i))){
    		assertTrue(List.get(i).isDisplayed());
    		
    	}
        }
        }
	
  
	//1204 Select State Btn
	
    	@Test()
    	public void SelectStateBtn() {
    	Driver.getDriver().get(ConfigReader.getProperties("urlstate"));	
    	String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle = "State Health Facts | The Henry J. Kaiser Family Foundation";
		assertEquals(actualTitle, expectedTitle, "State Health Facts does not working ");
//		fact.StateSelectBtn.click();
    	List<WebElement> selectBtn = Driver.getDriver().findElements
    			(By.xpath("//select[@class='geo-picker']"));
    	selectBtn.remove(0);
    	List<String> actualStates = new ArrayList<>();
    	for(int i = 0; i < selectBtn.size(); i++) {
    		actualStates.add(selectBtn.get(i).getText());
    	}
    	List<String> expectedStates = new ArrayList<>(actualStates);
    	Collections.sort(expectedStates);
    	System.out.println(expectedStates);
    	
    Assert.assertEquals(actualStates, expectedStates,"They are alphabetical order");
    
    	Select select = new Select(fact.stateSelectBtn);
    	select.selectByValue("TX");
    	String expectedStateTitle="Texas: Categories and Indicators";
    	String actualStateTitle = fact.statePageTitle.getText();
    	assertEquals(actualStateTitle,expectedStateTitle,"texas Page is not loaded");
    	Driver.getDriver().navigate().back();
    	
    	select.selectByValue("VA");
    	expectedStateTitle="Virginia: Categories and Indicators";
    	actualStateTitle= fact.statePageTitle.getText();
    	assertEquals(actualStateTitle,expectedStateTitle,"Virginia Page is not loaded");
    	Driver.getDriver().navigate().back();

    	select.selectByValue("AL");
    	expectedStateTitle="Alabama: Categories and Indicators";
    	actualStateTitle= fact.statePageTitle.getText();
    	assertEquals(actualStateTitle,expectedStateTitle,"Alabama Page is not loaded");
//    	
//    	
//    	
//    	
    	
    	
//    	for (int i = 0; i <selectBtn.size(); i++) {
//    		String Btn=(selectBtn.get(i).getText());
//    		System.out.println(Btn.toString());
//    		if (selectBtn.equals(Btn)) {
//    		   
//    			selectBtn.get(i).click();
    		}
    	
		}
    		
    	
    	
  
    	

    	


