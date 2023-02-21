package ClasesBootcamp;

public class IfElse {

    public static void main(String[] args) {

        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        int number4 = 10;

        if (number1 < number2 && number3 < number4) {

            System.out.println("Verdadero");

        }

        else if (number3 < number4) {

            System.out.println("Esta condición se cumple");
            
        } else {
            System.out.println("falso");


        }

        System.out.println("Fin");



    }
}
