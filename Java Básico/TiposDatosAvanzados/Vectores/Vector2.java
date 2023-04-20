package CursosBootcamp.JavaBasico.TiposDatosAvanzados.Vectores;

import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(50, 15);
        /*le podemos dar de entrada una capacidad estimada por nosotros* por ejemplo de
        50 elementos y en caso de que se desborde, añadirle de antemano un incremento
        de la capacidad, por ejemplo de 15 elementos más/
         */

        vector.add(5);
        vector.add(5);
        vector.add(5);
        System.out.println(vector);
        System.out.println("Tamaño: " + vector.size() + "\nCapacidad: " + vector.capacity());


    }
}
/*
Código ejecutado

[5, 5, 5]
Tamaño: 3
Capacidad: 50

 */
