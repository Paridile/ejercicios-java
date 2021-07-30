package com.paridile.week3.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		String regex = "[A-Za-z][A-Za-z0-9|_-]*@(gmail|hotmail).[A-Za-z]*.?[A-Za-z]*";
		String email = "ejemplO_123@gmail.com";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			System.out.println("La cadena: " + matcher.group() + " es una dirección de correo válida");
		} else {
			System.out.println("No es una direccion de correo valida");
		}
	}
}
