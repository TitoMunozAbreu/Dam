package Ejercicio_EmpresaFerroviaria;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        //Iniciliazar Maquinista
        Maquinista maquinista_1 = new Maquinista("Papaya", "6589790D", 1450.50,"Peon" );
        //Iniciliazar Mecanico
        Mecanico mecanico_1 = new Mecanico("Mango con sal", "69872X", 1800.50, "6985214", Especialidades.FRENOS);
        //Iniciliazar Jefe
        Jefe_Estacion jefe = new Jefe_Estacion("Bustamante", "4587655Y", 2550.50, LocalDate.of(2020,5,20));
        //Inicializar Vagon
        Vagon vagon_1 = new Vagon(1, 1500, 1000, "Reactiva");
        Vagon vagon_2 = new Vagon(2, 1500, 1000, "Desechos");
        Vagon vagon_3 = new Vagon(3, 1500, 1000, "Plasticos");
        Vagon vagon_4 = new Vagon(4, 1500, 1000, "Vidrios");
        Vagon vagon_5 = new Vagon(5, 1500, 1000, "Petroleo");

        //Inicializar Locomotora
        Locomotora locomotora_1 = new Locomotora("XDF-123","1500",1999,mecanico_1 );
        //Inicializar tren
        Tren tren_1 = new Tren(locomotora_1,maquinista_1);

        //Asignar vagones al tren
        tren_1.addVagon(vagon_1);
        tren_1.addVagon(vagon_2);
        tren_1.addVagon(vagon_3);
        tren_1.addVagon(vagon_4);
        tren_1.addVagon(vagon_5);

        System.out.println();
        //mostrar datos de locomotora asignada al tren
        System.out.println(tren_1.getLocomotora());
        System.out.println();
        //mostrar datos del maquinista asignada al tren
        System.out.println(tren_1.getMaquinista());
        System.out.println();
        //mostrar datos del vagon asignada al tren
        System.out.println(tren_1.getVagon(1));

        System.out.println("Telefono del mecanico: " + mecanico_1.getTelefono());
        System.out.println(mecanico_1.getEspecialidad().getdescription());



    }
}
