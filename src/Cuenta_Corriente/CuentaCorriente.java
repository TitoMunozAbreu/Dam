package Cuenta_Corriente;

public class CuentaCorriente {
    String DNI;
    String nombre_titular;
    double saldo;

    public CuentaCorriente(String DNI, String nombre_titular){
        this.DNI = DNI;
        this.nombre_titular = nombre_titular;
        this.saldo = 0;
    }

    public void sacarDinero(double r){
        if(this.saldo >= r){
            saldo -= r;
            System.out.println("** Transaccion Exitosa ** \n" +
                                "Saldo actual: " + this.saldo + "\n" +
                                "Monto extraido: " + r);
        }else {
            System.out.println("** Saldo Insuficiente **");
        }
    }

    public double ingresarDinero(double i){
        double ingreso = 0;
        if(i < 0){
            System.out.println("Solo puedes hacer ingresos a partir de 1 EUR");
        }else{
            this.saldo += i;
            ingreso = this.saldo;
            System.out.println("** Transaccion Exitosa ** \n" +
                                "Monto ingresado: " + i + "\n" +
                                "Saldo actual: " + this.saldo + "\n");
        }
        return ingreso;
    }

    @Override
    public String toString() {
        String cadFormateada = String.format("%,.2f€ ", this.saldo);
        return "Nombre Titular: " + this.nombre_titular + "\n" +
                "DNI: " + this.DNI + "\n" +
                "Saldo actual: " + cadFormateada;
    }
}
