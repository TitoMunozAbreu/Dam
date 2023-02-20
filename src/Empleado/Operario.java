package Empleado;

public class Operario extends Empleado{

    public Operario(){}

    public Operario(String nombre){
        super(nombre);
    }

    @Override
    public String toString() {
        return "Operario: " +"\n"
                + super.toString();
    }
}
