package co.edu.utp.misiontic.main;

import javax.swing.JOptionPane;

import co.edu.utp.misiontic.logica.Perro;

public class App 
{
    public static void main( String[] args )
    {        
        //int estatura = 170;
        int contador = 0;
        Perro perro1 = new Perro("Pepe",4,"Pug");        
        //perro1.setNombre("Axel");
        //System.out.println(perro1.getNombre());
        Perro perro2 = new Perro("Sasha",3,"Siberiano");        
        //System.out.println(perro2.getNombre());        */
        JOptionPane.showMessageDialog(null, "Unidad 2","Misiontic",JOptionPane.ERROR_MESSAGE);
        Perro perro3 = new Perro("Manchis",7,"Chandoso");        
        System.out.println(Perro.contadorPerros);
        Perro.ladrar();
    }
}
