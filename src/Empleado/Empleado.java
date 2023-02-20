package Empleado;

public class Empleado {
    private String nombre;

    public Empleado(){}

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){return this.nombre;}

    public void setNombre(String n){this.nombre = n;}

    public String toString(){
        return "Nombre: " + this.getNombre();
    }

}
