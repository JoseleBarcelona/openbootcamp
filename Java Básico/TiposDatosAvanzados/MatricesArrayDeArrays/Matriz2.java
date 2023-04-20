package CursosBootcamp.JavaBasico.TiposDatosAvanzados.MatricesArrayDeArrays;

public class Matriz2 {
    public static void main(String[] args) {
        String matriz[][] = {{"Jose, pepe, Juan"}, {"Lola, Antonia, Federica"}};
        //Matriz de dos filas y tres colúmnas

        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
        }

    }
}
