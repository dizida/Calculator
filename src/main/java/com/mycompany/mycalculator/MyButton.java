/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mycalculator;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author sarkissian
 */



public class MyButton extends JButton {
    
     Color color;
     
     
     public MyButton(String text, Color color) {
         this.color = color;
         this.setText(text);
         this.setUp();
     }
     

     public MyButton() {
         this("My button", null);
     }

     public MyButton(String text) {
         this(text, null);
     }

     public MyButton(Color color) {
         this("My button", color);
     }
     
      private void setUp() {
         this.setBackground(this.color);
         this.setOpaque(true);
     }
      

     

    
 }
    

