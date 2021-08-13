package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;

public class ejemplo1 extends JFrame {
    
    Container contenedor;
    JButton boton, boton2;

    public ejemplo1(){

        contenedor = getContentPane();
        /*contenedor.setLayout(new BorderLayout());*/
        /*contenedor.setLayout(new FlowLayout());*/
        contenedor.setLayout(new GridLayout(2,2));

        JLabel etiqueta = new JLabel();
        JLabel etiqueta2 = new JLabel("Misiontic 2020");
        boton = new JButton("Mostrar ejemplo");
        Manejador manejador = new Manejador();
        boton.addActionListener(manejador);
        boton2 = new JButton("Mostrar info");
        boton2.addActionListener(manejador);
        /*contenedor.add(etiqueta, BorderLayout.NORTH);
        contenedor.add(etiqueta2, BorderLayout.SOUTH);*/
        contenedor.add(etiqueta);
        contenedor.add(etiqueta2);
        contenedor.add(boton);
        contenedor.add(boton2);
        setSize(500,300);
        
        setVisible(true);
    }

    public static void main(String args[]){
        ejemplo1 gui = new ejemplo1();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class Manejador implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==boton){
                JOptionPane.showMessageDialog(null, "El boton");
            }else if(e.getSource()==boton2){
                System.out.println("Se activa el segundo boton");
            }
            
            
        }        
        

    }

}
