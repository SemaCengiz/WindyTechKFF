package com.kff.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cbt.utilities.Driver;

//import com.cbt.utilities.Driver;

public class BrowserUtils {
	public static String getScreenshot(String name) throws IOException {
		// name the screenshot with the current date time to avoid duplicate name
		String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		// TakesScreenshot ---> interface from selenium which takes screenshots
		TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
		File source = ts.getScreenshotAs(OutputType.FILE);
		// full path to the screenshot location
		String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";

		File finalDestination = new File(target);
		
		// save the screenshot to the path given
		FileUtils.copyFile(source, finalDestination);
		return target;
	}
	
	public static void switchToWindow(String targetTitle) {
		String origin = Driver.getDriver().getWindowHandle();
		for (String handle : Driver.getDriver().getWindowHandles()) {
			Driver.getDriver().switchTo().window(handle);
			if (Driver.getDriver().getTitle().equals(targetTitle)) {
				return;
			}
		}
		Driver.getDriver().switchTo().window(origin);
	}
}
