package CursosBootcamp.JavaBasico.TiposDatosAvanzados.TryCatchThrows;

public class TryCatch1 {
    public static void main(String[] args) {

        dividir(4, 0);
    }

    public static int dividir(int a, int b) {
        int resultado = 0;
        try {
            resultado = a / b;
            System.out.println("El resultado de la división es de: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Esto es una excepción del tipo: " + e.getClass());
        }finally {
            System.out.println("Programa terminado");
        }
        return resultado;
    }
}
/*
Código ejecutado

Esto es una excepción del tipo: class java.lang.ArithmeticException
Programa terminado

 */
