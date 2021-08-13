package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EntradaSalida3 {

    public static void main(String args []){
        int[][] numeros = { { 1, 2, 3, 4, 5},
        { 6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25}};
                
        var archivo = "pruebaAna.txt";         
        try {
            var salida = new PrintWriter(archivo);
            
            for (int i=0; i< numeros.length; i++) {
                for (int j=0; j< numeros[i].length; j++)
                {
                    salida.print(numeros[i][j] + ",");
                }
                    salida.println("");
                }
                    salida.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }

    
}
