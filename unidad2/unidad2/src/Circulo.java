public class Circulo implements figura {

    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea() {        
        return Math.PI * (radio*radio);
    }

    @Override
    public String obtenerNombre() {        
        return "Circulo";
    }
    
}
