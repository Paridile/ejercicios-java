package com.paridile.week4.collections;

import java.util.*;

class Dog implements Comparable<Dog> {
	int size;

	Dog(int s) {
		size = s;
	}
	// TreeSet necesita una implementación de la interfaz Comparable
	// De lo contrario, arrojará una excepción
	@Override
	public int compareTo(Dog o) {
		return size - o.size;
	}
}

public class FirstGrade {
	public static void main(String[] args) {
		TreeSet<Integer> i = new TreeSet<Integer>();
		TreeSet<Dog> d = new TreeSet<Dog>();
		d.add(new Dog(1));
		d.add(new Dog(2));
		d.add(new Dog(1));
		i.add(1);
		i.add(2);
		i.add(1);
		System.out.println(d.size() + " " + i.size());
	}
}