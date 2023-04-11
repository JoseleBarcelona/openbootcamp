package CursosBootcamp.poo.clases;

import CursosBootcamp.poo.Herencia.Camion;
import CursosBootcamp.poo.Herencia.Coche;
import CursosBootcamp.poo.Herencia.Motocicleta;

public class MainVehiculo {
    public static void main(String[] args) {

        //1. Creación de objetos

        //Clase identificador = new Constructor();

        //Con el objeto ToyotaPrius vamos a utilizar el constructor vacío

        Vehiculo ToyotaPrius = new Vehiculo(); //Dentro del () control+p te dice los métodos que se le puede pasar

        //Creo un objeto de la clase motor para poder pasárselo al objeto FordMondeo en este caso

        Motor motorGTI = new Motor(190, 540.25, 6, "GTI");

        //Con el objeto FordMondeo vamos a utilizar un constructor pasándole parámetros

        Vehiculo FordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0, motorGTI); //boolean pongo false para indicar que no tiene motor sport
        /*
        Le pasamos toda esta información ("Ford", "Mondeo", 2.1, 2010, false) al método constructor Vehículo
        el cual construye un objeto, nos lo devuelve y lo almacenamos en la variable FordMondeo

         */
        System.out.println(FordMondeo.fabricante);
        System.out.println(FordMondeo.year);
        System.out.println(FordMondeo.speed); //Velocidad inicial del método constructor
        FordMondeo.acelerar(50);      //Velocidad pasada llamando al método acelerar
        System.out.println(FordMondeo.speed); //Velocidad adquirida después de recibir la velocidad

        //2. Herencia

        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";
        System.out.println(kawasakiNinja.fabricante);

        //3. Polimorfismo


        Vehiculo vehiculo; //Declaramos una variable de la clase padre para crear objetos de las clases hijas

        vehiculo = new Motocicleta();  //Usamos la clase padre con los constructores y métodos de Motocicleta
        vehiculo.acelerar(10);  //llamamos al método acelerar de la clase padre y se guarda en Motocicleta

        vehiculo = new Camion();
        vehiculo.acelerar(20);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        //4. Clases abstractas: public abstract class Vehiculo {}
        //No se pueden instanciar (No se pueden crear objetos de esas clases)
        //Sólo pueden ser instanciadas sus clases hijas (Sí se pueden crear objetos)

    }
}
