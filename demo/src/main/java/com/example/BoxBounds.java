package com.example;

public class BoxBounds <T extends Number >{
    
    private T tipo;

    public T getTipo() {
        return tipo;
    }

    public void setTipo(T tipo) {
        this.tipo = tipo;
    }

    public <U extends String> void inspect(U u){
        System.out.println("T" + tipo.getClass().getName());
        System.out.println("U" + u.getClass().getName());
    }

    public static void main (String args []){
        BoxBounds <Integer> box = new BoxBounds<Integer>();
        box.setTipo(7);
        box.inspect("hola");
    }
    
}
