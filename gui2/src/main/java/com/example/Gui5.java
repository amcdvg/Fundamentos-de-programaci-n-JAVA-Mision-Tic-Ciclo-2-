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

public class Gui5 extends JFrame{

    Container contenedor;
    JButton boton;

    public Gui5(){
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        boton = new JButton("Activar");
        boton.addActionListener(new Manejador());
        contenedor.add(boton);

        setSize(500,300);
        setVisible(true);
    }

    private class Manejador implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            /*String resultado = JOptionPane.showInputDialog(contenedor, "Mensaje");
            System.out.println(resultado);*/
            /*int resultado = JOptionPane.showConfirmDialog(contenedor, "Estas seguro de continuar?");
            if (resultado==1){
                System.out.println(":)");
            }else if(resultado==2){
                System.out.println(":(");
            }else{
                System.out.println(":o");
            }
            System.out.println(resultado);*/

            Object[] options = { "Yes, please", "No, thanks", "No eggs, no ham!" };
            int option = JOptionPane.showOptionDialog(contenedor,
            "Would you like some green eggs to go with that ham?",
            "A Silly Question", JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

        }

    }

    public static void main(String args []){
        Gui5 gui = new Gui5();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

