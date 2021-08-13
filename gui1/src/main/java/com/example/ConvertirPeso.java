package com.example;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConvertirPeso extends JFrame {
    Container contenedor;
    JCheckBox listadeConversion1;
    JCheckBox listadeConversion2;
    JCheckBox listadeConversion3;
    JCheckBox listadeConversion4;
    JLabel texto;

    public ConvertirPeso(){
        this.setTitle("Convertir Peso");


        contenedor = getContentPane();
        contenedor.setLayout(new GridLayout());
        JPanel panel1 = new JPanel(new GridLayout(1,1));
        texto = new JLabel("Bienvenido, por favor seleccione la conversion a realizar");
        panel1.add(texto);
        contenedor.add(panel1);

        listadeConversion1 = new JCheckBox("Kilogramo a Gramo");
        listadeConversion2 = new JCheckBox("Onza a gramo");
        listadeConversion3 = new JCheckBox("Libra a Onza");
        listadeConversion4 = new JCheckBox("Tonelada a Libra");
        contenedor.add(listadeConversion1);
        contenedor.add(listadeConversion2);
        contenedor.add(listadeConversion3);
        contenedor.add(listadeConversion4);
        setSize(750,500);
        setVisible(true);
    }
    public static void main( String[] args )
    {
        

        ConvertirPeso gui = new ConvertirPeso();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

        /*JFrame ventanaPrincipal = new JFrame("Convertir Peso");
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(500,350);
        //JButton boton1 = new JButton("Cancelar");
        //ventanaPrincipal.getContentPane().add(boton1);
        ventanaPrincipal.setVisible(true);    */    
    }

    
    
    
}
