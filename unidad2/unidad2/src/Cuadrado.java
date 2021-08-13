public class Cuadrado implements figura {

    public double lado;

    public Cuadrado(int lado){
        this.lado = lado;
    }

    @Override    
    public double calcularArea() {        
        return lado*lado;
    }

    @Override
    public String obtenerNombre() {        
        return "Cuadrado";
    }
        

}
