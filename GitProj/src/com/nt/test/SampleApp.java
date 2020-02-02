package com.nt.test;

import java.util.Locale;
import java.util.*;

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
			System.out.println(l.getDisplayCountry() + " " + l.getDisplayLanguage());
		}
		Date date = new Date();
		System.out.println(date);
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);
		System.out.println("Hai123");
		System.out.println("End");
		System.out.println("End1");
		System.out.println("End-TL");
		System.out.println("Edited by Dev1");
		System.out.println("Edited by TL");
		System.out.println("Edited by Dev2");
		Date date1 = new Date();
		System.out.println(date1);
		Date date2 = new Date();
		System.out.println(date2);
		Calendar calendar1 = new GregorianCalendar();
		System.out.println(calendar1);
		Calendar calendar2 = new GregorianCalendar();
		System.out.println(calendar2);
	}// main

}// class
