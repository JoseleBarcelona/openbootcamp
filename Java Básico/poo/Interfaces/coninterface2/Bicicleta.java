package CursosBootcamp.poo.Interfaces.coninterface2;

public class Bicicleta implements Rueda, Silla{
    @Override
    public void avanzar() {
        System.out.println("La bicicleta avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("La bicicleta se detiene");
    }

    @Override
    public void sentarse() {
        System.out.println("En la bicicleta me siento sobre la silla");
    }
}
