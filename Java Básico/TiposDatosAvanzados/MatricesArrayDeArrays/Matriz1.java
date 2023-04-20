package CursosBootcamp.TiposDatosAvanzados.MatricesArrayDeArrays;

public class Matriz1 {
    public static void main(String[] args) {
        int matriz[][] = new int[2][4];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;

        matriz[1][0] = 10;
        matriz[1][1] = 20;
        matriz[1][2] = 30;
        matriz[1][3] = 40;

        System.out.println("");

        for (int i=0; i< 2; i++){  //El primer for recorre el primer array que es de 2 índices
            System.out.println("El valor de i es: " + i);
            for (int j=0; j< 4; j++){  //el segundo for recorre el segundo array que es de 4 índices
                System.out.println("En el índice " + i + " el índice j es: " + j);
            }
            System.out.println("");
        }
        System.out.println("La matriz es:");

        for (int k=0; k < matriz.length; k++){
            for (int l=0; l < matriz[k].length; l++){
                System.out.print(" " + matriz[k][l]);

            }
            System.out.println("");
        }
    }
}
/*
Código ejecutado

El valor de i es: 0
En el índice 0 el índice j es: 0
En el índice 0 el índice j es: 1
En el índice 0 el índice j es: 2
En el índice 0 el índice j es: 3

El valor de i es: 1
En el índice 1 el índice j es: 0
En el índice 1 el índice j es: 1
En el índice 1 el índice j es: 2
En el índice 1 el índice j es: 3

La matriz es:
 1 2 3 4
 10 20 30 40

Process finished with exit code 0
 */
