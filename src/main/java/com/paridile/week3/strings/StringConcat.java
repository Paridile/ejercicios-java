package com.paridile.week3.strings;

// Show two ways to concatenate the following two strings together to get the string "Hi, mom.":
// String hi = "Hi, ";
// String mom = "mom.";


public class StringConcat {
	public static void main(String[] args) {
		String hi = "Hi, ";
		String mom = "mom.";
		String concat1 = hi + mom;
		String concat2 = hi.concat(mom);
		System.out.println(concat1);
		System.out.println(concat2);
	}
}
