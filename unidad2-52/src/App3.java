public class App3 {
    
    public static void main(String args[]){
        Perro2 perrito = new Perro2();
        perrito.setAullan("Wofff");
        System.out.println(perrito.getAullan());
        //ERROR Canino2 c1 = new Canino2();
        perrito.cazar();
        Circulo c1 = new Circulo(7);
        //Figura f1 = new Figura();
        System.out.println(c1.calcularArea());
        
    }

}
