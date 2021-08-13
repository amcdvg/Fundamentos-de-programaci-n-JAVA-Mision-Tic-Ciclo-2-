package co.edu.utp.misiontic2022;

import java.util.HashMap;
import java.util.Map;

public class App4 {
    public static void main(String args []){
        /*Map <String, Integer> contenedor = new HashMap();
        contenedor.put("Sergio", 30);
        contenedor.put("Francisco", 45);
        contenedor.put("Claudia", 15);
        System.out.println(contenedor.get("Sergio"));
        System.out.println(contenedor.size());
        contenedor.clear();
        System.out.println(contenedor.isEmpty());*/
        //int edad = 7;
        //int arreglo[] = new int[4];
        Map <CoordenaAjedrez, PiezaAjedrez> contenedor2 = new HashMap();
        CoordenaAjedrez coordenada1 = new CoordenaAjedrez(Coordenadas.F, 5);
        PiezaAjedrez pieza1 = new PiezaAjedrez("PEON", "NEGRO");
        contenedor2.put(coordenada1, pieza1);
        CoordenaAjedrez coordenada2 = new CoordenaAjedrez(Coordenadas.B, 7);
        PiezaAjedrez pieza2 = new PiezaAjedrez("TORRE", "BLANCO");
        contenedor2.put(coordenada2, pieza2);

        //System.out.println(contenedor2.get(coordenada2).getTipoFicha());

        var llaves = contenedor2.keySet();

        for (CoordenaAjedrez coordenada: llaves){
            PiezaAjedrez pieza = contenedor2.get(coordenada);
            System.out.println("Coordenada:" + coordenada.getCoordenada1()+
            coordenada.getCoordenada2()+" -> Valor:" + pieza.getTipoFicha()+
            pieza.getColor());
        }

    }
}
