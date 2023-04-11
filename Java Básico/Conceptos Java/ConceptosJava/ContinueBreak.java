package CursosBootcamp.ConceptosJava;

public class ContinueBreak {

    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {

            count++;
            if (count == 6)
                break; //Rompe el flujo de ejecución (rompe el bucle)

               // continue; //Salta el valor 6 y continua a la siguiente iteración
            System.out.println("Hola mundo " + count);
        }
        System.out.println("Fin");
    }
}
