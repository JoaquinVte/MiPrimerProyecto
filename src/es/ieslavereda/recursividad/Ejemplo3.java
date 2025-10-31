package es.ieslavereda.recursividad;

public class Ejemplo3 {

    public static void main(String[] args) {
        System.out.println(fact(4));
    }

    public static int fact(int n){
        // Caso base
        if(n==0) return 0;
        if(n==1) return 1;

        // Caso recursivo
        return n * fact(n-1);


    }
}
