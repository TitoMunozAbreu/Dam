package Empresa_Ferroviaria.Empleados;

import Empresa_Ferroviaria.Empleados.Empleado;

public class Maquinista extends Empleado {
    private String Rango;

    public Maquinista(){}

    public Maquinista(String nombre, String DNI, double salario, String rango) {
        super(nombre, DNI, salario);
        Rango = rango;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String rango) {
        Rango = rango;
    }

    @Override
    public String toString() {
        return "Maquinista{" +'\'' +
                super.toString()+ '\'' +
                "Rango='" + Rango + '\'' +
                '}';
    }
}
