package CursosBootcamp.TiposDatosAvanzados.String;

public class StringLowerCase {
    public static void main(String[] args) {
        String cadena = "MenSaJE de TEXTo";

        String cadenaMayus = cadena.toLowerCase();
        String cadenaMinus = cadena.toUpperCase();

        System.out.println("\n" + cadenaMayus);
        System.out.println(cadenaMinus);
        System.out.println(cadena.toUpperCase()); //También se puede llamar directamente al objeto sin guardarlo en una variable.
        //toUpperCase() llama al método pasar a mayúsculas
        //toLowerCase() llama al método pasar a minúsculas
    }
}
/*
Código ejecutado

mensaje de texto
MENSAJE DE TEXTO
MENSAJE DE TEXTO

Process finished with exit code 0

 */
