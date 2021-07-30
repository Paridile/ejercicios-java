package com.paridile.week3.strings;

public class OverridingEquals {
	public static void main(String[] args) {
		Example1 example1 = new Example1(1);
		Example2 example2 = new Example2(1);
		Example1 example3 = new Example2(2);
		System.out.println(example1.equals(example2));
		System.out.println(example2.equals(example3));
	}
}

class Example1 {
	int id;

	Example1(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Example1) {
			Example1 other = (Example1) obj;
			return other.id == id;
		}
		return false;
	}
}

class Example2 extends Example1 {
	public Example2(int id) {
		super(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Example2) {
			Example2 other = (Example2) obj;
			return other.id == id;
		}
		return false;
	}
}