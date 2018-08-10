package TestCases;

import org.openqa.selenium.support.ui.Select;


import static org.testng.Assert.assertTrue;

import java.util.List;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.NoSuchElementException;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.kff.pages.CalculatorPage;
import com.kff.pages.StatesFactsPage;
import com.kff.utilities.ConfigReader;
import com.kff.utilities.Driver;
import com.kff.utilities.TestBase;

public class CalculatorTests extends TestBase {
	
public class CalculatorTests {
	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();


	//1222 verify  is coverageLink "No" selected by default 
	@Test
	public void isCoverageSelectNo() {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		calc.acceptBtn.click();
		calc.isCoverageBtn.isSelected();
		
		
		

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();


	//1222 verify  is coverageLink "No" selected by default 
	
// Test Case 1214
	@Test
	public void isCoverageSelectNo() {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		
		extentLogger = report.createTest("Psoitive isCoverageSelectNo test");
//		calc.acceptBtn.click();
		calc.isCoverageBtn.isSelected();
		extentLogger.pass("verify  is coverageLink No selected by default");
		
	}
	
		calc.cookieAcceptButton.click();
		assertTrue(calc.incomeAs.isEnabled());
		assertTrue(calc.option2018Dollars.isSelected(), "2018 Dollars option is not selected");
		calc.incomeAs.click();
		assertTrue(calc.option2018Dollars.isDisplayed());
		assertTrue(calc.optionpercentOfPoverty.isDisplayed());	

	}

@Test // Rukia 1215 
	public void NumberofChildren() {
  Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
	calc.cookieAcceptButton.click();
  Select sel = new Select(calc.numberOfChildren);
	List<WebElement> options = sel.getOptions();
	System.out.println(options.size());  
	assertTrue(options.size()==4); 
	sel.selectByIndex(1); 
	assertTrue(calc.numberOfChildrenAge.isDisplayed(), "Age dropdown menu is not displayed");
	assertTrue(calc.numberOfChildrenTobacco.isDisplayed(), "Tobacco dropdown menu is not displayed");
	sel.selectByIndex(2); 
	assertTrue(calc.numberOfChildrenAge2.isDisplayed(), "Age2 dropdown menu is not displayed");
	assertTrue(calc.numberOfChildrenTobacco2.isDisplayed(), "Tobacco2 dropdown menu is not displayed");
	sel.selectByIndex(3); 
	assertTrue(calc.numberOfChildrenAge3.isDisplayed(), "Age3 dropdown menu is not displayed");
	assertTrue(calc.numberOfChildrenTobacco3.isDisplayed(), "Tobacco3 dropdown menu is not displayed");
}


@Test // Rukia 1206 

public void SelectState() {
  	Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
	Select stateselect= new Select(calc.selectState);
	List<WebElement> stateoptions= stateselect.getOptions();
	System.out.println(stateoptions.size());
	assertTrue(stateoptions.size()==52);
	
	stateselect.selectByVisibleText("Illinois");
	assertTrue(calc.zipCode.isDisplayed(), "Zipcode is not visible");
	calc.zipCode.sendKeys("60640");
}
	
@Test
public void accordionMenuTest() throws InterruptedException {
	Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
	
	extentLogger = report.createTest("Positive accordion Menu Test ");
	
    calc.aboutThisToolButton.click();
    String actual = calc.aboutThisToolButton.getText();
    String expected ="ABOUT THIS TOOL";
    assertEquals(actual, expected);
    
    calc.cookie.click();
    
    calc.frequentlyAskedQuestionsButton.click();
    String actual1 =calc.frequentlyAskedQuestionsButton.getText();
    String expected1="FREQUENTLY ASKED QUESTIONS";
    
    assertEquals(actual1, expected1);
 	calc.notesButton.click();
 	String actual2 = calc.notesButton.getText();
    String expected2 ="NOTES";
    assertEquals(actual2, expected2);
    extentLogger.pass("verify ABOUT THIS TOOL, FREQUENTLY ASKED QUESTIONS, NOTES are dispalyed");
 	
}

//Test Case 1203
@Test
public void embedInstruction() {
	Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
	extentLogger = report.createTest("Positive embed Instruction test");
 	
}

//Test Case 1203
@Test 
public void embedInstruction() {
	calc.embedInstructions.click();
	
	Driver.getDriver().navigate().to(ConfigReader.getProperties("urlembed"));
	String actualTitle = Driver.getDriver().getTitle();
	System.out.println(actualTitle);
	String expectedTitle= "Health Insurance Marketplace Calculator Embed Instructions | The Henry J. Kaiser Family Foundation";
	
	assertEquals(actualTitle,expectedTitle );
	extentLogger.pass("verify expected title is is displayed");
	
}

@Test // Rukia-Abai 1207

public void SelectStateNegative() throws InterruptedException {
	Thread.sleep(2000);
  	Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
	Select stateselect= new Select(calc.selectState);
	List<WebElement> stateoptions= stateselect.getOptions();
	System.out.println(stateoptions.size());
	assertTrue(stateoptions.size()==52);
	
	stateselect.selectByVisibleText("Alabama");
	assertTrue(calc.zipCode.isDisplayed(), "Zipcode is not visible");
	Thread.sleep(2000);
	calc.zipCode.sendKeys("60640");
}
//Test Case 1212
@Test
public void householdIncomeNegative() {
	extentLogger = report.createTest("Positive yes Or No Drop Down test");
//	calc.cookieAcceptButton.click();
	
	Robot rob= new Robot();
	rob.mouseMove(2000, 1);

	calc.cookieAcceptButton.click();
	
	Robot rob= new Robot();
	rob.mouseMove(2000, 1);
	System.out.println(calc.no.isSelected());
	calc.yesOrNoDropDown.click();	
	System.out.println(calc.no.isDisplayed());	
	System.out.println(calc.yes.isDisplayed());
	extentLogger.pass("verify expexted result is displayed");
}


@Test // Rukia 1225
public void ClearSubmit() throws InterruptedException {
	Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
  calc.annualIncome.sendKeys("12345");
	calc.submitButton.click(); 
	Thread.sleep(1000);
	assertTrue(calc.submitResultBox.isDisplayed(), "Submit button is not displayed");

	Thread.sleep(2000);
	calc.annualIncome.clear();
}



//Test Case 1211

	@Test
	public void householdIncomeNegativeEmpty() {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		
		extentLogger = report.createTest("Positive house hold Income Negative Empty");
//		calc.cookieAcceptButton.click();
		calc.houseHoldIncome.sendKeys("");
		calc.submitButton.click();
		String actual = calc.warningAfterSubmit.getText();
		String expected = "Please enter a valid income.";
		assertEquals(actual, expected);
		extentLogger.pass("verify expected result is displayed");
	}

	

    //Test Case 1210 by Guldana
     @Test 
     public void testCase1210() {
   	 
     Driver.getDriver().get(ConfigReader.getProperties("urlcalculator")); 
    
     extentLogger = report.createTest("Positive testCase1210 test");
     
        calc.householdIncomeButton.sendKeys("12345");
        calc.submitBtnOnCalculatorPage.click();
        calc.resultsSection.isDisplayed();
        extentLogger.pass("verify results Section displayed");
   }
	
	
	}

	@Test
	public void clearButtons() {
		Driver.getDriver().get(ConfigReader.getProperties("urlcalculator"));
		calc.annualIncome.sendKeys("12345");
		calc.clearButton.click();
		String actual  = calc.annualIncome.getText();
		String expected = "";
		assertEquals(actual, expected);
	}

}
