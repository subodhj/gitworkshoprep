package com.nt.test;

import java.util.Locale;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

//import com.nt.test.Math;

public class SampleApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		WishGenerator generator = new WishGenerator();
		System.out.println("message-> " + generator.wishMessage("Rama"));
		// System.out.println(new Math().sum(2, 3));
		Locale[] locale = Locale.getAvailableLocales();
		for (Locale l : locale) {
			System.out.println(l.getDisplayCountry()+" : "+l.getDisplayLanguage());
		}
		Date date=new Date();
		System.out.println(date);
		Calendar cal=new GregorianCalendar();
		System.out.println(cal);
		
	}// main

}// class
