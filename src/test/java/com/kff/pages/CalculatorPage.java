package com.kff.pages;

import org.openqa.selenium.support.PageFactory;

import com.kff.utilities.Driver;

public class CalculatorPage {

	public CalculatorPage() {
		PageFactory.initElements(Driver.getDriver(), this);

	}

}
