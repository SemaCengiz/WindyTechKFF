package com.kff.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.Driver;

public class FieldsTests extends TestBase{
	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();
	
	// Rukia 1206
	@Test (priority=0)
	public void SelectState() {
		extentLogger = report.createTest("Select state dropdown menu on calculator page");

		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		Select stateselect = new Select(calc.selectState);
		List<WebElement> stateoptions = stateselect.getOptions();
		System.out.println(stateoptions.size());
		assertTrue(stateoptions.size() == 52);

		stateselect.selectByVisibleText("Illinois");
		assertTrue(calc.zipCode.isDisplayed(), "Zipcode is not visible");
		calc.zipCode.sendKeys("60640");
		report.flush();
	}
	// Rukia-Abai 1207
	@Test (priority=1)
	public void SelectStateNegative() throws InterruptedException {
		extentLogger = report.createTest("Select state dropdown menu on calculator page (Negative)");

		Thread.sleep(2000);
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		Select stateselect = new Select(calc.selectState);
		List<WebElement> stateoptions = stateselect.getOptions();
		System.out.println(stateoptions.size());
		assertTrue(stateoptions.size() == 52);

		stateselect.selectByVisibleText("Alabama");
		assertTrue(calc.zipCode.isDisplayed(), "Zipcode is not visible");
		Thread.sleep(2000);
		calc.zipCode.sendKeys("60640");
		report.flush();
	}
	
	// Test Case 1214
		@Test(priority=2)
		public void enterIncomeFunctionality() {
		extentLogger = report.createTest("Testing Income Inequality Dropdown Menu");
			Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
			calc.cookieAcceptButton.click();
			assertTrue(calc.incomeAs.isEnabled());
			assertTrue(calc.option2018Dollars.isSelected(), "2018 Dollars option is not selected");
			calc.incomeAs.click();
			assertTrue(calc.option2018Dollars.isDisplayed());
			assertTrue(calc.optionpercentOfPoverty.isDisplayed());
			report.flush();

		}
	
	//Test Case 1212
	@Test(priority=3)
	public void householdIncomeNegative() {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		extentLogger = report.createTest("Positive house hold IncomeNegative test");
	//	calc.cookieAcceptButton.click();
		
		calc.houseHoldIncome.sendKeys("abcde");
		
		calc.submitButton.click();
		
		String actual = calc.warningAfterSubmit.getText();
		String expected = "Please enter a valid income.";
		
		assertEquals(actual, expected);
		extentLogger.pass("verify expected text is displayed");
		
	}
	
	@Test(priority=4)
	public void householdIncomeFieldEmpty() {

		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));

		extentLogger = report.createTest("Testing submission while Household Income field empty");

		calc.householdIncomeButton.sendKeys("12345");
		calc.submitBtnOnCalculatorPage.click();
		calc.resultsSection.isDisplayed();
		extentLogger.pass("verify results Section displayed");
		report.flush();
	}

		// Test Case 1211
		@Test(priority=5)
		public void householdIncomeNegativeEmpty() {
			Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
			
			extentLogger = report.createTest("Positive householdIncomeNegativeEmpty1 test");
//			calc.cookieAcceptButton.click();
			calc.houseHoldIncome.sendKeys("");
			calc.submitButton.click();
			String actual = calc.warningAfterSubmit.getText();
			String expected = "Please enter a valid income.";
			assertEquals(actual, expected);
			extentLogger.pass("verify Please enter a valid income. is displayed");
		}
		
		// Test Case 1214
		@Test(priority=6)
		public void isCoverageSelectNo() {
			Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));

			extentLogger = report.createTest("Positive isCoverageSelectNo test");
			// calc.acceptBtn.click();
			calc.isCoverageBtn.isSelected();

			System.out.println(calc.no.isSelected());
			calc.yesOrNoDropDown.click();
			System.out.println(calc.no.isDisplayed());
			System.out.println(calc.yes.isDisplayed());
			extentLogger.pass("verify expexted result is displayed");
			report.flush();

		}
		// Rukia 1215
		@Test (priority=7)
		public void NumberofChildren() {
			extentLogger = report.createTest("Number of Children Field");

			Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		//	calc.cookieAcceptButton.click();
			Select sel = new Select(calc.numberOfChildren);
			List<WebElement> options = sel.getOptions();
			System.out.println(options.size());
			assertTrue(options.size() == 4);
			sel.selectByIndex(1);
			assertTrue(calc.numberOfChildrenAge.isDisplayed(), "Age dropdown menu is not displayed");
			assertTrue(calc.numberOfChildrenTobacco.isDisplayed(), "Tobacco dropdown menu is not displayed");
			sel.selectByIndex(2);
			assertTrue(calc.numberOfChildrenAge2.isDisplayed(), "Age2 dropdown menu is not displayed");
			assertTrue(calc.numberOfChildrenTobacco2.isDisplayed(), "Tobacco2 dropdown menu is not displayed");
			sel.selectByIndex(3);
			assertTrue(calc.numberOfChildrenAge3.isDisplayed(), "Age3 dropdown menu is not displayed");
			assertTrue(calc.numberOfChildrenTobacco3.isDisplayed(), "Tobacco3 dropdown menu is not displayed");
			report.flush();
		}
		
		
		// Rukia 1225
		@Test 
		public void ClearSubmit() throws InterruptedException {
			extentLogger = report.createTest("Positive yes Or No Drop Down test");

			Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
			calc.annualIncome.sendKeys("12345");
			calc.submitButton.click();
			Thread.sleep(1000);
			assertTrue(calc.submitResultBox.isDisplayed(), "Submit button is not displayed");

			Thread.sleep(2000);
			calc.annualIncome.clear();
			report.flush();
		}

		// Test Case 1210 by Guldana
	@Test (priority=9)
	public void clearButtons() {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		calc.annualIncome.sendKeys("12345");
		calc.clearButton.click();
		String actual = calc.annualIncome.getText();
		String expected = "";
		assertEquals(actual, expected);

	}

}
