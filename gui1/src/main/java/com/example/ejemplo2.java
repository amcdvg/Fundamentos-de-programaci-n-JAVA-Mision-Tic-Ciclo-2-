package com.example;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejemplo2 extends JFrame {
    
    Container contenedor;
    JTextField campo1;
    JTextArea areaTexto;
    JScrollPane scroll;
    JButton boton1, boton2;
    JCheckBox check1, check2, check3;

    public ejemplo2(){
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        campo1 = new JTextField(20);
        contenedor.add(campo1);

        areaTexto = new JTextArea(20,10);
        scroll = new JScrollPane(areaTexto);
        contenedor.add(scroll);

        /*ImageIcon icono = new ImageIcon("homero.jpg");
        
        JLabel etiqueta = new JLabel("", icono,JLabel.CENTER);
        contenedor.add(etiqueta);*/

        boton1 = new JButton("Guardar");
        
        boton1.addActionListener(new Manejador());
        contenedor.add(boton1);

        JPanel panel1 = new JPanel(new GridLayout(1,5));
        JLabel etiqueta2 = new JLabel("Dime los colores que te gustan");
        check1 = new JCheckBox("Blanco");
        etiqueta2.setFont(new Font("Arial", Font.ITALIC,25));
        etiqueta2.setBackground(Color.red);
        etiqueta2.setForeground(new Color(79,81,143));
        check2 = new JCheckBox("Negro");
        check3 = new JCheckBox("Rojo");
        boton2 = new JButton("Cuales se seleccionaron");
        boton2.addActionListener(new Manejador());
        panel1.add(etiqueta2);
        panel1.add(check1);
        panel1.add(check2);
        panel1.add(check3);
        panel1.add(boton2);

        contenedor.add(panel1);

        setSize(750,500);
        setVisible(true);
    }

    public static void main (String args []){
        ejemplo2 gui = new ejemplo2();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class Manejador implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==boton1){
                String textoCampo1 = campo1.getText();
            JOptionPane.showMessageDialog(null, "El usuario ingreso "+textoCampo1);
            }
            else if(e.getSource()==boton2){
                System.out.println("El primer check: " + check1.isSelected());
                System.out.println("El segundo check: " + check2.isSelected());
                System.out.println("El tercero check: " + check3.isSelected());
            }
            
        }

    }

}
