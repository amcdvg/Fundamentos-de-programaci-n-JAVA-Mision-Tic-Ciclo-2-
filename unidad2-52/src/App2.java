public class App2 {
    public static void main(String[] args)  {        
        Perro perro1 = new Perro("Axel",2,"Parado");        
        Perro perro2 = new Perro("Trosky",3,"Sentado");        
        Perro perro3 = new Perro("Manchis",8,"Parado");        
        Perro perro4 = new Perro("Melquiades",4,"Sentado");        
        //System.out.println(perro1.contadorPerros);
        //System.out.println(perro2.contadorPerros);
        //System.out.println(perro3.contadorPerros);
        System.out.println(Perro.FormaDeDientes);
        System.out.println(Perro.contadorPerros);
        Perro.oler();
        Canino c1 = new Canino("Auuuu","Carnivoro");
        System.out.println(c1.getAullar());
    }
}
