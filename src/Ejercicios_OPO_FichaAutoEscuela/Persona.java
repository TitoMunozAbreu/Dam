package Ejercicios_OPO_FichaAutoEscuela;

public class Persona {
    private String nombre;
    private String apellido;
    private String DNI;

    public Persona(String nombre, String apellido, String DNI){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Nombre= " + this.getNombre() + "\n"+
                "Apellido= " + this.getapellido() + "\n" +
                "DNI= " + this.getDNI();
    }
}
