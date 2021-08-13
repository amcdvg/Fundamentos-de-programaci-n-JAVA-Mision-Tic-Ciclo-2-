package co.edu.utp.misiontic2022;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AbuelaTest {
    
    @Test
    public void caminarPoquito(){
        Abuela abuelita = new Abuela();
        String valorEsperado = "poquito";
        String valorObtenido = abuelita.caminar(75.5);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    public void caminarMaso(){
        Abuela abuelita = new Abuela();
        String valorEsperado = "mas o menos";
        String valorObtenido = abuelita.caminar(200.5);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    public void caminarMucho(){
        Abuela abuelita = new Abuela();
        String valorEsperado = "mis respetos";
        String valorObtenido = abuelita.caminar(750.0);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    public void caminarNegativo(){
        Abuela abuelita = new Abuela();
        String valorEsperado = "no se aceptan negativos";
        String valorObtenido = abuelita.caminar(-100.0);
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    public void caminarInvalido(){
        Abuela abuelita = new Abuela();
        String valorEsperado = "seguro que es una abuela?";
        String valorObtenido = abuelita.caminar(1000000.0);
        assertEquals(valorEsperado, valorObtenido);
    }


}
