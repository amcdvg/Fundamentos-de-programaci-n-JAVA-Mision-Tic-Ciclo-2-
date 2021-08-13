package com.example;

public class CoordenadaAjedrez {
    private PosicionHorizontal coordenada1;
    private int coordenada2;

    public CoordenadaAjedrez(PosicionHorizontal coordenada1, int coordenada2){
        this.coordenada1 = coordenada1;
        this.coordenada2 = coordenada2;
    }

    public PosicionHorizontal getCoordenada1() {
        return coordenada1;
    }
    public void setCoordenada1(PosicionHorizontal coordenada1) {
        this.coordenada1 = coordenada1;
    }
    public int getCoordenada2() {
        return coordenada2;
    }
    public void setCoordenada2(int coordenada2) {
        this.coordenada2 = coordenada2;
    }

}
