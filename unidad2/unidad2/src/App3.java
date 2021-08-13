public class App3 {
    public static void main(String args []){
        Gato baguira = new Gato();
        baguira.setGarras("uñas cortadas");
        System.out.println(baguira.getNumeroVidas());
        System.out.println(baguira.getTemperaturaSangre());
        //baguira.dormir();        
        //baguira.dormir(4);        
        //baguira.dormir(4, "minutos");
        baguira.dormir("dias");        
    }
}
