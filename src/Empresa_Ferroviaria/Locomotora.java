package Empresa_Ferroviaria;

public class Locomotora {
    private String matricula;
    private String potencia;
    private int año_fabricancion;
    private Mecanico mecanico;

    public Locomotora(){}

    public Locomotora(String matricula, String potencia, int año_fabricancion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.año_fabricancion = año_fabricancion;
        this.mecanico = mecanico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getAño_fabricancion() {
        return año_fabricancion;
    }

    public void setAño_fabricancion(int año_fabricancion) {
        this.año_fabricancion = año_fabricancion;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", potencia='" + potencia + '\'' +
                ", año_fabricancion=" + año_fabricancion +
                ", mecanico=" + mecanico +
                '}';
    }
}
