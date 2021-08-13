package co.edu.utp.misiontic2022;

public class ParejaOrdenada <K,V> implements Pareja<K,V> {

    private K key;
    private V value;

    public ParejaOrdenada(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {        
        return key;
    }

    @Override
    public V getValue() {        
        return value;
    }

    public static <K,V> boolean comparar(Pareja<K,V> p1,
        Pareja<K,V> p2){
            return p1.getKey().equals(p2.getKey()) &&
            p1.getValue().equals(p2.getValue());
        }
    
}
