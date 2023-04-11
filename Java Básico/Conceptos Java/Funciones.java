package CursosBootcamp.ConceptosJava;

public class Funciones {

    public static void main(String[] args) {

        holaMundo();
        holaMundo();
        holaMundo("Núria");
        holaMundo("Neus");
        devolverHola();

    }

    protected static void holaMundo() {

        System.out.println("Núria te adoro");
    }

    public static void holaMundo(String name) {
        System.out.println(name + " vida mia");


    }

    public static void devolverHola() {
        System.out.println("Hola");

    }


}
