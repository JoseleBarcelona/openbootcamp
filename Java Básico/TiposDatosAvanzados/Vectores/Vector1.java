package CursosBootcamp.JavaBasico.TiposDatosAvanzados.Vectores;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {

        /*Un vector es como una array, pero dinámica, aumenta de capacidad
         en función de los elementos que le agreguemos*/

        Vector<Integer> vector = new Vector<>();

        vector.add(10); //Añadimos elementos al vector
        vector.add(11);
        vector.add(12);
        System.out.println("\nDatos del vector" + vector);

        vector.remove(2);  //Eliminamos elementos del vector
        System.out.println("\nEliminamos elementos del vector" + vector);

        System.out.println("\nTamaño del vector: " + vector.size() + "\nCapacidad del vector: " + vector.capacity());

        Vector<Integer> vector2 = new Vector<>();

        vector2.add(1);
        vector2.add(1);
        vector2.add(1);
        vector2.add(1);
        vector2.add(1);
        vector2.add(1);
        vector2.add(1);
        vector2.add(1);
        vector2.add(1);
        vector2.add(1);
        vector2.add(1);

        System.out.println("\nDatos del vector2: " + vector2);
        System.out.println("\nTamaño del vector: " + vector2.size() + "\nCapacidad del vector: " + vector2.capacity());

    }
}
/*Código ejecutado


Datos del vector[10, 11, 12]

Eliminamos elementos del vector[10, 11]

Tamaño del vector: 2
Capacidad del vector: 10  (La capacidad por defecto es de 10 elementos)

Datos del vector2: [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

Tamaño del vector: 11
Capacidad del vector: 20  (A la que pasa de 10 elementos, aumenta a 20, le sigue 40, 80, 160....
 */
