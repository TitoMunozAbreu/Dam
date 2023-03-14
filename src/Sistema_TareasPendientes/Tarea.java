package Sistema_TareasPendientes;

public class Tarea implements Comparable<Tarea>{
    private int id;
    private String desciption;
    static int nextId = 1;

    public Tarea(String desciption){
        this.desciption = desciption;
        setId();
    }

    public void setId(){
        this.id = Tarea.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    @Override
    public String toString() {
        return  "\n id = " + this.getId() + "\n" +
                "desciption = '" + this.getDesciption() + "\n";
    }

    @Override
    public int compareTo(Tarea o) {
        return Integer.compare(this.getId(),o.getId());
    }
}
