public class Circulo extends Cilindro implements Figura,imprisiones {
    
    private double radio;
    private String nombre;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea() {        
        return Math.PI*(radio*radio);
    }

    @Override
    public String getNombre() {        
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;        
    }

    @Override
    public void imprimir(){
        System.out.println("Imprime algo");
    }


}
