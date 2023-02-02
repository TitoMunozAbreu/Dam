package Empresa_Ferroviaria.Empleados;

public enum Especialidades {
    FRENOS("Mecanico especialista en frenos"),
    HIDRAULICA("Mecanico especialista en hidraulica"),
    ELECTRICIDAD("Mecanico especialista en electricidad"),
    MOTOR("Mecanico especialista en motor");
    private String description;

     Especialidades(String d){
        this.description = d;
    }

    public String getdescription() {
        return this.description;
    }
}
