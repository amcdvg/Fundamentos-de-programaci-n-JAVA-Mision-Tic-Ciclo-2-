package co.edu.utp.misiontic2022;

import java.util.ArrayList;

public class App5 {
    public static void main(String args []){
        /*ArrayList <Object> lista = new ArrayList<>();
        lista.add(56);
        lista.add("hola");
        Integer entero = (Integer) lista.get(1);*/
        //Box <Float> caja = new Box <Float>();
        ParejaOrdenada <String, Integer> pareja1 = new ParejaOrdenada<>("Claudia", 20);
        ParejaOrdenada <String, Integer> pareja2 = new ParejaOrdenada<>("Claudia", 20);
        System.out.println(ParejaOrdenada.comparar(pareja1, pareja2));
        
    }
}
