public class Perro extends Canino{
    //Atributos
    // public, private, protected
    private final boolean PERSEGUIR_COLA = true;
    private String orinar;
    private String nombre;
    private int edad;
    public static int contadorPerros=0;
    public static final String FormaDeDientes = "Colmillos";
    //Constructor
    // def __init__():
    public Perro(String nombre, int edad, String orinar){
        super("Awwwwww", "Omnivoros");
        this.nombre = nombre;
        this.edad = edad;
        this.orinar = orinar;    
        contadorPerros++;    
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getOrinar() {
        return orinar;
    }
    public void setOrinar(String orinar) {
        this.orinar = orinar;
    }    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void oler(){
        System.out.println("Sniff");
    }
}
