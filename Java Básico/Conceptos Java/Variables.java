package CursosBootcamp.ConceptosJava;

public class Variables {
    public static void main(String[] args) {

        // enteros
        byte numero1 = 1;  //1 byte
        short numero2 = 2; //2 byte
        int numero3 = 3;   //4 byte
        long numero4 = 4L;  //8 byte

        // decimales
        float decimal1 = 4.9f;  // float se le suele añadir una f para distinguirlo del double
        double decimal2 = 9.99; // double tiene mayor capacidad que float y es más preciso en los cálculos

        // caracter(sólo admite un caracter)
        char caracter1 = 'a';

        //booleanos
        boolean verdadero = true;
        boolean falso = false;

        // cadenas de texto;
        String nombre = "Núria";
        String apellido = "Barbero";

        // tipos envoltorio
        Integer numero = null; /* Integer con mayúscula, permite  crear una clase para poder añadir un null (En caso de que no tengamos el valor numérico porque lo desconozcamos
                                  o el usuario no lo haya introducido todavía en la aplicación o program */
        Long numero5 = 2L; // la L indica qué es un número long//
        // Los tipos primitivos, son los que empiezan por letra minúscula, como por ejemplo char, int, doubl, (no admiten null ya que tienen que ir acompañados de un valor)
        // Los tipos compuestos empiezan por mayúsculas, por lo que serían clases y admiten null, como por ejemplo String, Integer, etc.
        // null significa que no tiene un valor definido

    }

}