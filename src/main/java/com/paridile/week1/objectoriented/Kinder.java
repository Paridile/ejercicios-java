package com.paridile.week1.objectoriented;

class AgedP {
// agedP     (     )       {      }   
// ______ ______ ______ ______ ______

    AgedP() {

    }
    public AgedP(int x) {
// ______ ______ ______ ______ ______
    }

}
   public class Kinder extends AgedP {
// ______ ______ ______ ______ ______
    public Kinder(int x) {
//  super        
// ______ ______ ______ ______ ______ ();
        super();
    }

}

/*
    +=======+=======+======+=====+
    | AgedP | super | this |     |
    +-------+-------+------+-----+
    | (     | )     |  {   |   } |
    +-------+-------+------+-----+
    | ;     |       |      |     |
    +-------+-------+------+-----+
*/