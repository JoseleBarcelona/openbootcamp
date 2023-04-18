package CursosBootcamp.TiposDatosAvanzados.String;

public class StringstartsWith {
    public static void main(String[] args) {
        String cadena = "MenSaJE de TEXTo";

        System.out.println(cadena.endsWith("To"));
        System.out.println(cadena.startsWith("Men"));
        //startsWith() llama al método booleano que pregunta si algo empieza por x
        /*endsWith() llama al método booleano que pregunta si un texto
         termina por x (Distingue entre mayúsculas y minúsculas*/
    }
}
/*
Código ejecutado

true
true
 */
