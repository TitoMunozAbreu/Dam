package Empresa_Ferroviaria;

import java.util.Arrays;

public class Tren {
    private Locomotora locomotora;
    private Vagon[] vagones;
    private Maquinista maquinista;

    public Tren(){}

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagones = new Vagon[5];
        this.maquinista = maquinista;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public String getVagon(int id_vagon) {
        String datos_vagon = "";
        for (int i = 0; i < vagones.length; i++) {
            if(vagones[i].getId_vagon() != id_vagon){
                datos_vagon = "Vagon no asignado a locomotora";
            }else{
                datos_vagon =  vagones[i].toString();
                break;
            }
        }

        return datos_vagon;
    }

    public void addVagon(Vagon vagon) {
        for (int i = vagon.getId_vagon()-1; i < vagones.length; i++) {
            vagones[i] = vagon;
        }
        System.out.println("Vagon añadido exitosamente al tren");
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "locomotora=" + locomotora +
                ", vagon=" + Arrays.toString(vagones) +
                ", maquinista=" + maquinista +
                '}';
    }
}
