package CursosBootcamp.JavaAvanzado.ProgramacionFuncional;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main5 {
    public static void main(String[] args) {
        int[] numeros = {0,1,2,3,4,5,6,7,8,9,10};
        IntStream stnumeros = Arrays.stream(numeros);
        int resultados = stnumeros.filter(x -> x % 2 == 0).reduce(0, (x, y) -> {
            System.out.println("X vale: " + x + " Y vale: " + y);
            return x + y;
        });
        System.out.println("\nMi suma de pares: " + resultados);
    }
}
/*Código ejecutado

X vale: 0 Y vale: 0
X vale: 0 Y vale: 2
X vale: 2 Y vale: 4
X vale: 6 Y vale: 6
X vale: 12 Y vale: 8
X vale: 20 Y vale: 10

Mi suma de pares: 30
 */
