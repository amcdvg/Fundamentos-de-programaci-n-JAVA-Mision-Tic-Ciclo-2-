
public class Persona {

    //Atributos
    private String nombre;
    private int edad;
    public final int NUMERO_OJOS = 2;
    public static int numeroPersonas = 0;

    //Contructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        numeroPersonas++;
    }

    //Metodos
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void caminar(int numeroPasos){
        for(int i = 0; i < numeroPasos;i++){
            System.out.println("Mover un pie");
            System.out.println("Mover el otro pie");
        }        
    }

    public double trotarEnLaMontaña(double $kilometros){        
        return $kilometros*50;
    }

    public static void saludar(){
        System.out.println("Hola");
    }
    
}
