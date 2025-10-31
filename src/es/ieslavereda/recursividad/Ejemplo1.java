package es.ieslavereda.recursividad;

public class Ejemplo1 {

    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    public static int fibo(int n){

        // Caso base
        if(n==1 || n==0) return 1;

        return fibo(n-1)+fibo(n-2);

    }

}
