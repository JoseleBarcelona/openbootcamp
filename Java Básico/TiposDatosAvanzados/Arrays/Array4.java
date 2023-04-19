package CursosBootcamp.TiposDatosAvanzados.Arrays;

public class Array4 {
    public static void main(String[] args) {
        String nombres[] = {"Juan, Pepe, Mateo, Alberto"};
        String nombres2[] = {"Juan","Pepe","Mateo","Alberto"};
        System.out.println("\nLa longitud del array1 es de: " + nombres.length);
        System.out.println("La longitud del array2 es de: "+ nombres2.length);

        for (String i : nombres){
            System.out.println(i);
        }
        for (String j : nombres2){
            System.out.println(j);
        }
    }
}
/*
La longitud del array1 es de: 1
La longitud del array2 es de: 4
Juan, Pepe, Mateo, Alberto
Juan
Pepe
Mateo
Alberto

 */
