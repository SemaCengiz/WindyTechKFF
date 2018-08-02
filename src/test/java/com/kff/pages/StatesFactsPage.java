package com.kff.pages;

import org.openqa.selenium.support.PageFactory;

import com.kff.utilities.Driver;

public class StatesFactsPage {

	public StatesFactsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

}
