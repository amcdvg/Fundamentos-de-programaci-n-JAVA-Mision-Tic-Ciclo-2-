package co.edu.utp.misiontic.main;

import co.edu.utp.misiontic.colecciones.Colores;
import co.edu.utp.misiontic.logica.Felino;
import co.edu.utp.misiontic.logica.Gato;

public class App2 {
    public static void main (String args []){
        Gato gatico = new Gato("Manuel",7, 16,"Diurno");
        System.out.println(gatico.getDueño());
        System.out.println(gatico.getNumero_vidas());
        System.out.println(gatico.getHoras_sueño());
        gatico.cazar();
        Felino felino1 = new Felino(8,"Nocturno");
        System.out.println(felino1.getHorarioCaza());
        //Mamifero mamifero = new Mamifero();
        System.out.println(Colores.Azul);
        felino1.setColorPiel(Colores.Blanco);
        felino1.reproducir();
        //System.out.println(gatico);
        gatico.duermen();
        System.out.println(gatico.isTienePelos());
    }
}
