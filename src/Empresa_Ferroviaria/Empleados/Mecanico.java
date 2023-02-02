package Empresa_Ferroviaria.Empleados;

import Empresa_Ferroviaria.Empleados.Empleado;
import Empresa_Ferroviaria.Empleados.Especialidades;

public class Mecanico extends Empleado {
    private Especialidades especialidad;

    public Mecanico(){}

    public Mecanico(String nombre, String DNI, double salario, String telefono, Especialidades especialidad) {
        super(nombre, DNI, salario);
        this.setTelefono(telefono);
        this.especialidad = especialidad;
    }

    public Especialidades getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidades especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
    return      "Mecanico{" +'\'' +
                super.toString()+ '\'' +
                "especialidad=" + especialidad +
                '}';
    }
}
