package CursosBootcamp.poo.Herencia;

import CursosBootcamp.poo.clases.Motor;
import CursosBootcamp.poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {

    boolean baul;

    public Motocicleta() {

    }

    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, sport, speed, motor); //super llama al constructor que elijamos de la clase superior (Clase padre)
        this.baul = baul;
    }
}
