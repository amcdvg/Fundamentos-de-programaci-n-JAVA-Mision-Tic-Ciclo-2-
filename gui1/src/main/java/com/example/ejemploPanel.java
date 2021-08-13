package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
import java.util.ArrayList;

public class ejemploPanel extends JFrame {
    
    Container contenedor;
    ArrayList <JButton> listaBotones;
    JPanel panel1, panel2;

    public ejemploPanel(){
        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        panel1 = new JPanel(new GridLayout(3,3));
        listaBotones = new ArrayList<JButton>();
        
        for(int i = 1; i< 10;i++){
            listaBotones.add(new JButton(i+""));
        }
        
        for(JButton boton:listaBotones){
            panel1.add(boton);
        }

        panel2 = new JPanel(new FlowLayout());
        JLabel etiqueta1 = new JLabel("Misiontic");
        JLabel etiqueta2 = new JLabel("2022");
        panel2.add(etiqueta1);
        panel2.add(etiqueta2);

        contenedor.add(panel1, BorderLayout.CENTER);
        contenedor.add(panel2, BorderLayout.SOUTH);

        setSize(500,300);
        setVisible(true);
    }

    public static void main(String args[]){
        ejemploPanel gui = new ejemploPanel();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
