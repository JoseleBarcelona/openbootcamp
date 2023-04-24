package CursosBootcamp.JavaBasico.TiposDatosAvanzados.Mapas;

import java.util.HashMap;
import java.util.Map;

public class Mapa1 {
    public static void main(String[] args) {
        /*Un mapa es igual que un diccionario en python, el cual tiene una clave y un valor.
        * Se le pueden poner como clave o valor lo que queramos, (Otro mapa, un Integer,un String....)
        * La clave no puede estar nunca duplicada*/

        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Clave1", 10); //Esto es para agregar la clave y el valor dentro del mapa
        mapa.put("Clave2", 20);
        mapa.put("Clave3", 30);

        System.out.println(mapa); //Resultado: {Clave3=30, Clave1=10, Clave2=20} está desordenado
        System.out.println(mapa.get("Clave1")); //Resultado 10
        mapa.replace("Clave1", 90);  //Esto reemplaza el valor de la clave indicada
        System.out.println(mapa.get("Clave1")); //Resultado 90
        System.out.println(mapa); //Resultado {Clave3=30, Clave1=90, Clave2=20}
        mapa.remove("Clave2"); //Esto elimina un valor
        System.out.println(mapa);  //{Clave3=30, Clave1=90}

        for (Map.Entry<String, Integer> elemento : mapa.entrySet()){ //Existe esta manera especial de recorrer el mapa forEach llamando a métodos
            System.out.println("Para la " + elemento.getKey());
            System.out.println("El valor es: " + elemento.getValue());
        }
    }
}
/*Código ejecutado

{Clave3=30, Clave1=10, Clave2=20}
10
90
{Clave3=30, Clave1=90, Clave2=20}
{Clave3=30, Clave1=90}
Para la Clave3
El valor es: 30
Para la Clave1
El valor es: 90
 */