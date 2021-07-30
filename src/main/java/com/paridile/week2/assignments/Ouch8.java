package com.paridile.week2.assignments;

public class Ouch8 {
	static int ouch = 7;

	public static void main(String[] args) {
		new Ouch8().go(ouch);
		System.out.print(" " + ouch);
	}

	void go(int ouch) {
		ouch++;
		// La variable ouch está declarada dos 
		// No compila
		for (int ouch1 = 3; ouch1 < 6; ouch1++)
			;
		System.out.print(" " + ouch);
	}
}


