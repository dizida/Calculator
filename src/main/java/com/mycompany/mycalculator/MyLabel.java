/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mycalculator;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author sarkissian
 */
public class MyLabel extends JLabel{
    
    private String texte;
    
    public MyLabel(String texte, int alignment){
        
        super(texte, alignment);
        this.setUp();
    }
    
    public void changeText(String texte) {
        this.setText(texte);
        
        
}
    private void setUp() {
        setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.BLACK),
    BorderFactory.createEmptyBorder(8, 3, 3, 8)));
    }
    
     
}
