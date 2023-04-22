package CursosBootcamp.JavaBasico.TiposDatosAvanzados.TryCatchThrows;

import java.util.Scanner;

public class TryCatch2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        }catch (Exception e){
            System.out.println("A problem occured: " + e);
        }
    }
    static void checkAge(int age) throws AgeException{
        if (age<18){
            throw new AgeException("\n" + "You must be 18+ to sing up");
        }else {
            System.out.println("You are now signed up!");
        }
    }
}
class AgeException extends Exception{ //Heredamos de la clase java Exception

    AgeException(String message){ //Método constructor
        super(message); //el mensaje se le envía al constructor de la clase java Exception
    }
}
