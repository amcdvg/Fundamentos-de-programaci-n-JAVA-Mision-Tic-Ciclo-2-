package co.edu.utp.misiontic.logica;

public class Felino extends Mamifero{
    
    private int horas_sueño;
    private String horarioCaza;

    public Felino(int horas_sueño, String horarioCaza){
        this.horarioCaza = horarioCaza;
        this.horas_sueño = horas_sueño;
    }

    public String getHorarioCaza() {
        return horarioCaza;
    }
    public void setHorarioCaza(String horarioCaza) {
        this.horarioCaza = horarioCaza;
    }
    public int getHoras_sueño() {
        return horas_sueño;
    }
    public void setHoras_sueño(int horas_sueño) {
        this.horas_sueño = horas_sueño;
    }

    public void cazar(){
        System.out.println("Entran en modo sigilo");
        System.out.println("Saltan hacia su presa");
    }

    @Override
    public void reproducir() {        
        System.out.println("El macho persiguiendo a la hembra");
    }    

}
