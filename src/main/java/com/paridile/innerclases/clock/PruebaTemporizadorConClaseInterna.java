package com.paridile.innerclases.clock;

import javax.swing.*;


public class PruebaTemporizadorConClaseInterna {

    public static void main(String[] args){


        Reloj mireloj= new Reloj(3000, true);
        mireloj.enMarcha();
        JOptionPane.showMessageDialog(null,"Pulsa aceptar para terminar");
        System.exit(0);
    }
}

