package CursosBootcamp.JavaBasico.TiposDatosAvanzados.ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        //CapacidadVector = CapacidadVector * 2
        //CapacidadArraList = CapacidadArrayList + (CapacidadArrayList * 0.5)

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("H");
        arrayList.add("o");
        arrayList.add("l");
        arrayList.add("a");
        arrayList.add("Amor");
        System.out.println(arrayList);

        arrayList.remove(4);
        System.out.println(arrayList);

        for (String lista : arrayList){
            System.out.print(lista);

        }
        System.out.println("");

        for (int i=0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i));
        }
    }
}
/*código ejecutado

[H, o, l, a, Amor]
[H, o, l, a]
Hola
Hola
 */
