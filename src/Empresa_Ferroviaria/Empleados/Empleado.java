package Empresa_Ferroviaria.Empleados;

public class Empleado {
    private String nombre;
    private String DNI;
    private double salario;
    private String telefono;


    public Empleado(){}

    public Empleado(String nombre, String DNI, double salario){
        this.nombre = nombre;
        this.DNI = DNI;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
