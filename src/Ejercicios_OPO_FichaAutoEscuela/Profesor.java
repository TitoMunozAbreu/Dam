package Ejercicios_OPO_FichaAutoEscuela;

public class Profesor extends Persona {
    private double sueldo;
    private String autoescuela;


    public Profesor(String nombre, String apellido, String DNI, double sueldo, String autoescuela) {
        super(nombre, apellido, DNI);
        this.sueldo = sueldo;
        this.autoescuela = autoescuela;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getAutoescuela() {
        return autoescuela;
    }

    public void setAutoescuela(String autoescuela) {
        this.autoescuela = autoescuela;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n"+
                "Sueldo=" + this.getSueldo() + "\n"+
                "Autoescuela='" + getAutoescuela().toString() +"\n";
    }
}
