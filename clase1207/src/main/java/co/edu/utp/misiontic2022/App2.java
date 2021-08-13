package co.edu.utp.misiontic2022;

import java.util.HashSet;
import java.util.Set;

public class App2 {
    public static void main(String args []){
        Set <Integer> conjunto = new HashSet<>();
        conjunto.add(7);
        conjunto.add(5);
        conjunto.add(2);

        for (Integer elemento: conjunto){
            System.out.println(elemento);
        }
        System.out.println(conjunto.contains(1));
        conjunto.remove(2);
        System.out.println(conjunto.size());
        System.out.println(conjunto.isEmpty());
        conjunto.clear();
        System.out.println(conjunto.isEmpty());
    }
}
