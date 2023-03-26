package Persona.TestPersona;

import Persona.ClassPersona.PersonaClass;

import javax.swing.*;

public class PersonaTest {
    public static void main(String[] args) {

        PersonaClass accion = new PersonaClass();
        int opcion;

        System.out.println("Ingrese sus datos personales");
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        Integer edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        accion.setEdad(edad);
        accion.setApellido(apellido);
        accion.setNombre(nombre);

        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese que operación desea realizar:\n 1-Para saltar\n 2-Para caminar\n 3-Para hablar"));

        System.out.println("Ingrese la acción que desea realizar");
        switch (opcion) {
            case 1:
                accion.saltar();
                break;
            case 2:
                accion.caminar();
                break;
            case 3:
                accion.hablar();
                break;
            default:
                System.out.println(String.format("La opción: %d no es válida",opcion));
                break;
        }
    }
}
