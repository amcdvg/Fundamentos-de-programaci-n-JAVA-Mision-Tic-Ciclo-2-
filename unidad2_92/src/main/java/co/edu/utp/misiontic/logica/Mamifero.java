package co.edu.utp.misiontic.logica;

import co.edu.utp.misiontic.colecciones.Colores;

public abstract class Mamifero implements Animal {
    
    private final String alimentacionPequeño = "Leche";
    private boolean tienePelos;

    private Colores colorPiel;

    public boolean isTienePelos() {
        return tienePelos;
    }
    public void setTienePelos(boolean tienePelos) {
        this.tienePelos = tienePelos;
    }
    public Colores getColorPiel() {
        return colorPiel;
    }
    public void setColorPiel(Colores colorPiel) {
        this.colorPiel = colorPiel;
    }

    public abstract void reproducir();

    @Override
    public void comer(){
        System.out.println("boca");
    }

    @Override
    public void orinan(){
        System.out.println("de pie");
    }

    @Override
    public void duermen(){
        System.out.println("acuestan");
    }

}
