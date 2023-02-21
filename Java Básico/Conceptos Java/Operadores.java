package JavaBasico;

public class Operadores {

    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 20;
        int resultadoSuma = numero1 + numero2;

        System.out.println(resultadoSuma);
        System.out.println(resultadoSuma + 5.77);

        boolean resultado1 = numero1 > numero2;
        System.out.println(resultado1);

        boolean resultado2 = numero1 < numero2;
        System.out.println(resultado2);

        //Requisitos para sacarse el carnet jove
        int edad = 17;
        boolean carnetJove = edad >= 15 && edad <= 26;
        System.out.println(carnetJove);

    }

}
