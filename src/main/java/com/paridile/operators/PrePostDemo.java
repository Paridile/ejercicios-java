package com.paridile.operators;

//In the following program, explain why the value "6" is printed twice in a row:

class PrePostDemo {

	public static void main(String[] args) {

		int i = 3;
		i++;
		System.out.println(i); // "4"
		++i;
		System.out.println(i); // "5"
		// Here is using the ++ operator in prefix, so the increment is
		// done before the value is printed.
		System.out.println(++i); // "6"
		// Here is using the ++ operator in postfix, so the increment is
		// done after the value is printed.
		System.out.println(i++); // "6"
		System.out.println(i); // "7"

	}

}