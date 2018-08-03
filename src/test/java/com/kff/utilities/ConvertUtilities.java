package com.kff.utilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertUtilities {

	public static Date convertStringToDate(String string) {

		String newStr = convertStringFormat(string);
		 DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		 Date date1;
		try {
			date1 = df.parse(newStr);
			return date1;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String convertStringFormat(String string) {
		String[] array = string.split(" ");
		String date = "";
		switch(array[0]) {
			case "January":
				date = "01/";
				break;
			case "February":
				date = "02/";
				break;
			case "March":
				date = "03/";
				break;
			case "April":
				date = "04/";
				break;
			case "May":
				date = "05/";
				break;
			case "June":
				date = "06/";
				break;
			case "July":
				date = "07/";
				break;
			case "August":
				date = "08/";
				break;
			case "September":
				date = "09/";
				break;
			case "October":
				date = "10/";
				break;
			case "November":
				date = "11/";
				break;
			case "December":
				date = "12/";
				break;
			default:
				System.out.println("error");
				break;
		}
		if(array[1] != null) {
			date += array[1].replaceAll("[^\\d.]", "");
			date += "/" + array[2];
		}
		return date;
	}
	

}
