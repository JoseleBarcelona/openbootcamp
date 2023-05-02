package CursosBootcamp.JavaAvanzado.Recursion;

import java.util.stream.IntStream;

public class RecursionSumatoria {

    // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 15
    public static void main(String[] args) {
        System.out.println("Suma iterativa: " + sumaIterativa(5));
        System.out.println("Suma recursiva: " + sumaRecursiva(5));
        System.out.println("Suma funcional: " + sumaFuncional(5));
        tailRecursion(5);
        headRecursion(5);
    }
    public static int sumaIterativa(int numero){ //Suma con el método básico iterativo 15
        int resultado = 0;
        for(int i = 0; i <= numero; i++){
            resultado += i;
        }
        return resultado;
    }
    public static int sumaRecursiva(int numero){ //Suma con el método recursivo 15
        if (numero == 0){  //Sentencia de control para que no sea infinito y no desborde la memoria (overflow). Para la recursividad
            return 0;
        }
            return numero + sumaRecursiva(numero - 1);
         }
         public static int sumaFuncional(int numero){  //Suma con el método funcional 15
             return IntStream.rangeClosed(0, numero).reduce(0, (a, b) -> a + b); //Lambda
             /*
             Intstream da números, rangeClosed genera los números (0 primer número, numero último número)
              */
         }
         public static void tailRecursion(int numero){ //Recursión de cola es cuando lo último que se invoca es la función
            if (numero == 0){
                return;
            }
             System.out.println(numero);
            tailRecursion(numero - 1);
         }
         public static void headRecursion(int numero){
            if (numero == 0){
                return;
        }
        headRecursion(numero - 1);  //Recursión en cabeza
             System.out.println(numero);
         }

}
/*
Código ejecutado

Suma iterativa: 15
Suma recursiva: 15
Suma funcional: 15
5
4
3
2
1
1
2
3
4
5
 */
