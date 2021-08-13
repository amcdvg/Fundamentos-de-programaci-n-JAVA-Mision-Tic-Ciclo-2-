public class App2 {
    public static void main(String args []){        
        Persona p1 = new Persona("Johana",30);        
        Persona p2 = new Persona("Leidy",29);        
        Persona p3 = new Persona("Alexander",22);        
        Persona p4 = new Persona("Leonardo",12);
        System.out.println(Persona.numeroPersonas);
        Persona.saludar();
    }
}
