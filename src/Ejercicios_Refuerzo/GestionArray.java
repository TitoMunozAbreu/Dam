package Ejercicios_Refuerzo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Practica JSE-01
 * @author Tito Jose Muñoz Abreu
 * @version 1
 */
public class GestionArray {
    //incilizar el array con diez elementos
    static int[] arreglo = new int[10];
    //inicializar trueFalse para desplegar menu()
    static boolean trueFalse = true;
    //inicializar clase scanner
    static Scanner sc = new Scanner(System.in);
    //variable para comprobar que los elementos se hayan introducido
    static int aux = 0;

    public static void main(String[] args) {

        //Llamada al metodo menu
        menu();

    }

    /**
     * METODO MENU
     * Despliegue de las opciones diponibles
     */
    public static void menu() {
        //incializar variable
        int opcion = 0;


        do {
            //mostrar el menu
            System.out.println();
            System.out.println("\t ** MENU GESTION ARRAY **:");
            System.out.println("\t1. Introducir elementos en el array");
            System.out.println("\t2. Mostar array");
            System.out.println("\t3. Obtener el mayor");
            System.out.println("\t4. Obtener el menor");
            System.out.println("\t5. Obtener la suma");
            System.out.println("\t6. Obtener la media");
            System.out.println("\t7. Finalizar programa");
            System.out.print("Elegir una de las siguientes opciones: ");

            //capturar exepciones
            try {
                opcion = Integer.parseInt(sc.next());
            } catch (NumberFormatException a) {
                System.out.println("¡ATENCION! ingresa unicamente numeros enteros entre (1-7)");
            }

            switch (opcion) {
                case 1:
                    introducirElementos();
                    aux++;
                    break;
                case 2:
                    mostrarArray();
                    break;
            case 3:
                System.out.println("Mayor elemento del array: " + obtenerMayor());
                break;
            case 4:
                System.out.println("Menor elemento del array: " + obtenerMenor());
                break;
            case 5:
                System.out.println("Suma de los elementos del array: " + obtenerSuma());
                break;
           case 6:
               System.out.println("Media de los elementos del array: " + obtenerMedia(obtenerSuma()));
                break;
                case 7:
                    System.out.println("Haz finalizado el programa");
                    trueFalse = false;
                    break;
                default:
                    System.out.println("¡ATENCION! ingresa unicamente numeros enteros entre (1-7)");


            }
        } while (trueFalse);

    }

    /**
     * METODO LLENAR EL ARRAY
     * Acepta unicamente valores enteros
     */
    public static void introducirElementos() {
        System.out.println();
        //mostrar la opcion elegida
        System.out.println("opcion 1. Introducir 10 numeros enteros:");
        //iterar el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            //capturar excepecion
            try {
                System.out.print("Introducir " + (i + 1) + " elemento:");
                arreglo[i] = Integer.parseInt(sc.next());
            } catch (NumberFormatException a) {
                System.out.println("¡ATENCION! ingresar unicamente numeros enteros");
                i--; //le resto el indice mientras que no guarde el valor
            }
        }
    }

    /**
     * METODO MOSTRAR ARRAY
     */
    public static void mostrarArray() {
        //comprueba que los elementos se hayan introducidos
        if (aux == 0) {
            System.out.println("¡ATENCION! introducir elementos en el array");
        } else { //en caso contrario
            System.out.println();
            System.out.println("opcion 2. Mostar array:");
            //muestra el arreglo
            System.out.println(Arrays.toString(arreglo));
        }
    }

    /**
     * METODO OBTENER MAYOR
     * @return Devuelve el elemento mayor del array
     */
    public static int obtenerMayor(){
        //incializamos la variable
        int mayor = 0;
        //comprueba que los elementos se hayan introducidos
        if (aux == 0) {
            System.out.println("¡ATENCION! introducir elementos en el array");
        } else {// en caso contrario
            System.out.println();
            System.out.println("opcion 3. Obtener Mayor:");
            //itera sobre el arreglo
            for(int m:arreglo){
                //comprueba si m es mayor
                if(m > mayor){
                    mayor = m;
                }
            }
        }
        return mayor;
    }

    /**
     * METODO OBTENER MENOR
     * @return Devuelve el elemento menor del array
     */
    public static int obtenerMenor(){
        //incializamor menor con el valor del arreglo en la posicion cero
        int menor = arreglo[0];
        //comprueba que los elementos se hayan introducidos
        if(aux == 0){
            System.out.println("¡ATENCION! introducir elementos en el array");
        }else {// es caso contrario
            System.out.println();
            System.out.println("opcion 4. Obtener Menor:");
            //itera sobre el arreglo
            for(int m:arreglo){
                //comprueba si m es menor
                if(m < menor){
                    menor = m;
                }
            }
        }
        return menor;
    }

    /**
     * METODO SUMA DE ELEMENTOS
     * @return Devuele la suma de los elementos del array
     */
    public static int obtenerSuma(){
        int sum = 0;
        //comprueba que los elementos se hayan introducidos
        if(aux == 0){
            System.out.println("¡ATENCION! introducir elementos en el array");
        }else {// es caso contrario
            System.out.println();
            System.out.println("opcion 5. Obtener Suma:");
            //itera sobre el arreglo
            for (int m : arreglo) {
                //suma los elementos de arreglo
                sum += m;
            }
        }
        return sum;
    }

    /**
     * METODO PARA OBTENER LA MEDIA DE LOS ELEMENTOS
     * @return Devuele la media de los elementos del array
     */
    public static double obtenerMedia(int s){
        double media = 0;
        //comprueba que los elementos se hayan introducidos
        if(aux > 0){
            System.out.println();
            System.out.println("opcion 6. Obtener Media:");
            media = (double) s/arreglo.length;
        }
       return media ;
    }
}
