package com.paridile.operators;

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
	}
}
