package com.paridile.week2.assignments;

public class Temp {
	public static void main(String[] args) {
		int b = 1010;
		int b1= 0101;
		int a = ~(b|b1)&b^b1|b&b1;
		System.out.println(a);
	}
}
