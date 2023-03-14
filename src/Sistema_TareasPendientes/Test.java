package Sistema_TareasPendientes;

public class Test {
    public static void main(String[] args) {
        TareasPendientes tareasPendientes = new TareasPendientes();

        tareasPendientes.agragarTarea("Estudiar Java");
        tareasPendientes.agragarTarea("Estudiar SQL");
        tareasPendientes.agragarTarea("Estudiar JS");

        System.out.println(tareasPendientes.tareas);

        System.out.println(tareasPendientes.buscarTarea(1));

        System.out.println(tareasPendientes.buscarTarea("Estudiar Java"));

        tareasPendientes.ordenaTareasbyID();
        System.out.println(tareasPendientes.tareas);
    }
}
