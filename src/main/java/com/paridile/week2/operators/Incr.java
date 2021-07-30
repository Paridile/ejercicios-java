package com.paridile.week2.operators;

// Place the fragments into the code to produce the output 33. Note you must
// use each fragment exactly one

public class Incr {
	public static void main(String[] args) {
		Integer x = 7;
		int y = 2;
			 x   *=   x;
		// ____ ____ ____,
			 y   *=   y;
		// ____ ____ ____,
			 y   *=   y;
		// ____ ____ ____,
			 x   -=   y;
		// ____ ____ ____,
		System.out.println(x);
	}
}

// +----+----+----+----+
// | y  | y  | y  | y  |
// +----+----+----+----+
// | y  | x  | x  |    |
// +----+----+----+----+
// | -= | *= | *= | *= |
// +----+----+----+----+
