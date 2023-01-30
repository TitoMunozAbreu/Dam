package Patinete;

import java.time.LocalDate;

public class Tecnico {
    private String DNI;
    private String nombre;
    private String apellido;
    private LocalDate fechaContratacion;
    private double salario;
    FichaTecnicaPatinete ficha;

    public Tecnico(){}

    public Tecnico(String DNI, String nombre, String apellido, LocalDate fechaContratacion, double salario) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public FichaTecnicaPatinete getFicha() {
        return ficha;
    }

    public void setFicha(FichaTecnicaPatinete ficha) {
        this.ficha = ficha;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", salario=" + salario +
                ", ficha=" + ficha +
                '}';
    }
}
