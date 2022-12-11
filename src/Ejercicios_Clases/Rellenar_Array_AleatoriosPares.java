package Ejercicios_Clases;

import java.util.Arrays;

public class Rellenar_Array_AleatoriosPares {
    public static void main(String[] args) {
        int longitud = 5;
        int fin = 30;

        System.out.println("Array ordenados con aleatorios pares: ");
        System.out.println(Arrays.toString(rellenaPares(longitud, fin)));

    }

    public static int[] rellenaPares(int l, int f){
        //incializar array con la longitud de l
        int[] tabla = new int [l];
        // declarar variable random
        int r;
        for (int i = 0; i < tabla.length; i++) {
            do {
               r = (int)(Math.random()*(f-2+1)+2);
              tabla[i] = r;
            }while(r%2 != 0 );
        }
        Arrays.sort(tabla);

        return tabla;
    }



}
