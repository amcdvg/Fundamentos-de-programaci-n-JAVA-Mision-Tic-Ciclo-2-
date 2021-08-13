package com.example;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Queue <String> cola = new PriorityQueue<>(java.util.Collections.reverseOrder());
        cola.add("Hector");
        cola.add("Angela");
        cola.add("Oscar");
        cola.add("Carlos");
        cola.offer("Zamira");

        cola.forEach((elemento) -> {
            System.out.println(elemento);
        });
        /*System.out.println(cola.size());
        System.out.println(cola.peek());
        cola.remove("Carlos");
        System.out.println(cola);
        System.out.println(cola.poll());
        System.out.println(cola);
        System.out.println(cola.isEmpty());
        cola.clear();
        System.out.println(cola.isEmpty());*/
    }
}
