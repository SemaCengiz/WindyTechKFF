package com.kff.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.kff.utilities.ConfigReader;
import com.kff.utilities.Driver;

public class TestPractice {
	
	public static void main(String[] args) {
		
	
	
	Driver.getDriver().get(ConfigReader.getProperties("urlstate"));
    List<WebElement> List = Driver.getDriver().findElements
    		(By.xpath("//ul[@class='top-left-list']/li"));
    
    System.out.println(List.size());
    
    	
	}
	

}
