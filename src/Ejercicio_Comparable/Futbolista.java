package Ejercicio_Comparable;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista> {
    private String DNI;
    private String nombre;
    private int edad;
    private int goles;

    public Futbolista(String DNI, String nombre, int edad, int goles) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.goles = goles;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getGoles() {
        return goles;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Futbolista)) return false;
        Futbolista that = (Futbolista) o;
        return getDNI().equals(that.getDNI());
    }


    @Override
    public int compareTo(Futbolista o) {
    int result = this.DNI.compareTo(o.DNI);
    return result;
    }

    @Override
    public String toString() {
        return "\n" + "DNI = " + DNI + "\n" +
                "nombre = " + nombre + "\n" +
                "edad = " + edad + "\n" +
                "goles = " + goles + "\n";
    }
}
