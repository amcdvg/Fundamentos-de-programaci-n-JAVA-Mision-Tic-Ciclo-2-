package co.edu.utp.misiontic2022;

public class PiezaAjedrez {
    private String tipoFicha;
    private String color;

    public PiezaAjedrez(String tipoFicha, String color){
        this.tipoFicha = tipoFicha;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(String tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

}