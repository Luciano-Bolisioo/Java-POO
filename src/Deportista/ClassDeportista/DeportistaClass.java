package Deportista.ClassDeportista;

public class DeportistaClass {
    //atributos
    private String nombre;
    private String apellido;
    private String deporte;


    //métodos

    //seteamos los campos
    public void setNombre(String nombre) {
        if (nombre.isEmpty()){
            System.out.println("El campo nombre no puede estar vacio");
            return;
        }else{
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

    public void setDeporte(String deporte) {
        if (deporte.isEmpty()) {
            System.out.println("El campo apellido no puede estar vacio");
            return;
        }else {
            this.deporte = deporte;
        }

    }

    //hacemos públicos los atributos en los siguientes métodos
    public void correr(){
        if (this.nombre == null || this.deporte == null || this.apellido == null){
            return;
        }
        System.out.println(String.format("Hola soy %s %s y hago %s como deporte, seleccionaste la acción de correr ", nombre, apellido, deporte));
    }
    public void saltar () {
        if (this.nombre == null || this.deporte == null || this.apellido == null){
            return;
        }
        System.out.println(String.format("Hola soy %s %s y hago %s como deporte, seleccionaste la acción de saltar ", nombre, apellido, deporte));
    }
    public void descansar(){
        if (this.nombre == null || this.deporte == null || this.apellido == null){
            return;
        }
        System.out.println(String.format("Hola soy %s %s y hago %s como deporte, seleccionaste la acción de descansar ", nombre, apellido, deporte));
    }
}
