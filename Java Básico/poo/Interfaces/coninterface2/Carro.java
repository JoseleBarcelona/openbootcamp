package CursosBootcamp.poo.Interfaces.coninterface2;

import java.util.SortedMap;

public class Carro implements Rueda{
    public Carro(){

    }

    @Override
    public void avanzar() {
        System.out.println("El carro avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("El carro se detiene");
    }
}
