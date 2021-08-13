package com.example;

public class App5 {
    
    public String calcularEdad(int edad){
        if (edad < 0){
            return "no edad valida";
        }else if(edad > 150){
            return "esto no es para momias";
        }
        else if (edad < 18){
            return "niño";
        }else if (edad >= 18 && edad < 30){
            return "adulto";
        }else if (edad >=30 && edad < 50){
            return "maduro";
        }else{
            return "sabroso";
        }
    }

}
