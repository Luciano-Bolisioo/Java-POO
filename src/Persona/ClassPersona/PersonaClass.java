package Persona.ClassPersona;

import org.w3c.dom.ls.LSOutput;

public class PersonaClass {
    //atributos
    private String nombre;
    private String apellido;
    private Integer edad;


    //métodos

    //seteamos los campos
    public void setNombre(String nombre) {
        if (nombre.isEmpty()){
            System.out.println("El campo nombre no puede estar vacio");
            return;
        }else {
            this.nombre = nombre;
        }
    }

    public void setApellido(String apellido) {
        if (apellido.isEmpty()) {
            System.out.println("El campo apellido no puede estar vacio");
            return;
        }else {
            this.apellido = apellido;
        }
    }

    public void setEdad(Integer edad) {
        if (edad == null) {
            System.out.println("El campo edad no puede estar vacio");
            return;
        } else if (edad <= 0 || edad > 100) {
            System.out.println("La edad no puede ser menor a 0 o mayor a 100");
            return;
        }else {
            this.edad = edad;
        }

    }

    //hacemos publicos los atributos en los siguientes métodos
    public void caminar(){
        if (this.nombre == null || this.edad == null || this.apellido == null){
            return;
        }
        System.out.println(String.format("Hola %s %s de %d años de edad, seleccionaste la acción de caminar ", nombre, apellido, edad));
    }
    public void saltar () {
        if (this.nombre == null || this.edad == null || this.apellido == null){
            return;
        }
        System.out.println(String.format("Hola %s %s de %d años de edad, seleccionaste la acción de saltar ", nombre, apellido, edad));
    }
    public void hablar(){
        if (this.nombre == null || this.edad == null || this.apellido == null){
            return;
        }
        System.out.println(String.format("Hola %s %s de %d años de edad, seleccionaste la acción de hablar ", nombre, apellido, edad));
    }
}

