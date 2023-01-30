package Empresa_Ferroviaria;

import java.time.LocalDate;

public class Jefe_Estacion extends Empleado{
    LocalDate fecha_ascenso;

    public Jefe_Estacion(){}

    public Jefe_Estacion(String nombre, String DNI, double salario, LocalDate fecha_ascenso) {
        super(nombre, DNI, salario);
        this.fecha_ascenso = fecha_ascenso;
    }

    public LocalDate getFecha_ascenso() {
        return fecha_ascenso;
    }

    public void setFecha_ascenso(LocalDate fecha_ascenso) {
        this.fecha_ascenso = fecha_ascenso;
    }

    @Override
    public String toString() {
        return "Jefe_Estacion{" + '\'' +
                super.toString() + '\'' +
                "fecha_ascenso=" + fecha_ascenso +
                '}';
    }
}
