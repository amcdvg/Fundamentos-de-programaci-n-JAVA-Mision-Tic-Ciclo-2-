package com.example;

import java.util.ArrayList;

public class App3 {
    public static void main(String args []){
        /*ArrayList <Object> lista = new ArrayList<>();
        lista.add("hola");
        int numero = (Integer) lista.get(0);*/
        /*ArrayList <String> lista = new ArrayList<>();
        lista.add("adios");
        int numero = (Integer) lista.get(0);*/
        Box caja = new Box <String>();
        ParejaOrdenada <Integer, Integer> pareja = new ParejaOrdenada <Integer,Integer> (2, 7);
        ParejaOrdenada <Integer, Integer> pareja2 = new ParejaOrdenada <Integer,Integer> (2, 5);
        System.out.println(ParejaOrdenada.comparar(pareja, pareja2));
        //System.out.println(pareja.getK());
        //System.out.println(pareja.getV());
    }
}
