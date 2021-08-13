package com.example;

public class PiezaAjedrez {
    private String nombre;
    private Color color;

    public PiezaAjedrez(String nombre, Color color){
        this.nombre = nombre;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CoordenadaAjedrez momiviento(CoordenadaAjedrez coordenada){
        if (nombre == "PEON"){
            int nuevaPosicion = coordenada.getCoordenada2() + 1;
            return new CoordenadaAjedrez(coordenada.getCoordenada1(), nuevaPosicion);
        }
        return null;
    }

}
