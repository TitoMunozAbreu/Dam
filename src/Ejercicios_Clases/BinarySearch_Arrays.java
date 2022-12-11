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

    /**
     * METODO PARA LLENAR ARRAY CON NUMEROS RANDOM
     * rango (1-49)
     * @param a Le pasamos el array a completar
     */
    public static void llenarArreglo(int[] a){
        //variable random
        int r;
        for (int i = 0; i < a.length; i++) {
            //almacenar el numero random en r
            r = (int) (Math.random()*(49-1+1)+1); //rango(1-49)
            a[i] = r; //almacenar random en el arreglo
        }
    }

    /**
     * METODO PARA VERFICAR LA PRIMITIVA
     * @param p Le pasamos el array de la primitiva
     * @param cg Le pasamos el array de la combinacion ganadora
     * @return Devuelve true o false y la cantidad de aciertos
     */
    public static boolean hasAcertado(int[] p, int[] cg){
        boolean hasAcertado = false;
        //incializamos la cantidad de aciertos
        int aciertos = 0;
        //Ordenamos los arreglos
        Arrays.sort(p);
        Arrays.sort(cg);

        for(int a: p){//iteramos sobre la primitiva
            //comprobamos que en la primitiva exista algun numero de la combinacion ganadora
            if(Arrays.binarySearch(cg, a) >= 0){
                System.out.println("Numero encontrado: " + a);
                aciertos++; //contador de la cantidad de aciertos
            }
        }
        //comprobar la cantidad de aciertos
        if(aciertos == 1){
            System.out.println("Acierto:  " + aciertos);
            hasAcertado = true;
        } else if (aciertos > 1) {
            System.out.println("Aciertos:  " + aciertos);
            hasAcertado = true;
        }
        return hasAcertado;
    }
}
