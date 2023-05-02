package CursosBootcamp.JavaAvanzado.ProgramacionFuncional;

import java.util.function.Function;

public class Main1 {

    public static void main(String[] args) {
        Funcionales1 funcionales = new Funcionales1();
        funcionales.pruebas();

    }
}
class Funcionales1 {
    //Function<> es el método funcional
    private Function<String, String> toMayus = (x) -> x.toUpperCase();
    //El primer String es el parametro de entrada y el segundo String te retorna la función x.toUpperCase CONVIERTE EN MAYUSCULAS
    private Function<Integer, Integer> sumador = (x) -> x.sum(x, x);
    //El primer Integer es el parametro de entrada y el segundo Integer te retorna la función x.tosum(); LO SUMA

    public void pruebas(){
        System.out.println(toMayus.apply("Antonio")); //apply añade el argumento de la función
        System.out.println(sumador.apply(5));
    }
}
/*
Código ejecutado

ANTONIO
10
 */