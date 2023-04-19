package CursosBootcamp.TiposDatosAvanzados.Arrays;

public class Arrya5 {
    public static void main(String[] args) {
        String nombres[] = {"José","Núria","Neus"};

        for (String name : nombres){  //Bucle foreach
            System.out.println("Mi nombre es " + name);
        }
        System.out.println("");  //Salto de linea

        for (int i=0; i < nombres.length; i++){  //bucle for
            System.out.println("El índice actual es " + i);
        }
        System.out.println("");

        for (int j=0; j < nombres.length; j++){
            System.out.println("Mi nombre es " + nombres[j] + " y estoy posicionado en el índice: " + j);
        }
        System.out.println("");

        String ultimoNombre = "";
        for (int i=0; i < nombres.length; i++){  //bucle for
            System.out.println("El índice actual es " + i);
            ultimoNombre = nombres[i];
        }
        System.out.println("\nEl último nombre del array es: " + ultimoNombre);
        System.out.println("");

        int contador = 0;  //También se puede hacer con un While, pero no es lo más acertado. Para arrays es mejor bucle for
        while (contador < nombres.length){
            System.out.println("Mi nombre es " + nombres[contador] + " y estoy posicionado en el índice: " + contador);
            contador++;
        }

    }
}
/*
Código ejecutado

Mi nombre es José
Mi nombre es Núria
Mi nombre es Neus

El índice actual es 0
El índice actual es 1
El índice actual es 2

Mi nombre es José y estoy posicionado en el índice: 0
Mi nombre es Núria y estoy posicionado en el índice: 1
Mi nombre es Neus y estoy posicionado en el índice: 2

El índice actual es 0
El índice actual es 1
El índice actual es 2

El último nombre del array es: Neus

Mi nombre es José y estoy posicionado en el índice: 0
Mi nombre es Núria y estoy posicionado en el índice: 1
Mi nombre es Neus y estoy posicionado en el índice: 2
 */
