package co.edu.utp.misiontic.logica;

public class Perro {
    //atributos
    private String nombre;
    private int edad;
    private String raza;
    private final String DONDE_MEAN = "Todas partes";
    public static int contadorPerros = 0;
    //constructor
    public Perro(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;        
        contadorPerros++;
    }
    //metodos
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public static void ladrar(){
        System.out.println("Woff");
    }
    
}