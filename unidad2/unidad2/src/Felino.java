public class Felino extends Mamifero{
    
    private String garras = "filudas";
    private int numeroVidas = 7;
    private boolean ronronear = true;

    public String getGarras() {
        return garras;
    }

    public void setGarras(String garras) {
        this.garras = garras;
    }

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    public boolean isRonronear() {
        return ronronear;
    }

    public void setRonronear(boolean ronronear) {
        this.ronronear = ronronear;
    }

    public void dormir(){
        System.out.println("Dormir 8 horas zzzz");
    }

}
