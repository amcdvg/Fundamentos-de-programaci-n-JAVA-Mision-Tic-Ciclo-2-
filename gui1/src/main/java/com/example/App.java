package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JFrame ventanaPrincipal = new JFrame("Mi primer interfaz");
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(500,350);
        JButton boton1 = new JButton("Cancelar");
        ventanaPrincipal.getContentPane().add(boton1);
        ventanaPrincipal.setVisible(true);        
    }
}
