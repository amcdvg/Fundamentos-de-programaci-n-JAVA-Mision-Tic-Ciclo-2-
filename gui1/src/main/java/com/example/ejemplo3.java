package com.example;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ejemplo3 extends JFrame {
    
    Container contenedor;
    JRadioButton radio1, radio2;
    ButtonGroup grupoBotones;
    JComboBox <String> combo1;
    JButton boton1;
    JList<String> lista2;

    public ejemplo3(){
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        radio1 = new JRadioButton("Soltero");
        radio2 = new JRadioButton("Casado");

        grupoBotones = new ButtonGroup();

        grupoBotones.add(radio1);
        grupoBotones.add(radio2);

        contenedor.add(radio1);
        contenedor.add(radio2);
        
        String [] lista = {"Ciclo1", "Ciclo2", "Ciclo3"};

        combo1 = new <String> JComboBox(lista);
        /*combo1.addItem("Ciclo1");
        combo1.addItem("Ciclo2");
        combo1.addItem("Ciclo3");*/
        contenedor.add(combo1);

        boton1 = new JButton("Consultar");
        boton1.addActionListener(new Manejador());
        contenedor.add(boton1);

        String[] datos = { "Perro", "Gato","Loro"};
        lista2 = new JList<>(datos);
        contenedor.add(lista2);

        setSize(750,500);
        setVisible(true);
    }

    public static void main (String args []){
        ejemplo3 gui = new ejemplo3();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class Manejador implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(combo1.getSelectedItem());
            System.out.println(combo1.getSelectedIndex());
            for (String resultado:lista2.getSelectedValuesList()){
                System.out.println(resultado);
            }
            /*JOptionPane.showMessageDialog(null, "Bienvenidos", "Misiontic", JOptionPane.WARNING_MESSAGE);*/
            /*int resultado = JOptionPane.showConfirmDialog(null, "Esta seguro?");
            if (resultado==1){
                System.out.println("Aceptar");
            }*/

            Object opciones [] = {"Hombre","Mujer","No Binario", "LGTB"};
            JOptionPane.showOptionDialog(null, "Dime tu sexo","Sexo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
        }

    }

}

