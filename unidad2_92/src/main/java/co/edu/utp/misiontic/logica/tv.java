package co.edu.utp.misiontic.logica;

public class tv extends Electrodomestico{
    private double tamañoPantalla;
    private String marca;

    public tv(double tamañoPantalla, String marca, boolean on,
    String formaCarga){
        super(on, formaCarga);
        this.marca = marca;
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getTamañoPantalla() {
        return tamañoPantalla;
    }
    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    @Override
    public void escender(){
        System.out.println("Busque el control");
        System.out.println("Busque el boton de escendido");
        System.out.println("El TV se esciende");
        setOn(true);
    }

}
