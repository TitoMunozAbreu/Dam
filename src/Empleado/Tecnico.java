package Empleado;

public class Tecnico extends Empleado{
    public Tecnico(){}

    public Tecnico(String nombre){
        super(nombre);
    }

    public String toString(){
        return "Tecnico: " + "\n"
                + super.toString();
    }

}
