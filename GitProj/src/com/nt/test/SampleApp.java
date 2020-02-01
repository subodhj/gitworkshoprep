package com.nt.test;

import com.nt.test.Math;

public class SampleApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println(new Math().sum(2, 3));
	}// main

}// class
