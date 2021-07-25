package com.paridile.operators;

//Given the following program, overrides the equals method to get the output:
//false
//true

class Person {
}

class Student {

	int id;

	Student(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Student) {
			Student student = (Student) obj;
			result = student.id == this.id;
		}
		return result;
	}

}

public class Test {
	public static void main(String[] args) {

		Person p = new Person();
		Student s1 = new Student(1001);
		Student s2 = new Student(1001);
		System.out.println(s1.equals(p));
		System.out.println(s1.equals(s2));

	}

}