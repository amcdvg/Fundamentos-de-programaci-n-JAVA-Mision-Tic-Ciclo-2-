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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.FlowLayout;

public class Gui3 extends JFrame{

    Container contenedor;
    JRadioButton radio1, radio2, radio3;
    ButtonGroup grupoBotones;
    JLabel etiqueta;
    JButton boton;
    JComboBox <String> combo;
    JList <String> lista;

    public Gui3(){
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        etiqueta = new JLabel("Selecciona tu estado civil");
        radio1 = new JRadioButton("Soltero");
        radio2 = new JRadioButton("Casado");
        radio3 = new JRadioButton("Union libre");

        grupoBotones = new ButtonGroup();
        grupoBotones.add(radio1);
        grupoBotones.add(radio2);
        grupoBotones.add(radio3);

        contenedor.add(etiqueta);
        contenedor.add(radio1);
        contenedor.add(radio2);
        contenedor.add(radio3);

        boton = new JButton("Mensaje");
        boton.addActionListener(new Manejador());
        contenedor.add(boton);

        String sexos []= {"Mujer","Hombre", "No binario", "LGTB"};
        combo = new JComboBox<>(sexos);
        /*combo.addItem("Mujer");
        combo.addItem("Hombre");
        combo.addItem("No binario");*/

        contenedor.add(combo);

        String lugar []= {"Valle","Antioquia", "Cundinamarca", "Risaralda"};
        lista = new JList <>(lugar);
        contenedor.add(lista);

        setSize(500,300);
        setVisible(true);
    }

    private class Manejador implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(radio1.isSelected()){
                System.out.println(":)");
            }
            if(radio2.isSelected()){
                System.out.println(":'(");
            }if(radio3.isSelected()){
                System.out.println(":D");
            }   
            System.out.println(combo.getSelectedItem());         
            System.out.println(combo.getSelectedIndex());

            for(String departamento: lista.getSelectedValuesList()){
                System.out.println(departamento);
            }
        
        }

    }

    public static void main(String args []){
        Gui3 gui = new Gui3();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
