package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class App5Test {

    /*@Test
    public void calcularEdadNiños(){
        App5 app = new App5();
        String resultadoEsperado = "niño";
        String resultadoObtenido = app.calcularEdad(17);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void calcularEdadAdulto(){
        App5 app = new App5();
        String resultadoEsperado = "adulto";
        String resultadoObtenido = app.calcularEdad(25);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void calcularEdadMaduro(){
        App5 app = new App5();
        String resultadoEsperado = "maduro";
        String resultadoObtenido = app.calcularEdad(44);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void calcularEdadSabroso(){
        App5 app = new App5();
        String resultadoEsperado = "sabroso";
        String resultadoObtenido = app.calcularEdad(60);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void calcularEdadNegativa(){
        App5 app = new App5();
        String resultadoEsperado = "no edad valida";
        String resultadoObtenido = app.calcularEdad(-1);
        assertEquals(resultadoEsperado, resultadoObtenido);        
    }

    @Test
    public void calcularEdadInvalida(){
        App5 app = new App5();
        String resultadoEsperado = "esto no es para momias";
        String resultadoObtenido = app.calcularEdad(1000);
        assertEquals(resultadoEsperado, resultadoObtenido);        
    }*/

    @Test
    public void calcularEdadGeneral(){
        App5 app = new App5();
        int [] lista1 = {15,25,45,65};
        String [] lista2 = {"niño", "adulto", "maduro", "sabroso"};
        for (int i = 0 ; i < lista1.length ; i++){
            assertEquals(app.calcularEdad(lista1[i]), lista2[i]);        
        }
        
    }
    
}
