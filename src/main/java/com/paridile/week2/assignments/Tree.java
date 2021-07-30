package com.paridile.week2.assignments;

interface Vessel {
}

interface Toy {
}

class Boat implements Vessel {
}

class Speedboat extends Boat implements Toy {

}

public class Tree {
    public static void main(String[] args) {
        String s = "0";
        System.out.println("esto es un ejemplo de una cadena");
        Boat b = new Boat();
        Boat b2 = new Speedboat();
        Speedboat s2 = new Speedboat();
        // Boat hereda de Vessel, Speedboat hereda de Boat e implementa Toy, por lo que
        // ambas condiciones son verdaderas
        if ((b instanceof Vessel) && (b2 instanceof Toy))
            s += "1";
        // Speedboat hereda de Boat, e implementa Toy, por lo que la condicion es
        // verdadera
        if ((s2 instanceof Vessel) && (s2 instanceof Toy))
            s += "2";
        System.out.println(s);
        // S = 012
    }
}