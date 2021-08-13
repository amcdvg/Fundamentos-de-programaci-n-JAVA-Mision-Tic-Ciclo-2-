package com.example;

public class Empleado {

    String nombre;
    String email;
    int edad;

    public Empleado(String nombre, String email, int edad){
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
