package Avion.TestAvion;

import Avion.ClassAvion.AvionClass;

import javax.swing.*;

public class AvionTest {
    public static void main(String[] args) {

        AvionClass accion = new AvionClass();
        int opcion;

        System.out.println("Ingrese los datos del avión");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo");
        Integer capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su capacidad"));
        Integer alturaMaxima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Altura máxima"));

        accion.setModelo(modelo);
        accion.setCapacidad(capacidad);
        accion.setAlturaMaxima(alturaMaxima);

        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese que operación desea realizar:\n 1-Para volar\n 2-Para aterrizar"));

        System.out.println("Ingrese la acción que desea realizar");
        switch (opcion) {
            case 1:
                accion.volar();
                break;
            case 2:
                accion.aterrizar();
                break;
            default:
                System.out.println(String.format("La opción: %d no es válida",opcion));
                break;
        }
    }
}
