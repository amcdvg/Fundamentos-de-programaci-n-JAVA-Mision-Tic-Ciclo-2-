import java.util.Scanner;

public class junio29d {
    
    public static int contadorDigitos(int numero){        
        int cifras = 0;
        while(numero!=0){
            numero /= 10;
            cifras++;
        }
        return cifras;
    }

    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        //int resultado = contadorDigitos(numero);
        switch (contadorDigitos(numero)){
            case 1:
                System.out.println("Muy poquitos digitos");
                break;
            default:
                System.out.println("Hay muchos digitos");
        }
        
    }
}
