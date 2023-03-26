package Cajero.TestCajero;

import Cajero.ClassCajero.CajeroClass;

import javax.swing.*;

public class CajeroTest {
    public static void main(String[] args) {

        CajeroClass cajero = new CajeroClass();
        int opcion;
        int cantidad = 0;

        System.out.println("Ingrese los datos del cajero");
        Double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo que tiene el cajero"));
        Integer capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad máxima de billetes que tiene el cajero"));
        Integer cantidadBilletes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de billetes que tiene el cajero"));

        cajero.setSaldoCajero(saldo);
        cajero.setCantidadBilletes(cantidadBilletes);
        cajero.setCapacidadMaxima(capacidad);

        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese que operación desea realizar:\n 1-Para agregar billetes\n 2-Para retirar billetes\n 3-Para ver el saldo"));

        System.out.println("Ingrese la acción que desea realizar");
        switch (opcion) {
            case 1:
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que quiere ingresar "));
                cajero.agregarBilletes(cantidad);
                break;
            case 2:
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que quiere ingresar "));
                cajero.retirarBilletes(cantidad);
                break;
            case 3:
                cajero.mostrarSaldo();
                break;
            default:
                System.out.println(String.format("La opción: %d no es válida",opcion));
                break;
        }
    }
}
