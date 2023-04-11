package CursosBootcamp.poo.clases;

public class Motor {
    int caballos;
    double parNewton;
    int numCilindros;
    String modelo;

    public Motor(){ //Siempre construiremos un constructor vacío, para poder crear objetos vacíos, para luego añadirle valores

    }

    public Motor(int caballos, double parNewton, int numCilindros, String modelo) {
        this.caballos = caballos;
        this.parNewton = parNewton;
        this.numCilindros = numCilindros;
        this.modelo = modelo;
    }
}
