package com.paridile.week2.operators;

public class FormattedNumbers {
	public static void main(String[] args) {
		double a = -1.234_567E-5;
		double b = 1.234_567e-5;
		String s = a*b+"";
		String[] sArr = s.split("E");
		double test = Double.parseDouble(a+"");
		System.out.println(test);
		Double test2 = Double.valueOf(a);
		System.out.println(test2);				
		double total = Double.parseDouble(sArr[0])*Math.pow(10, Double.parseDouble(sArr[1]));
		total *= Math.pow(10,9);
		System.out.println(total);

		double a2 = 1000000.123456;
		System.out.println(String.format("%,4.2f", a2));		
		System.out.println(Math.floor(a2));
		System.out.println(Math.round(a2));
		System.out.println(Math.ceil(a2));
		int i = 123456;
		System.out.println(String.format("%,d", i));



	}
}
