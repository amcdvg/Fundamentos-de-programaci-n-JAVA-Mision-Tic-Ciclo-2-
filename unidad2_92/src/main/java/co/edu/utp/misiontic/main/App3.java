package co.edu.utp.misiontic.main;

import java.util.Arrays;

public class App3 {
    public static void main(String args []){
        /*int numero = 7;
        int arreglo [] = {8,4,11,56,2};
        System.out.println(arreglo[0]);
        arreglo[4] = 9;
        System.out.println(arreglo[4]);        
        System.out.println(arreglo.length);*/
        /*int arreglo2 [] = new int [8];
        arreglo2[0] = 11;
        arreglo2[1] = 7;
        arreglo2[6] = 99;*/
        /*for (int i = 0 ; i < arreglo2.length;i++){
            System.out.println(arreglo2[i]);
        }*/
        //System.out.println(Arrays.toString(arreglo2));
        double arreglo3 [][] = new double[3][4];
        arreglo3[0][1]=77.5;
        arreglo3[2][3]=99.9;
        System.out.println(Arrays.toString(arreglo3));
        for(int i=0; i < arreglo3.length;i++){
            System.out.println(Arrays.toString(arreglo3[i]));
        }
    }
}
