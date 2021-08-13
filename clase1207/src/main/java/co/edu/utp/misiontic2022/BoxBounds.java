package co.edu.utp.misiontic2022;

public class BoxBounds <T extends Number>{
    
    private T tipo;

    public T getTipo() {
        return tipo;
    }

    public void setTipo(T tipo) {
        this.tipo = tipo;
    }

    public <U extends String> void inspeccionar(U u){
        System.out.println("T->" + tipo.getClass().getName());
        System.out.println("U->" + u.getClass().getName());
    }

    public static void main(String args []){
        BoxBounds <Float> box = new BoxBounds<>();
        box.setTipo(7.1f);
        box.inspeccionar("hola");
    }

}
