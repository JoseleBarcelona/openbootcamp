package CursoJavaBasico.EstructurasControl.Repeticion;

public class For {
    public static void main(String[] args) {

        for (int i = 0; i <10; i++){
            System.out.println("El valor de i es: " + i );

        }
        for (int k = 0; k < 10; k+=2){
            System.out.println("El valor de j se incrementa en 2: " + k );
        }

        String[] nombres = {"Papa", "Mama", "Neus"}; //length es la longitud de la array (3 Strings en este caso)
        for (int i = 0; i < nombres.length; i++){
            //nombres.length llama a los 3 Strings
            System.out.println(nombres[i]);
        }
        int[] numeros = {5, 7, 8};
        for (int i = 0; i <numeros.length; i++){
            System.out.println(numeros[i]);
        }
        int suma = 0;
        int[] numero = {10, 11, 12};
        for (int i = 0; i <numero.length; i++){
            suma = suma + numero[i];
            System.out.println(suma);

        }
        int multiplicacion = 1;
        int[] num = {10, 20, 30};
        for (int i = 0; i <num.length; i++){
            multiplicacion = multiplicacion * num[i];
            System.out.println(multiplicacion);
        }
        int resta = 0;
        int[] rest = {10, 20, 30};
        for (int i = 0; i < rest.length; i++){
            resta = resta - rest[i];
            System.out.println(resta);
        }
    }
}
