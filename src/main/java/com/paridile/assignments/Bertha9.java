package com.paridile.assignments;

public class Bertha9 {

	static String s = "";

	public static void main(String[] args) {
		int x = 4;
		Boolean y = true;
		short[] sa = { 1, 2, 3 };
		// Entra al constructor Object... o, ya que entra un tipo de dato int y un boolean
		doStuff(x, y); // output: 2
		// Entra al constructor Object o, tiene prieridad frente a Integer...
		doStuff(x); // output: 1
		// Entra al constructor Object... o, ya que entran dos arrays, que se toman como objectos
		doStuff(sa, sa); // output: 2
		
		System.out.println(s);
		// Output: 212
	}

	static void doStuff(Object o) {
		s += "1";
	}

	static void doStuff(Object... o) {
		s += "2";
	}

	static void doStuff(Integer... i) {
		s += "3";
	}

	static void doStuff(Long L) {
		s += "4";
	}
}