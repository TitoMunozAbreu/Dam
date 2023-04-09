package Ejercicio_Exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class PedirPorTeclado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir datos del deportista:");
        String[] input = sc.nextLine().split(" ");

        String nombre = input[0];
        int edad = Integer.parseInt(input[1]);
        double estatura = Double.parseDouble(input[2]);

        System.out.printf(" nombre: %s%n edad: %d%n estatura %.2f%n ", nombre,edad,estatura);


    }

}
