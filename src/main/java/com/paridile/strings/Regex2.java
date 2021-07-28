package com.paridile.strings;

import java.util.regex.*;

class Regex2 {
	public static void main(String[] args) {
		args[0] = "\\d*";
		args[1] = "ab34ef";
		Pattern p = Pattern.compile(args[0]);
		Matcher m = p.matcher(args[1]);
		boolean b = false;
		while (b = m.find()) {
			System.out.print(m.start() + m.group());
		}
	}
}