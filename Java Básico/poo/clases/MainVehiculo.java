package CursosBootcamp.poo.clases;

import CursosBootcamp.poo.Herencia.Motocicleta;

public class MainVehiculo {
    public static void main(String[] args) {

        //Creación de objetos
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

        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";
        System.out.println(kawasakiNinja.fabricante);



    }
}
