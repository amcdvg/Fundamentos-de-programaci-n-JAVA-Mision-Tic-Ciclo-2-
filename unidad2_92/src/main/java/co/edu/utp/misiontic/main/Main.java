package co.edu.utp.misiontic.main;

import co.edu.utp.misiontic.logica.tv;

public class Main {
    public static void main(String args []){
        tv lg = new tv(40, "LG", false,"Cable");
        System.out.println(lg.getMarca());
        lg.escender();
    }
}
