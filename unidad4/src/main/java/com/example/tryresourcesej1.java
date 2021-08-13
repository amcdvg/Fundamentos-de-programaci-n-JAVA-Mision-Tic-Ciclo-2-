package com.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class tryresourcesej1 {

    public static void main(String args []){
        var nombre = "Objetos2.dat";
        try (var oos = new ObjectOutputStream(
        new FileOutputStream(nombre))) {
            oos.writeObject(new Persona("552871883",
            "María", "Ruiz Ramos"));
            oos.writeObject(new Persona("403020104",
            "Juan", "González López"));
        } catch (FileNotFoundException e) {
        System.out.println("¡El fichero no existe!");
        } catch (Exception e) {
        System.out.println(e.getMessage());
        };
        /*System.out.println(oos);*/
    }
}
