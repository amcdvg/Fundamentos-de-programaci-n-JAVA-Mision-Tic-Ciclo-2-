package co.edu.utp.misiontic2022;

public class CoordenaAjedrez {
    private Coordenadas coordenada1;
    private int coordenada2;

    public CoordenaAjedrez(Coordenadas coordenada1, int coordenada2){
        this.coordenada1 = coordenada1;
        this.coordenada2 = coordenada2;
    }

    public Coordenadas getCoordenada1() {
        return coordenada1;
    }
    public void setCoordenada1(Coordenadas coordenada1) {
        this.coordenada1 = coordenada1;
    }

    public int getCoordenada2() {
        return coordenada2;
    }

    public void setCoordenada2(int coordenada2) {
        this.coordenada2 = coordenada2;
    }

}
