package Empresa_Ferroviaria;

public class Vagon {
    private int id_vagon;
    private double carga_max;
    private double carga_actual;
    private String tipo_mercancia;

    public Vagon(){}

    public Vagon(int id_vagon, double carga_max, double carga_actual, String tipo_mercancia) {
        this.id_vagon = id_vagon;
        this.carga_max = carga_max;
        this.carga_actual = carga_actual;
        this.tipo_mercancia = tipo_mercancia;
    }

    public int getId_vagon() {
        return id_vagon;
    }

    public void setId_vagon(int id_vagon) {
        this.id_vagon = id_vagon;
    }

    public double getCarga_max() {
        return carga_max;
    }

    public void setCarga_max(double carga_max) {
        this.carga_max = carga_max;
    }

    public double getCarga_actual() {
        return carga_actual;
    }

    public void setCarga_actual(double carga_actual) {
        this.carga_actual = carga_actual;
    }

    public String getTipo_mercancia() {
        return tipo_mercancia;
    }

    public void setTipo_mercancia(String tipo_mercancia) {
        this.tipo_mercancia = tipo_mercancia;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "id_vagon=" + id_vagon +
                ", carga_max=" + carga_max +
                ", carga_actual=" + carga_actual +
                ", tipo_mercancia='" + tipo_mercancia + '\'' +
                '}';
    }
}
