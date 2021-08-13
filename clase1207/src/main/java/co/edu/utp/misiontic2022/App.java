package co.edu.utp.misiontic2022;

import java.util.ArrayList;

//import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        
        //ArrayList <Integer> lista = new ArrayList();
        ArrayList <Object> lista = new ArrayList();
        lista.add(17);
        lista.add(2.8);
        lista.add('a');
        lista.add("hola");
        System.out.println(lista.get(1));        
        System.out.println(lista.indexOf("hola"));
        System.out.println(lista.size());
        lista.remove(1);
        System.out.println(lista.get(1));
        System.out.println(lista.isEmpty());
        //lista.clear();
        //System.out.println(lista.isEmpty());
        //System.out.println(lista);
        
        /*for (int i=0 ; i < lista.size();i++){
            System.out.println(lista.get(i));
        }*/

        /*for (Object elemento : lista){
            System.out.println(elemento);
        }*/

        lista.forEach((elemento) -> {
            System.out.println(elemento);
        });

        //Python Lista tuplas diccionario sets
        
    }
}
