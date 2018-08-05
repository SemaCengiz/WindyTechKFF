package com.kff.test;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.Driver;

public class CalculatorTests {
	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();

	
	
	
	
	//1222 verify  is coverageLink "No" selected by default 
	@Test
	public void isCoverageSelectNo() {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		calc.acceptBtn.click();
		calc.isCoverageBtn.isSelected();
		
		
		
	}
	
	
	
}
