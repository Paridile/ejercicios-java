package com.paridile.assignments;

class Fizz {
    int x = 5;
    public static void main(String[] args) {
        final Fizz f1 = new Fizz();
        Fizz f2 = new Fizz();
        Fizz f3 = FizzSwitch(f1, f2);
        System.out.println((f1 == f3) + " " + (f1.x == f3.x));
    }

    static Fizz FizzSwitch(Fizz x, Fizz y) {
        // El objeto z apunta a la misma dirección de memoria que el objeto orignal
        final Fizz z = x;
        // Al apuntar a la misma dirección, se edita el valor de ambos objetos
        z.x = 6;
        return z;
    }
}