package Avion.ClassAvion;

public class AvionClass {
    //atributos
    private String modelo;
    private Integer capacidad;
    private Integer alturaMaxima;

    //métodos

    //seteamos los campos
    public void setModelo(String modelo) {
        if (modelo.isEmpty()){
            System.out.println("El campo modelo no puede estar vacio");
            return;
        }else {
            this.modelo = modelo;
        }
    }

    public void setAlturaMaxima(Integer alturaMaxima) {
        if (alturaMaxima == null) {
            System.out.println("El campo altura máxima no puede estar vacio");
            return;
        }else {
            this.alturaMaxima = alturaMaxima;
        }
    }

    public void setCapacidad(Integer capacidad) {
        if (capacidad == null) {
            System.out.println("El campo capacidad no puede estar vacio");
            return;
        } else if (capacidad <= 0 || capacidad > 100) {
            System.out.println("La capacidad no puede ser menor a 0 o mayor a 100");
            return;
        }else {
            this.capacidad = capacidad;
        }

    }

    //hacemos publicos los atributos en los siguientes métodos
    public void volar(){
        if (this.modelo == null || this.capacidad == null || this.alturaMaxima == null){
            return;
        }
        System.out.println(String.format("Hola el módelo %s soporta una capacidad de: %d personas y puede subir una altura de: %d metros , comienza a volar ", modelo, capacidad, alturaMaxima));
    }
    public void aterrizar () {
        if (this.modelo == null || this.capacidad == null || this.alturaMaxima == null){
            return;
        }
        System.out.println(String.format("Hola el módelo %s soporta una capacidad de: %d personas puede subir una altura de: %d metros , comienza aterrizar ", modelo, capacidad, alturaMaxima));
    }

}
