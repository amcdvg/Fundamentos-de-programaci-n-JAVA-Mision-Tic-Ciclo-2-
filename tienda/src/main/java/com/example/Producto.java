package com.example;

public class Producto {
    
    int ID;
    String nombre;
    String categoria;

    public Producto(int ID, String nombre,
        String categoria){
            this.ID=ID;
            this.nombre=nombre;
            this.categoria=categoria;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
