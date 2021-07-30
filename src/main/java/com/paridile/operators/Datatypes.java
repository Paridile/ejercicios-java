package com.paridile.operators;

public class Datatypes {
	public static void main(String[] args) {
		Float x = 1.345_45E-5f;
		float y = 1.34545E-5f;
		int xd = 100_123_434;
		double q = -1.234_567E-5; 
		Double d = -1.234_567E-5;		
		System.out.println(q ==  Double.valueOf(Double.parseDouble("-1.234_567E-5")));

	}
}
