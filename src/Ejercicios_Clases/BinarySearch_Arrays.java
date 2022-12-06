package Ejercicios_Clases;

import java.util.Arrays;

public class BinarySearch_Arrays {
    public static void main(String[] args) {
        int[] primitiva = new int[6];
        int [] combinacion_ganadora = new int[6];

        llenarArreglo(primitiva);
        llenarArreglo(combinacion_ganadora);
        System.out.println("Apuesta Primitiva: " + Arrays.toString(primitiva));
        System.out.println("Combinacion ganadora: " + Arrays.toString(combinacion_ganadora));

        System.out.println("Has Acertado?: " + hasAcertado(primitiva, combinacion_ganadora));


    }

    public static void llenarArreglo(int[] a){
        int r;
        for (int i = 0; i < a.length; i++) {
            r = (int) (Math.random()*(49-1+1)+1);
            a[i] = r;
        }
    }

    public static boolean hasAcertado(int[] p, int[] cg){
        boolean hasAcertado;
        int aciertos = 0;
        Arrays.sort(p);
        Arrays.sort(cg);


        for(int a: p){
            if(Arrays.binarySearch(cg, a) >= 0){
                System.out.println("Numeros encontrado: " + a);
                aciertos++;
            }
        }
        System.out.println("Acierto:  " + aciertos);
        hasAcertado = aciertos > 0;

        return hasAcertado;
    }
}
