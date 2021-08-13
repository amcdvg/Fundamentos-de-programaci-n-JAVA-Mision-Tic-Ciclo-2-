package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Lider;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        System.out.println("Retorna el nombre y apellidos de los lideres con apellido 'Perez'");
        System.out.println("Nombre Primer_Apellido Segundo_Apellido");
        try {
            ArrayList<Lider> resultado = controlador.consultarRequerimiento1();
            for (Lider lider:resultado){
                System.out.print(lider.getNombre()+" ");
                System.out.print(lider.getPrimer_Apellido()+" ");
                System.out.println(lider.getSegundo_Apellido());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

   /* public static void requerimiento2(){
        try {
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }*/
    
}
