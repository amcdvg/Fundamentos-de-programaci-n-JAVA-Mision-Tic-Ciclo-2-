package co.edu.utp.misiontic2022;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App6 {
    public static void main(String args[]){
        
        
        while(true){
            System.out.println("Ingresa un número");
            Scanner scanner = new Scanner(System.in);
            String nombres [] = {"Braham", "Mauricio","Angela"};
            try{                
                int numero = scanner.nextInt();
                System.out.println(nombres[numero]); 
                System.out.println("Ingresa la edad");               
                int edad = scanner.nextInt();
                if (edad>150){
                    throw new EdadException("La edad no puede ser tan grande");
                }
                break;
            } catch (ArrayIndexOutOfBoundsException excepcion){
                System.out.println("Debes ingresar 0,1 o 2");
            } catch (InputMismatchException excepcion){
                System.out.println("Cabezon! Ingresa un número");
            } catch(EdadException excepcion){
                System.out.println(excepcion.getMessage());
            }
            catch (Exception excepcion){
                System.out.println("Algo inesperado sucedio");
            }
        }
        
        
    }
}
