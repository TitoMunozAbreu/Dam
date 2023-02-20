package Empleado;

public class Oficial extends Empleado{

    public Oficial(){}

    public Oficial(String nombre){
        super(nombre);
    }

    public String toString(){
        return "Oficial: " + "\n"
                + super.toString();
    }

}
