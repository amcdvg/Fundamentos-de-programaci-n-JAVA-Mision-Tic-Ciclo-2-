package com.example;

import java.util.HashMap;
import java.util.Map;

public class App2 {
    public static void main(String args []){
        Map <CoordenadaAjedrez, PiezaAjedrez> tableroAjedrez = new HashMap();
        //int numero = 7;
        //CoordenadaAjedrez coor = new CoordenadaAjedrez("A", 7);
        //int [] arreglo = new int [5];
        //CoordenadaAjedrez [] arreglo2 = new CoordenadaAjedrez[5];
        PiezaAjedrez pieza1 = new PiezaAjedrez("PEON", Color.negro);
        tableroAjedrez.put(new CoordenadaAjedrez(PosicionHorizontal.B,4), pieza1);
        tableroAjedrez.put(new CoordenadaAjedrez(PosicionHorizontal.C,5), new PiezaAjedrez("CABALLO", Color.blanco));

        System.out.println(tableroAjedrez.size());
        //System.out.println(tableroAjedrez.containsKey(new CoordenadaAjedrez(PosicionHorizontal.B,4)));
        System.out.println(tableroAjedrez.containsValue(pieza1));
        tableroAjedrez.remove(new CoordenadaAjedrez(PosicionHorizontal.B,4));

        for (CoordenadaAjedrez coordenada : tableroAjedrez.keySet()){
            PiezaAjedrez piezaTemporal = tableroAjedrez.get(coordenada);
            System.out.println(coordenada.getCoordenada1()+","+
            coordenada.getCoordenada2() + "->" + 
            piezaTemporal.getNombre()+" " + piezaTemporal.getColor());
        }

    }
}
