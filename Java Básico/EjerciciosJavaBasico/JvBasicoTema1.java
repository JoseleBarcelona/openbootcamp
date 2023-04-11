package CursosBootcamp.EjerciciosJavaBasico;

public class JvBasicoTema1 {
    public static void main(String[] args) {

        short numero1 = 5;
        int numero2 = 10;
        long numero3 = 200;
        float numero4 = 50.2f;
        double numero5 = 30.5d;
        boolean verdadero = true;
        boolean falso = false;
        String resultado = "Esto es un ejercicio de operaciones aritméticas cuyo resultado es= ";

        System.out.println(resultado + numero3*numero1/numero2);
        System.out.println("Float es una variable de decimales de menor exactitud " + numero4);
        System.out.println("double es una variable de decimales de mayor exactitud " + numero5);
        System.out.println("El sol sale por las mañanas= " + verdadero);
        System.out.println("La luna sale por las mañanas= " + falso);
    }
}
