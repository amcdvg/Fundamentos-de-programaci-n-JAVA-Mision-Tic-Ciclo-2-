package com.example;

public class Perro {
    
    String nombre;
    int edad;
    String dueño;

    public Perro(String nombre, int edad, String dueño){
        this.nombre = nombre;
        this.edad = edad;
        this.dueño = dueño;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
