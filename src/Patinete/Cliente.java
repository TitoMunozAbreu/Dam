package Patinete;

import java.time.LocalDate;

public class Cliente {
    private String DNI;
    private String nombre;
    private String apellido;
    private String direccion;
    private Patinete patinete;
    private String telefono;

    private LocalDate d;

    public Cliente() {
    }

    public Cliente(String DNI, String nombre, String apellido, String direccion, String telefono) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void comprarPatinete(LocalDate d, Patinete p) {
        this.d = d;
        this.patinete = p;
        System.out.println("** Has realizado tu compra exitosamente " + d + " **");
    }

    public Patinete devolucionPatinete() {
        System.out.println("Devolucion realizada");
        return this.patinete = null;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Patinete getPatinete() {
        return patinete;
    }

    public void setPatinete(Patinete patinete) {
        this.patinete = patinete;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getD() {
        return d;
    }

    public void setD(LocalDate d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", patinete=" + patinete +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
