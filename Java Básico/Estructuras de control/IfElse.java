package CursoJavaBasico.EstructurasControl.Condicionales;

public class IfElse {
    public static void main(String[] args) {

        int edad = 19;
        boolean esMayor = edad >= 18;

        if (esMayor) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
