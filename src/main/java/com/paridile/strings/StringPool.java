package com.paridile.strings;

public class StringPool {
	public static void main(String[] args) {
		String s = new String("Hello");
		String ss = "Hello";
		String sss = ss.intern();
		System.out.println(sss == "Hello");
		String s1 = "Hello";
		s1 = s1.concat(" 1");
		String s2 = "Hello 1";
		System.out.println(s1.equals(s2));
		System.out.println("\rHola");
		System.out.println("Hola2\rkjb");
		String s3 = "\tHo\tla\t";
		System.out.println(s3);
		s3 = s3.trim();
		System.out.println(s3);
		s3 = s3.replace("\t", "");
		System.out.println(s3);
		String abc = "";
		for (char i = 'a'; i <= 'z'; i++) {
			abc += i;
		}
		System.out.println(abc);
		abc = "";
		for (char i = 0; i <= 255; i++) {
			abc += i;
		}
		System.out.println(abc);
		for (char i = 'A'; i <= 'z'; i++) {
			System.out.print(i + " ");
			i = i == 'Z' ? 'a' - 1 : i;
		}
		String ex1 = "Hello";
		ex1 = ex1.substring(2);
		System.out.println(ex1);
	}
}
