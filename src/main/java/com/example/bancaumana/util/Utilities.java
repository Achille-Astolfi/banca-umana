package com.example.bancaumana.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
	private Utilities() {}
	
	public static Date parseDatabaseDate(String dataDb) {
		Date date = new Date();  
		try {
			date=new SimpleDateFormat("yyyyMMdd").parse(dataDb);
		} catch (ParseException e) {
			System.err.println("DataFormat error");
			e.printStackTrace();
		}  
		return date;
	}
}
