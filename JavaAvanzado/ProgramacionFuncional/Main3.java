package CursosBootcamp.JavaAvanzado.ProgramacionFuncional;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Paco");
        nombres.add("Antonio");
        nombres.add("Pedro");

        Stream<String> valores = nombres.stream()
                .map((x) -> x.toUpperCase()) //Convierte los tres nombres en mayúsculas
                .filter((x) -> x.startsWith("P")); //Filtra los nombres que empiezan por P


        valores.forEach((x) -> System.out.println(x));
        //map te da un método por cada stream que se le pase
        //El stream la desventaja es que una vez lo usas, se consume y no puedes volver a utilizarlo

    }
}
/*Codigo ejecutado

PACO
PEDRO
 */
