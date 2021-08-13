package co.edu.utp.misiontic.logica;

public class Gato extends Felino{
    
    private String dueño;
    private int numero_vidas;

    public Gato(String dueño, int numero_vidas, int horas_sueño,
    String horarioCaza){
        super(horas_sueño, horarioCaza);
        this.dueño = dueño;
        this.numero_vidas = numero_vidas;
    }

    public String getDueño() {
        return dueño;
    }
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    public int getNumero_vidas() {
        return numero_vidas;
    }
    public void setNumero_vidas(int numero_vidas) {
        this.numero_vidas = numero_vidas;
    }

}
