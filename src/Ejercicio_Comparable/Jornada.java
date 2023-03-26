package Ejercicio_Comparable;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Jornada implements Comparable<Jornada>{
    private String DNI;
    private LocalDateTime entrada;
    private LocalDateTime salida;

    public Jornada(String DNI, LocalDateTime entrada, LocalDateTime salida) {
        this.DNI = DNI;
        this.entrada = entrada;
        this.salida = salida;
    }

    public int getMinJornada(){
        return (int) entrada.until(salida,ChronoUnit.MINUTES);
    }

    @Override
    public String toString() {
        return "\n" + "DNI='" + DNI + "\n"
                + "duracion mins = " + getMinJornada();
    }

    @Override
    public int compareTo(Jornada o) {
        int result =  this.DNI.compareTo(o.DNI);
        if(result == 0){
            result = Integer.compare(this.getMinJornada(),o.getMinJornada());
        }
        return result;
    }


}
