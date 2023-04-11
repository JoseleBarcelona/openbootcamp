package CursosBootcamp.poo.clases;

public class Vehiculo {

    //1.Atributos
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor; //Puedo usar un objeto motor de una clase Motor. Tendría un motor con todos sus atributos por cada objeto de la clase vehículo.

    //2.Constructores
    public Vehiculo(){ //Constructor vacío por si más tarde lo necesitamos

    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }
    //3.Métodos (comportamiento o acciones)

    public void acelerar(int quantity){

        this.speed += quantity;

    }

    /*
    También se pueden crear constructores con el botón derecho, generate, constructor y elegir
    los parámetros que queremos usar en el nuevo constructor a través de la sobrecarga.
     */
    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;

    }

    public Vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }
}
