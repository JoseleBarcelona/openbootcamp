package IntroduccionProgramacion;

public class EjercicioTema3 {
    public static void main(String[] args) {

        int resultado = suma(5,10,15); //Invocamos a la función y la guardamos en una variable para mostrar en consola
        System.out.println("\nLa suma de a, b, y c es de: " + resultado);

        Coche miCoche = new Coche();

        miCoche.añadirPuertas();

        System.out.println("\nEl coche tenía 4 puertas");
        System.out.println("\nAhora tiene " + miCoche.numeroDePuertas + " puertas");
    }
    public static int suma(int a, int b, int c){
        return a +b +c; //Esto devuelve unos datos que para poder utilizarlos, hay que guardarlos en una variable
    }

}
class Coche{
    public int numeroDePuertas = 4;

    public void añadirPuertas(){
        this.numeroDePuertas++;
    }

}
/*
Código ejecutado

La suma de a, b, y c es de: 30

El coche tenía 4 puertas

Ahora tiene 5 puertas
 */
