package CursosBootcamp.JavaAvanzado.ProgramacionFuncional;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main4 {
    public static void main(String[] args) {
        int[] numeros = {0,1,2,3,4,5,6,7,8,9,10};
        IntStream stnumeros = Arrays.stream(numeros);
        int resultados = stnumeros.filter(x -> x % 2 == 0).reduce(0, (x, y) -> x + y);

        System.out.println(resultados);

    }
}
/*
Código ejecutado
 30
 */
