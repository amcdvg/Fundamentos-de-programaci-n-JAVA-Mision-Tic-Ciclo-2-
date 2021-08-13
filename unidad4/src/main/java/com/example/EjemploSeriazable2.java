package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EjemploSeriazable2 {
    public static void main(String args []){
        var nombre = "Objetos.dat";
        try {
            var archivo = new FileInputStream(nombre);
            var ois = new ObjectInputStream(archivo);
            var p1 = (Persona) ois.readObject();
            var p2 = (Persona) ois.readObject();
            ois.close();
            System.out.println("Cedula\t Nombre");
            System.out.println(p1.getAtributos());
            System.out.println(p2.getAtributos());
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };
    }
}
