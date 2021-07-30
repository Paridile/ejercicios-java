package com.paridile.week1.objectoriented;

public class Bottom2 extends Top {
    
    /*  
        ERROR -> No se esta referenciando el constructor con 
        el parametro String, por ello lo toma como super() pero
        no existe el constructor vacio.
    */
    public Bottom2(String s) {
        super("");
    }

    public static void main(String[] args) {
        new Bottom2("c");
        System.out.println(" ");
    }
    
}


class Top {   
    public Top(String s) {
        System.out.println("B");
    }    
}
