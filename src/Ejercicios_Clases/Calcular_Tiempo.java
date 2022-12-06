package Ejercicios_Clases;

import java.time.Duration;
import java.time.LocalTime;

public class Calcular_Tiempo {
    public static void main(String[] args) {
        // Diseña una funcion que calcule los minutos entre dos tiempos
        LocalTime t1 = LocalTime.of(15,20,30);
        LocalTime t2 = LocalTime.of(22,50,30);
         calcularMinutos(t1,t2);
    }

    private static void calcularMinutos(LocalTime t1, LocalTime t2) {

        Duration d = Duration.between(t1,t2);
        System.out.println("La diferencia horaria es de: " + d);



    }
}
