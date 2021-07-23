package com.paridile.objectoriented;

public class Redwood extends Tree {
    public static void main(String[] args) {
        new Redwood().go();
    }

    void go() {
        go2(new Tree(), new Redwood());
        //go2((Redwood) new Tree(), new Redwood());
    }

    void go2(Tree t1, Redwood r1) {
        // No se puede hacer un cast directo de Tree a Redwood
        //Redwood r2 = (Redwood) t1;
        Tree t2 = (Tree) r1;
    }
}

class Tree {
}