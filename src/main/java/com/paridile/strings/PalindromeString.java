package com.paridile.strings;

public class PalindromeString {
	public static void main(String[] args) {
		String s = "Anita lava la tina";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}
		s = s.trim().replace(" ", "");
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString().equalsIgnoreCase(s);
	}

	public strictfp static boolean asd(char[] s) {
		return s.length % 2 == 0;
	}
}
