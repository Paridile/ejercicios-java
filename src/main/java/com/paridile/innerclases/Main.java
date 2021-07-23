package com.paridile.innerclases;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prueba clase interna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);        
        JPanel panel = new JPanel();                          
        panel.add(new Button("Haz click"));
        frame.setContentPane(panel);
        frame.setVisible(true);                                
    }


}
