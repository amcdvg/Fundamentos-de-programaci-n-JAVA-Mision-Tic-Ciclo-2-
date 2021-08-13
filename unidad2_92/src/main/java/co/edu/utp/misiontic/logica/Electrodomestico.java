package co.edu.utp.misiontic.logica;

public class Electrodomestico {
    
    private boolean on;
    private String formaCarga;

    public Electrodomestico(boolean on, String formaCarga){
        this.on = on;
        this.formaCarga = formaCarga;
    }

    public String getFormaCarga() {
        return formaCarga;
    }
    public void setFormaCarga(String formaCarga) {
        this.formaCarga = formaCarga;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public void escender(){
        System.out.println("Busca boton del aparato");
        System.out.println("Oprimalo");
        on = true;
    }

}
