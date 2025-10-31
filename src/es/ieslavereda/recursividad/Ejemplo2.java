package es.ieslavereda.recursividad;

public class Ejemplo2 {

    public static void main(String[] args) {
        System.out.println(multi(5,4));
    }

    public static int multi(int m,int n){

        if(n==0) return 0;
        if(n==1) return m;

        return m + multi(m,n-1);
    }
}
