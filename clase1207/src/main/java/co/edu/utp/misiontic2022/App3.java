package co.edu.utp.misiontic2022;

import java.util.PriorityQueue;
import java.util.Queue;

public class App3 {
    public static void main(String args []){
        Queue <String> cola = new PriorityQueue<>(java.util.Collections.reverseOrder());
        
        cola.add("Nicolas");
        cola.add("Mauricio");
        cola.add("Claudia");
        cola.offer("Joshua");
        System.out.println(cola);
        System.out.println(cola.peek());
        /*for (String elemento : cola){
            System.out.println(elemento);
        }*/
        //System.out.println(cola.peek());
        //System.out.println(cola.element());
        //cola.remove("Claudia");
        //cola.clear();
        //System.out.println(cola);
        //System.out.println(cola.peek());
        //System.out.println(cola.poll());
        //System.out.println(cola);
    }
}
