package Cajero.ClassCajero;

public class CajeroClass {
    //Atributos
    private Integer cantidadBilletes;
    private Integer capacidadMaxima;
    private Double saldoCajero;

    //Seteamos los datos
    public void setCantidadBilletes(Integer cantidadBilletes) {
        this.cantidadBilletes = cantidadBilletes;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setSaldoCajero(Double saldoCajero) {
        this.saldoCajero = saldoCajero;
    }

    //Métodos
    public void agregarBilletes(int cantidad) {
        if ((cantidad + cantidadBilletes) > capacidadMaxima) {
            System.out.println("La cantidad de billetes que quiere agregar, supera la capacidad del cajero");
        } else {
            cantidadBilletes += cantidad;
            saldoCajero += cantidad * 100;
            System.out.println(String.format("%d billetes agregados del cajero",cantidad));
        }
    }

    public void retirarBilletes(int cantidad) {
        if (cantidad > cantidadBilletes) {
            System.out.println("No hay suficientes billetes en el cajero");
        } else {
            cantidadBilletes -= cantidad;
            saldoCajero -= cantidad * 100;
            System.out.println(String.format("%d billetes retirados del cajero",cantidad));
        }
    }

    public void mostrarSaldo() {
        System.out.println(String.format("El saldo es de $ %.2f ",saldoCajero));
    }
}
