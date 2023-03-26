package Ascensor.TestAscensor;

import Ascensor.ClassAsensor.AscensorClass;

import javax.swing.*;

public class AscensorTest {
    public static void main(String[] args) {
        AscensorClass accion = new AscensorClass();
        int opcion;

        System.out.println("Ingrese sus datos personales");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del ascensor");
        Integer numeroserie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de serie del ascensor"));

        accion.setMarca(marca);
        accion.setNumeroSerie(numeroserie);

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que operación desea realizar:\n 1-Para subir\n 2-Para bajar"));

        System.out.println("Ingrese la acción que desea realizar");
        switch (opcion) {
            case 1:
                accion.subir();
                break;
            case 2:
                accion.bajar();
                break;
            default:
                System.out.println(String.format("La opción: %d no es válida",opcion));
                break;
        }
    }
}
