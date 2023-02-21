package CursoJavaBasico.Funciones;

public class Funciones2 {

    public static void main(String[] args) {

        int resultado1 = suma(50, 30);
        int resultado2 = suma(15, 25);
        int resultado3 = suma(5, 10);
        System.out.println(resultado1 + resultado2 - resultado3);

    }

    public static int suma(int numero1, int numero2) {

        return numero1 + numero2;
    }
}
