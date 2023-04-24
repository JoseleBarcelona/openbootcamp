package CursosBootcamp.JavaBasico.TiposDatosAvanzados.Vectores;

import java.util.Vector;

public class Vector3 {
    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>();
        vector1.add(1);
        vector1.add(2);

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2);

        boolean resultado = vector1.equals(vector2); //Esto compara si dos vectores son iguales, en este caso es un true
        System.out.println(resultado);
    }

}
/*Código ejecutado

true

 */
