package Ejercicio_Comparable;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Test_Jornada {
    public static void main(String[] args) {


        Jornada[] jornadas = {
                                new Jornada("3", LocalDateTime.now(),LocalDateTime.now().plusHours(8)),
                                new Jornada("3", LocalDateTime.now(),LocalDateTime.now().plusHours(2)),
                                new Jornada("1", LocalDateTime.now(),LocalDateTime.now().plusHours(4)),
                                new Jornada("1", LocalDateTime.now(),LocalDateTime.now().plusHours(6)),
                                new Jornada("2", LocalDateTime.now(),LocalDateTime.now().plusHours(10)),
                                new Jornada("2", LocalDateTime.now(),LocalDateTime.now().plusHours(15)),
                                new Jornada("0", LocalDateTime.now(),LocalDateTime.now().plusHours(1))
                            };
        Arrays.sort(jornadas);
        System.out.println(Arrays.toString(jornadas));
    }
}
