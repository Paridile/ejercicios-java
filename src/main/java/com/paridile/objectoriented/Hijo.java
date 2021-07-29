package com.paridile.objectoriented;


public class Hijo extends Padre{
	int sum;

	public Hijo(int num1, int num2) {
		super(num1, num2);
		this.sum = super.calculateSum();
		//this.sum = calculateSum();
	}
	public static void main(String[] args) {
		Hijo hijo = new Hijo(5,6);
				
		System.out.println(hijo.sum);
		
	}
	@Override
	public int calculateSum() {
		return this.num1 - this.num2;
	}
}

class Padre{
	int num1;
	int num2;	
	public Padre(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int calculateSum() {
		return num1 + num2;
	}
}