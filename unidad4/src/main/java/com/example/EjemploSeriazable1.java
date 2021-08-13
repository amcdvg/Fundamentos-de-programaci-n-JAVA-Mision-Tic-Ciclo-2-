package com.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EjemploSeriazable1 {
    public static void main(String args []){
        var nombre = "Objetos.dat";
        try {
            var archivo = new FileOutputStream(nombre);
            var oos = new ObjectOutputStream(archivo);
            oos.writeObject(new Persona("552871883",
            "María", "Ruiz Ramos"));
            oos.writeObject(new Persona("403020104",
            "Juan", "González López"));
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        };
    }
}
