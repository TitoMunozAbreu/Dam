package Empleado;

public class Directivo extends Empleado {

    public Directivo(){}

    public Directivo(String nombre){
        super(nombre);
    }

    public String toString(){
        return "Directivo: " + "\n"
                + super.toString();
    }
}
