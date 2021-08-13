public class Gato extends Felino{
    
    private boolean domestico =true;
    private boolean caeEnCuatroPatas = true;

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public boolean isCaeEnCuatroPatas() {
        return caeEnCuatroPatas;
    }

    public void setCaeEnCuatroPatas(boolean caeEnCuatroPatas) {
        this.caeEnCuatroPatas = caeEnCuatroPatas;
    }

    public void dormir(){
        System.out.println("Dormir 16 Horas!");
        System.out.println("A diferencia de los felinos");
        super.dormir();
    }

    public void dormir(int numeroHoras){
        System.out.println("Dormir "+numeroHoras+" Horas!");
    }

    public void dormir(String unidad){
        System.out.println("Dormir 10 " + unidad);
    }

    public void dormir(int numeroHoras, String unidad){
        System.out.println("Dormir "+numeroHoras+" " + unidad);
    }

}
