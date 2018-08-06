package TestCases;

import static org.testng.Assert.assertTrue;

import java.util.List;

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

public class CalculatorTests {

	StatesFactsPage fact = new StatesFactsPage();
	CalculatorPage calc = new CalculatorPage();



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
