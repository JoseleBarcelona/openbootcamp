package ClasesBootcamp;

public class Coche {  //Clase generada como plantilla para crear objetos

    //atributos

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double Longitud;
    Integer velocidad = 0;

    //constructores (permiten crear objetos de la clase que se está creando "Coche")

    public Coche(){

    }

    public Coche(String color, String fabricante, String modelo, Double peso, Double longitud) {

        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.Longitud = longitud;

    }

    // comportamiento

    public void acelerar(Integer cantidad){
        if (cantidad > 0 && cantidad <=100){
            this.velocidad += cantidad;



        }



    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", Longitud=" + Longitud +
                ", velocidad=" + velocidad +
                '}';
    }
}
