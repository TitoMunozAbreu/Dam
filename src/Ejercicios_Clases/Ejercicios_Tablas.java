package Ejercicios_Clases;

import java.util.Arrays;
import java.util.Scanner;

/**
 * EJERCICIOS TABLAS
 * DAM_PROGRAMACION
 * @author Tito Jose Muñoz Abreu
 * @version 1
 */
public class Ejercicios_Tablas {
    //incilizar el array con diez elementos
    static int[] arreglo = new int[10];
    //inicializar trueFalse para desplegar menu()
    static boolean trueFalse = true;
    //inicializar clase scanner
    static Scanner sc = new Scanner(System.in);
    //variable para comprobar que los elementos se hayan introducido
    static boolean check = false;

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
            System.out.println("\t ** MENU ARRAY **:");
            System.out.println("\t1. Introducir elementos en el array");
            System.out.println("\t2. Mostar array");
            System.out.println("\t3. Borrar elemento");
            System.out.println("\t4. Finalizar programa");
            System.out.print("Elegir una de las siguientes opciones: ");

            //capturar exepciones
            try {
                opcion = Integer.parseInt(sc.next());
            } catch (NumberFormatException a) {
                System.out.println("¡ATENCION! ingresa unicamente numeros enteros");
            }

            switch (opcion) {
                case 1:
                    introducirElementos();
                    check = true;
                    break;
                case 2:
                    mostrarArray();
                    break;
            case 3:
                    borrarelemento();
                break;
                case 4:
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
        if (!check) {
            System.out.println("¡ATENCION! introducir elementos en el array");
        } else { //en caso contrario
            System.out.println();
            System.out.println("opcion 2. Mostar array:");
            //muestra el arreglo
            System.out.println(Arrays.toString(arreglo));
        }
    }

    /**
     * METODO BORRAR ELEMENTO
     */
    public static void borrarelemento(){
        int posicion = 0;
        //comprueba que los elementos se hayan introducidos
        if (!check) {
            System.out.println("¡ATENCION! introducir elementos en el array");
        } else { //en caso contrario
            System.out.println();
            System.out.println("opcion 3. Borrar elemento del array:");
            //capturar excepecion
            do {
                try {
                    //solicitar la posicion del elemento que se quiere eliminar
                    System.out.println("introducir la posicion entre (1 y "+arreglo.length+") del elemento a borrar:");
                    posicion = Integer.parseInt(sc.next());
                } catch (NumberFormatException a) {
                    System.out.println("¡ATENCION! ingresar unicamente numeros enteros");
                }
            }while(posicion <= 0 || posicion >= (arreglo.length + 1));

            //borrar elemento: asignando a cero
            System.out.println("El elemento " + arreglo[posicion-1] + " ha sido eliminado");
            //borrar elemento: asignando a cero
            arreglo[posicion-1] = 0;
        }

    }


}
