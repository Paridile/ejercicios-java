package com.paridile.innerclases;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton {
    public Button(String text) {
        super(text);
        addActionListener(new ButtonClicked());
    }


    private class ButtonClicked implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            btnClick();
        }
        private void btnClick() {
            System.out.println("Button clicked");
        }
        
    }



}
