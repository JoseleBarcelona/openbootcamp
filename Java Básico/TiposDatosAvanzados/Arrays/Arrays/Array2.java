package CursosBootcamp.TiposDatosAvanzados.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int arrayDos[] = new int[5];

        arrayDos[0] = 1; //En el índice 0, tiene el valor de 1
        arrayDos[1] = 2;
        arrayDos[2] = 3;
        arrayDos[3] = 4;
        arrayDos[4] = 5;

    /*    +---+---+---+---+---+
          | 0 | 1 | 2 | 3 | 4 |  Esto es la casilla de memoria en cada índice */

        for (int i : arrayDos){
            System.out.println(i);
        }
    }
}
/*
Código ejecutado
1
2
3
4
5
 */