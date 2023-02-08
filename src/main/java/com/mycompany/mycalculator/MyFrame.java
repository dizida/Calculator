package com.mycompany.mycalculator;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarkissian
 */
public class MyFrame extends JFrame{
    
    private String title;
    private int width;
    private int height;
    
    
    public MyFrame(String title, int width, int height){
        super(title);
        this.width = width;
        this.height = height;
        this.setUpAndDisplay();
        
    }
public void setUpAndDisplay() {
    //font = new FontUIRessource("Arial",font.paint, font.size);
    JPanel myCanvas = new JPanel(new BorderLayout());
    JPanel myCenter = new JPanel(new GridLayout(0, 3));
    JPanel myGridRight = new JPanel(new GridLayout(0, 2));
    MyLabel myScreen = new MyLabel("Please enter your calcul...", 0);

    
    
    MyButton button1 = new MyButton("1", Color.yellow);
    MyButton button2 = new MyButton("2", Color.yellow);
    MyButton button3 = new MyButton("3", Color.yellow);
    MyButton button4 = new MyButton("4", Color.yellow);
    MyButton button5 = new MyButton("5", Color.yellow);
    MyButton button6 = new MyButton("6", Color.yellow);
    MyButton button7 = new MyButton("7", Color.YELLOW);
    
    MyButton buttonC = new MyButton("C", Color.RED);
    MyButton buttonCE = new MyButton("CE", Color.red);
    MyButton buttonPlus = new MyButton("+", Color.red);
    MyButton buttonMinus= new MyButton("-", Color.red);
    MyButton buttonMult= new MyButton("x", Color.red);
    MyButton buttonDiv= new MyButton("/", Color.red);


    myCenter.add(button1);
    myCenter.add(button2);
    myCenter.add(button3);
    myCenter.add(button4);
    myCenter.add(button5);
    myCenter.add(button6);
    myCenter.add(button7);
    
    myGridRight.add(buttonC);
    myGridRight.add(buttonCE);
    myGridRight.add(buttonPlus);
    myGridRight.add(buttonMinus);
    myGridRight.add(buttonMult);
    myGridRight.add(buttonDiv);
   
    myCanvas.add(myCenter,BorderLayout.CENTER);
    myCanvas.add(myGridRight,BorderLayout.EAST);
    myCanvas.add(myScreen,BorderLayout.NORTH);
    button1.addActionListener((b1) -> {
       System.out.println("1");
         
    });

    
    this.add(myCanvas);
    this.setSize(height, width);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setVisible(true);
}
}

