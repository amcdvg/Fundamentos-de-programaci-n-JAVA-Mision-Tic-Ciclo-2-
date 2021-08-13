package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EntradaSalida4 {

    public static void main(String args []){
        String nombre = "numeros2.txt";
        var archivo = new File(nombre);
        if (archivo.exists()) {
        
            try {
                var lector = new Scanner(archivo);
                System.out.println("Números del archivo");
                while (lector.hasNext()) {
                    var numeros = new StringTokenizer(lector.next(),",");
                    while (numeros.hasMoreTokens()) {
                        System.out.print(numeros.nextToken() + "\t");
                    }
                    System.out.println("");
                }
                lector.close();
                } 
            catch (FileNotFoundException e) {            
                e.printStackTrace();
            }
        }    
    }
}