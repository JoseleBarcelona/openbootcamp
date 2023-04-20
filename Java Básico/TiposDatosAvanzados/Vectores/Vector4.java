package CursosBootcamp.JavaBasico.TiposDatosAvanzados.Vectores;

import java.util.Vector;

public class Vector4 {
    public static void main(String[] args) {
        //Los vectores pueden ser de cualquier tipo (String, long, byte...)
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        for (int i : vector){ //foreach nos recorre los valores del vector
            System.out.println("Valor " + i);
        }
        System.out.println("");
        for (int i=0; i<vector.size(); i++){ //Este nos recorre los índices
            System.out.println("índice " + i);
        }
        System.out.println("");
        for (int j=0; j<vector.size(); j++){
            System.out.println("Valor: " + vector.get(j));
        }
        System.out.println("Tamaño: " + vector.size() + " Capacidad: " + vector.capacity());
        vector.trimToSize(); //Ajusta la capacidad al tamaño, pero si se hace mucho, ralentiza la ejecución del código
        System.out.println("Tamaño: " + vector.size() + " Capacidad: " + vector.capacity());


    }
}
/*
Código ejecutado

Valor 1
Valor 2
Valor 3
Valor 4

índice 0
índice 1
índice 2
índice 3

Valor: 1
Valor: 2
Valor: 3
Valor: 4
Tamaño: 4 Capacidad: 10
Tamaño: 4 Capacidad: 4
 */
