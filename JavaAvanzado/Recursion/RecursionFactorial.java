package CursosBootcamp.JavaAvanzado.Recursion;

import java.util.stream.IntStream;

public class RecursionFactorial {
    public static void main(String[] args) {

        //El factorial de 5 es: 1 * 2 * 3 * 4 * 5 = 120

        System.out.println("Faltorial iterativo: " + factorialIterativo(5));
        System.out.println("Faltorial recursivo: " + factorialRecursivo(5));
        System.out.println("Faltorial funcional: " + factorialFuncioanl(5));
    }
    public static int factorialIterativo(int numero){
        int resultado = 1;
        for(int i = 1; i <= numero; i++){
            resultado = resultado * i;
        }
        return resultado;
    }
    public static int factorialRecursivo(int numero){
        if (numero == 0){
            return 1;
        }
        return numero * factorialRecursivo(numero - 1);
    }
    public static int factorialFuncioanl(int numero){
        return IntStream.rangeClosed(1, numero).reduce(1, (a, b) -> a * b);
    }
}
/*
Código ejecutado

Faltorial iterativo: 120
Faltorial recursivo: 120
Faltorial funcional: 120

Process finished with exit code 0
 */
