public class Lobo extends Canino{
    
    private final boolean andaEnManada = true;
    private String pelaje;
    private String horarioCaza;

    public Lobo(){
        super("AAAAAAAWWWWWWWW","carnivoros");
    }

    public String getPelaje() {
        return pelaje;
    }
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    public String getHorarioCaza() {
        return horarioCaza;
    }
    public void setHorarioCaza(String horarioCaza) {
        this.horarioCaza = horarioCaza;
    }

}
