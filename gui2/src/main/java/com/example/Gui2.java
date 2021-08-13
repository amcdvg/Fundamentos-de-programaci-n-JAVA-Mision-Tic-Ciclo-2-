package com.example;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.FlowLayout;

public class Gui2 extends JFrame{

    Container contenedor;
    JTextField campo;
    JButton boton, boton2;
    JCheckBox check, check2, check3;
    JLabel etiqueta;

    public Gui2(){
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        /*ImageIcon icono = new ImageIcon("homero.png");
        JLabel etiqueta = new JLabel("",icono,JLabel.CENTER);
        contenedor.add(etiqueta);*/
        campo = new JTextField(20);
        contenedor.add(campo);
        
        JTextArea area = new JTextArea(12,10);
        JScrollPane scroll = new JScrollPane(area);

        contenedor.add(scroll);

        boton = new JButton("leer info");
        boton.addActionListener(new Manejador());
        contenedor.add(boton);

        boton2 = new JButton("Color");
        boton2.addActionListener(new Manejador());
        contenedor.add(boton2);

        etiqueta = new JLabel("Selecciona los colores que te gustan");
        check = new JCheckBox("Negro");
        check2 = new JCheckBox("Azul");
        check3 = new JCheckBox("Rojo");
        contenedor.add(etiqueta);
        contenedor.add(check);
        contenedor.add(check2);
        contenedor.add(check3);

        setSize(500,300);
        setVisible(true);
    }

    private class Manejador implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==boton){
                String campoResultado = campo.getText();
                System.out.println(campoResultado+" :)");
            }else if(e.getSource()==boton2){
                //JOptionPane.showMessageDialog(contenedor, "Cancelar :(");
                if(check.isSelected()){
                    System.out.println("Se selecciono el negro");
                }
                if(check2.isSelected()){
                    System.out.println("Se selecciono el azul");
                }
                if(check3.isSelected()){
                    System.out.println("Se selecciono el rojo");
                }
            }
            
        }
        
    }

    public static void main(String args []){
        Gui2 gui = new Gui2();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
