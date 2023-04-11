package CursosBootcamp.ConceptosJava;

public class CocheObjeto {
    public static void main(String[] args) {

        Coche coche = new Coche(); /*Dentro del () pulsamos control p y nos da la opción de poner el valor de cada
        atributo que a través del this. aparecererá cual es el identificador de cada atributo */
        System.out.println(coche);

        //El new seguido del nombre de la clase que se invoca y los (); crea objetos relacionados con la clase invocada
        Coche cocheObj1 = new Coche("Azul", "Mazda", "Mazda 6", 2350.12, 6.30);
        System.out.println(cocheObj1);

        Coche cocheObj2 = new Coche("Rojo", "Honda", "Civic", 1430.55, 5.04);

        /*Después del nombre de cada objeto creado "Ejemplo cocheObjeto2" si ponemos un . nos da la opción de cambiar
        el valor de sus atributos parcialmente, debido a que a lo largo del tiempo o situación haya podido cambiar
         */
        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);

        cocheObj2.peso = 1782.32;
        cocheObj2.velocidad = 30;
        System.out.println(cocheObj2);


        /*De aquí para abajo es un nuevo objeto creado en la nueva clase "CocheElectrico" que nos enseña la capacidad
        de heredar una clase con la pañabra reservada extend
         */
        CocheElectrico cocheecologico = new CocheElectrico();
        cocheecologico.color = "Amarillo";
        cocheecologico.fabricante = "Renault";
        cocheecologico.peso = 1250.25;
        cocheecologico.modelo = "Apolo";

        System.out.println(cocheecologico);

        CocheElectrico cocheecologico2 = new CocheElectrico("Turquesa", "Opel", "Astra", 452.66, 7.25, "TXM");

        System.out.println(cocheecologico2);

        cocheecologico2.acelerar(50);
        System.out.println(cocheecologico2);

    }
}
