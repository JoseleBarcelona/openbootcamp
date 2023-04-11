package CursosBootcamp.CursoJavaBasico.EstructurasControl.Condicionales;

public class IfElseIf {
    public static void main(String[] args) {

        String dia = "Domingo";
        /*Equals() se usa para saber si dos objetos son del mismo tipo y tienen los mismos datos.
         Nos dara el valor true si son iguales y false si no.
        */

        if (dia.equals("Lunes")) {
            System.out.println("Empieza lo duro");
        } else if (dia.equals("Martes")) {
            System.out.println("Vamos cogiendo el ritmo");
        } else if (dia.equals("Miercoles")) {
            System.out.println("Ya estamos a mitad de semana");
        } else if (dia.equals("Jueves")) {
            System.out.println("Un día más para el viernes");
        } else if (dia.equals("Viernes")) {
            System.out.println("Por fin es viernes");
        } else if (dia.equals("Sábado")) {
            System.out.println("Fiestaaaaaaaaaa");
        } else if (dia.equals("Domingo")) {
            System.out.println("Joder, mañana es Lunes");
        } else {
            System.out.println("El día introducido no es correcto");
        }

    }
}
