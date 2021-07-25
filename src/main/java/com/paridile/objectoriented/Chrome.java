package com.paridile.objectoriented;

class X {
    void do1() {
    }
}

class Y extends X {
    void do2() {
    }
}

class Chrome {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        // En este caso es necesario usar parentesis que envuelvan a la instancia
        // para que el cast sea efectivo
        ((Y) x2).do2();
    }
}
