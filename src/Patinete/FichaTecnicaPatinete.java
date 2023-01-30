package Patinete;

import java.time.LocalDate;

public class FichaTecnicaPatinete {
    private Cliente cliente;
    private Tecnico tecnico;
    private LocalDate fechaReparacion;
    private int numeroHoras;

    public FichaTecnicaPatinete(){
    }

    public FichaTecnicaPatinete(Cliente cliente, Tecnico tecnico) {
        this.cliente = cliente;
        this.tecnico = tecnico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDate getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDate fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public String toString() {
        return "FichaTecnicaPatinete{" +
                "cliente=" + cliente +
                ", tecnico=" + tecnico +
                '}';
    }
}
