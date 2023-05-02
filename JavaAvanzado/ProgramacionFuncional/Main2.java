package CursosBootcamp.JavaAvanzado.ProgramacionFuncional;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Paco");
        nombres.add("Antonio");
        nombres.add("Torcuato");

        nombres.stream().forEach(System.out::println);
        //Un stream lo uníco que hace es coger un elemento y te lo da, coge otro y te lo da y así sucesivamente
        //Un stream puede invocar a cualquier método, en este caso a un forEach
        //System.out::println esto es una abreviación de una lambda: x -> System.out.println(x);

    }
}
/*
Código ejecutado

Paco
Antonio
Torcuato
 */
