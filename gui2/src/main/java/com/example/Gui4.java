package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Gui4 extends JFrame{

    Container contenedor; 
    JPanel panel1, panel2;
    JButton boton1, boton2, boton3 , boton4, boton5, boton6,
    boton7, boton8, boton9;
    JLabel etiqueta1, etiqueta2;

    public Gui4(){
        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());

        panel1 = new JPanel(new GridLayout(3,3));
        boton1 = new JButton("1");
        boton2 = new JButton("2");
        boton3 = new JButton("3");
        boton4 = new JButton("4");
        boton5 = new JButton("5");
        boton6 = new JButton("6");
        boton7 = new JButton("7");
        boton8 = new JButton("8");
        boton9 = new JButton("9");
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton3);
        panel1.add(boton4);
        panel1.add(boton5);
        panel1.add(boton6);
        panel1.add(boton7);
        panel1.add(boton8);
        panel1.add(boton9);
        
        contenedor.add(panel1, BorderLayout.CENTER);

        panel2 = new JPanel(new FlowLayout());
        etiqueta1 = new JLabel("Misiontic");
        etiqueta2 = new JLabel("2022");
        panel2.add(etiqueta1);
        panel2.add(etiqueta2);

        contenedor.add(panel2,BorderLayout.SOUTH);

        setSize(500,500);
        setVisible(true);
    }
    
    public static void main(String args []){
        Gui4 gui = new Gui4();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
