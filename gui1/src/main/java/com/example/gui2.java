package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;

public class gui2 {
    public static void main(String args []){
        JFrame ventanaPrincipal = new JFrame();
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(500,350);
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("ARCHIVO");
        JMenu m2 = new JMenu("Ayuda");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Abrir");
        JMenuItem m12 = new JMenuItem("Guardar como");
        m1.add(m11);
        m1.add(m12);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Introducir texto");
        JTextField tf = new JTextField(10);
        JButton send = new JButton("Enviar");
        JButton reset = new JButton("Restablecer");
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        JTextArea ta = new JTextArea();
        // Agregar componentes al marco.
        ventanaPrincipal. getContentPane().add(BorderLayout.SOUTH,
        panel);        
        ventanaPrincipal. getContentPane().add(BorderLayout.NORTH, mb);
        ventanaPrincipal. getContentPane().add(BorderLayout.CENTER, ta);

        ventanaPrincipal.setVisible(true);        
    }
}
