package com.paridile.strings;

public class TestingBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("He");
		String s = "Hello";
		sb.append("llo");
		System.out.println(s.equals(sb.toString()));

		StringBuilder sb2 = new StringBuilder("Ejemplo 2");
		sb2.setCharAt(0, 'e');
		sb2.insert(0, "Este es el ");
		System.out.println(sb2.toString());

		StringBuilder sb3 = new StringBuilder("Ejemplo 3");
		sb3.delete(0, 3);
		sb3.delete(1, 2);
		sb3.delete(0, 1);
		System.out.println(sb3.toString());

		StringBuilder sb4 = new StringBuilder("Ejemplo 4");
		sb4.deleteCharAt(0);
		sb4.deleteCharAt(sb4.length() - 1);
		System.out.println(sb4.toString());

		StringBuilder sb5 = new StringBuilder("Ejemplo 5");
		sb5.reverse();
		System.out.println(sb5.toString());

		StringBuilder sb6 = new StringBuilder("Ejemplo 6");
		sb6.setCharAt(0, 'a');
		sb6.setCharAt(1, 'b');
		sb6.setCharAt(2, 'c');
		System.out.println(sb6.toString());

		StringBuilder sb7 = new StringBuilder("Ejemplo 7");
		sb7.setLength(4);
		System.out.println(sb7.toString());

	}
}
