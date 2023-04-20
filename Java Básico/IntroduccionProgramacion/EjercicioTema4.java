package IntroduccionProgramacion;

import CursosBootcamp.JavaBasico.ConceptosJava.Whileloop;

import javax.sound.midi.Soundbank;

public class EjercicioTema4 {
    public static void main(String[] args) {
        int numeroIf = 0;
        int numeroWhile = 0;
        int numeroWhile2 = 5;
        String estacion = "Verano";


        if (numeroIf > 0){
            System.out.println("\nEl número es positivo");
        } else if (numeroIf == 0) {
            System.out.println("\nEl número es 0");
        }else {
            System.out.println("\nEl número es negativo");
        }
        System.out.println("");

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("");
       do {
            System.out.println(numeroWhile2);
            numeroWhile2++;
        } while (numeroWhile2 < 3);
        System.out.println("");

        for (int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }
        switch (estacion){
            case "Verano":
                System.out.println("\nEs verano");
                break;
            case "Otoño":
                System.out.println("\nEs Otoño");
                break;
            case "Invierno":
                System.out.println("\nEs invierno");
                break;
            case "Primavera":
                System.out.println("\nEs Primavera");
                break;
            default:
                System.out.println("\nLa estación digitada no se corresponde con las anuales");
        }
    }
}
/*
Código ejecutado

El número es 0

0
1
2

5

0
1
2
3

Es verano
 */
