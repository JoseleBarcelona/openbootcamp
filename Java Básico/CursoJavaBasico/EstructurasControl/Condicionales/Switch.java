package CursosBootcamp.CursoJavaBasico.EstructurasControl.Condicionales;

public class Switch {
    public static void main(String[] args) {

        String dia = "Saturday";

        switch (dia) {

            case "Monday":
                System.out.println("I hate Mondays");
                break;
            case "Tuesday":
                System.out.println("The second day of the week");
                break;
            case "Wednesday":
                System.out.println("We are in the middle of the week");
                break;
            case "Thursday":
                System.out.println("Tomorrow is Friday");
                break;
            case "Friday":
                System.out.println("we finally got reached Friday");
                break;
            case "Saturday":
                System.out.println("Partyyyyyyyyyyyy!!!!!!!!!!!!");
                break;
            case "Sunday":
                System.out.println("I don´t want to work tomorrow");
                break;
            default:
                System.out.println("This day does not exist");

        }
    }
}
