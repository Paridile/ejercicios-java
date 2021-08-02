package com.paridile.week4.generics;

public class SimpleGeneric<T> {
	T ejemplo;

	public SimpleGeneric(T ejemplo) {
		this.ejemplo = ejemplo;
	}

	public T getEjemplo() {
		return ejemplo;
	}

	public void setEjemplo(T ejemplo) {
		this.ejemplo = ejemplo;
	}
	
	public void print() {
		System.out.println("-> " + ejemplo.getClass().getSimpleName() + ": " + ejemplo);
	}	
	public static void main(String[] args) {
		SimpleGeneric<String> sg = new SimpleGeneric<String>("Hola");
		SimpleGeneric<Integer> si = new SimpleGeneric<Integer>(1);
		SimpleGeneric<Double> sd = new SimpleGeneric<Double>(1.0);		
		sg.print();
		si.print();
		sd.print();
	}
}
