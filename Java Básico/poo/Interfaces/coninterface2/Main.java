package CursosBootcamp.poo.Interfaces.coninterface2;

public class Main {
    public static void main(String[] args) {

        Carro a = new Carro();
        Bicicleta b = new Bicicleta();

        a.avanzar();
        a.detenerse();
        b.avanzar();
        b.detenerse();
        b.sentarse();

    }
}
