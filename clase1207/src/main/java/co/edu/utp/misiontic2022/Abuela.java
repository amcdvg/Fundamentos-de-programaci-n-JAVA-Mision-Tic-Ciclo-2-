package co.edu.utp.misiontic2022;

public class Abuela {

    public String caminar(Double distanciaMetros){
        if (distanciaMetros < 0){
            return "no se aceptan negativos";
        }
        else if (distanciaMetros > 5000){
            return "seguro que es una abuela?";
        }
        else if (distanciaMetros>0 && distanciaMetros < 100){
            return "poquito";
        }else if(distanciaMetros >= 100 && distanciaMetros < 500){
            return "mas o menos";
        }else{
            return "mis respetos";
        }
    }
    
}
