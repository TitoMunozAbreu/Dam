package Patinete;

public class Patinete {
    private String ID;
    private String mdelo;
    private String marca;
    private Colores color;
    private String potencia;

    public Patinete() {
    }

    public Patinete(String ID, String mdelo, String marca, Colores color, String potencia) {
        this.ID = ID;
        this.mdelo = mdelo;
        this.marca = marca;
        this.color = color;
        this.potencia = potencia;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMdelo() {
        return mdelo;
    }

    public void setMdelo(String mdelo) {
        this.mdelo = mdelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Patinete{" +
                "ID='" + ID + '\'' +
                ", mdelo='" + mdelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color=" + color +
                ", potencia='" + potencia + '\'' +
                '}';
    }
}

enum Colores {
    GRIS("El patinete es de color gris"),
    AMARILLO("El patinete es de color amarillo"),
    AZUL("El patinete es de color azul");

    private String description;

    private Colores(String d) {
        this.description = d;
    }

    public String getDescription() {
        return this.description;
    }
}
