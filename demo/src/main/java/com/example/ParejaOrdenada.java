package com.example;

public class ParejaOrdenada <K,V> implements Pair<K,V>{

    private K key;
    private V value;

    public ParejaOrdenada(K key, V value ){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getK() {        
        return key;
    }

    @Override
    public V getV() {        
        return value;
    }

    public static <K,V> boolean comparar(Pair <K,V> p1, Pair <K,V> p2){
        return p1.getK().equals(p2.getK()) && 
        p1.getV().equals(p2.getV());
    }
    
}
