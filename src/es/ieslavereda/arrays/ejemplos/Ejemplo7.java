package es.ieslavereda.arrays.ejemplos;

import java.util.Arrays;

public class Ejemplo7 {

    public static void main(String[] args) {

        char[] dados = lanzar(3);

        System.out.println(Arrays.toString(dados) + " = " + sumarDados(dados));

    }

    public static int sumarDados(char[] dados) {
        int suma = 0;

//        for(int i=0;i<dados.length;i++)
//            suma += valorDado(dados[i]);

        for (int i = 0; i < dados.length; i++)
            suma += dados[i] - '⚀' + 1;

        return suma;
    }

    public static int valorDado(char dado) { //'⚃'
        // '⚃' -> 4
        return dado - '⚀' + 1;// 4
    }


    // '⚀' - '⚀' = 0 -> 1
    // '⚃' - '⚀' = 3 -> 4
    // ⚀⚃⚃ = 9

    public static char[] lanzar(int cantidad) {

        char[] dados = new char[cantidad];

        for (int i = 0; i < dados.length; i++) {
            switch ((int) (Math.random() * 6)) {

                case 0:
                    dados[i] = '⚀';
                    break;
                case 1:
                    dados[i] = (char) ('⚀' + 1);
                    break;
                case 2:
                    dados[i] = (char) ('⚀' + 2);
                    break;
                case 3:
                    dados[i] = (char) ('⚀' + 3);
                    break;
                case 4:
                    dados[i] = (char) ('⚀' + 4);
                    break;
                case 5:
                    dados[i] = (char) ('⚀' + 5);
                    break;
            }


        }

        return dados;
    }
}
