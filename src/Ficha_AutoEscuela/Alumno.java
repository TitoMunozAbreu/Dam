package Ficha_AutoEscuela;

public class Alumno extends Persona{
    private char tipoCarnet;

    public Alumno(String nombre, String apellido, String DNI, char tipoCarnet) {
        super(nombre, apellido, DNI);
        this.tipoCarnet = tipoCarnet;
    }

    public char getTipoCarnet() {
        return tipoCarnet;
    }

    public void setTipoCarnet(char tipoCarnet) {
        this.tipoCarnet = tipoCarnet;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n"+
                "Carnet de conducir: " + this.getTipoCarnet() +"\n";
    }
}
