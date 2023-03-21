package Ejercicio_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio
 * Pide un entero por consola, lo lee del
 * teclado y lo devuelve. Si la cadena introducida
 * por consola no tiene el formato correcto,
 * muestra un mensaje de error y vuelve a
 * pedirlo.
 */
public class LeerNumero {

    public static void main(String[] args) {

    leerEntero();


    }

    static int leerEntero(){
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        while (true){
            try {
                System.out.print("Ingresar un numero:");
                numero = teclado.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Error:" + e.getMessage());
                teclado.next();
            }
        }

        return numero;
    }

}
