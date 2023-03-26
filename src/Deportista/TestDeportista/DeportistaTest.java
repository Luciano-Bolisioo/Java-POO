package Deportista.TestDeportista;

import Deportista.ClassDeportista.DeportistaClass;

import javax.swing.*;

public class DeportistaTest {
    public static void main(String[] args) {

        DeportistaClass accion = new DeportistaClass();
        int opcion;

        System.out.println("Ingrese sus datos personales");
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        String deporte = JOptionPane.showInputDialog("Ingrese el deporte que realiza");

        accion.setDeporte(deporte);
        accion.setApellido(apellido);
        accion.setNombre(nombre);

        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese que operación desea realizar:\n 1-Para correr\n 2-Para saltar\n 3-Para descansar"));

        System.out.println("Ingrese la acción que desea realizar");
        switch (opcion) {
            case 1:
                accion.correr();
                break;
            case 2:
                accion.saltar();
                break;
            case 3:
                accion.descansar();
                break;
            default:
                System.out.println(String.format("La opción: %d no es válida",opcion));
                break;
        }
    }
}
