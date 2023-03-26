package Ejercicio_Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Futbolista[] jugadores = {
                                    new Futbolista("5", "Fidel", 20, 1),
                                    new Futbolista("4", "Bolivar", 19, 3),
                                    new Futbolista("3", "Bush", 50, 6),
                                    new Futbolista("2", "Mujica", 30, 2),
                                    new Futbolista("1", "Cristina", 15, 5)
                                };

        Arrays.sort(jugadores);
        // Ordenar los jugadores por DNI
        System.out.println(Arrays.toString(jugadores));

        //Ordenar los jugadores por Goles
            //Using Lambdas
        Comparator<Futbolista> orderByGoals = (j1,j2) -> j2.getGoles()-j1.getGoles();
        System.out.println("\t *** Ordered by goals ***");
        Arrays.sort(jugadores,orderByGoals);
        System.out.println(Arrays.toString(jugadores));

        //Another way to implement the Comparator Interface
        class orderByEdad implements Comparator<Futbolista>{

            @Override
            public int compare(Futbolista o1, Futbolista o2) {
                return Integer.compare(o2.getEdad(),o1.getEdad());
            }
        }

        Comparator<Futbolista> sortedbyedad = new orderByEdad();

        Arrays.sort(jugadores,sortedbyedad);

        System.out.println("\t *** Ordered by age ***");
        System.out.println(Arrays.toString(jugadores));


    }
}
