package Ascensor.ClassAsensor;

public class AscensorClass {
    //Atributos
    private Integer numeroSerie;
    private String marca;

    //Seteamos los datos en los atributos
    public void setNumeroSerie(Integer numeroSerie) {
        if (numeroSerie == null){
            System.out.println("El campo número de serie no puede estar vacío");
        }
        this.numeroSerie = numeroSerie;
    }

    public void setMarca(String marca) {
        if (marca.isEmpty()){
            System.out.println("El campo marca no puede estar vacío");
            return;
        }
        this.marca = marca;
    }

    //Hacemos públicos los siguientes métodos para mostrar los atributos

    public void subir (){
        if (this.marca == null || this.numeroSerie == null) {
            return;
        }
        System.out.println(String.format("El ascensor de la marca: %s y con el número de serie: %d, comienza a subir", marca, numeroSerie));
    }

    public void bajar (){
        if (this.marca == null || this.numeroSerie == null) {
            return;
        }
        System.out.println(String.format("El ascensor de la marca: %s y con el número de serie: %d, comienza a bajar", marca, numeroSerie));
    }
}
