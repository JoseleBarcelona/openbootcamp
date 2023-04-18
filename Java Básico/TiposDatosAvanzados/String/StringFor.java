package CursosBootcamp.TiposDatosAvanzados.String;

public class StringFor {
    public static void main(String[] args) {
        String cadena = "Mensaje de texto";
        System.out.println("\n" + cadena.toUpperCase());

       for (int i = 0; i < cadena.length(); i++){
           System.out.print(cadena.charAt(i));
       }
        System.out.println("");

       for (int j=cadena.length()-1; j >=0; j--){
           System.out.print(cadena.charAt(j));
       }

    }
}
/*
Código ejecutado

MENSAJE DE TEXTO
Mensaje de texto
otxet ed ejasneM
Process finished with exit code 0
 */
