package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App4 {
    public static void main(String args []){
        while(true){
            System.out.println("Ingrese una posicion," +
            "este seguro de que es un entero");
            Scanner scanner = new Scanner(System.in);            
            try{
                int resultado = scanner.nextInt();
                int arreglo [] = {5,9,11};
                System.out.println(arreglo[resultado]);
                if (arreglo[resultado] == 11){
                    throw new AuxilioException("tienes muchos auxilios");
                }
                break;
            } catch(ArrayIndexOutOfBoundsException excepcion){
                System.out.println("Te saliste del alcance!");
            } catch (InputMismatchException excepcion){
                System.out.println("Debes ingresar un número entero");
            } catch (AuxilioException excepcion){
                System.out.println("Selecionaste 11 auxilios");
            }
            catch (Exception excepcion){
                System.out.println("Un error, intenta de nuevo");
                System.out.println(excepcion.getMessage());
            }
        }
        
        
    }
}
