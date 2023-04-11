package CursosBootcamp.CursoJavaBasico.EstructurasControl.Repeticion;

public class ForEach {
    public static void main(String[] args) {

        String[] nombres = {"Papa", "Mama", "Neus"};
        for (String nombre : nombres){
            System.out.println(nombre);
        }
        int[] numeros = {5, 10, 15};
        for (int numero : numeros){
            System.out.println(numero);
        }
        int suma = 0;
        int[] masnumeros = {10, 20, 30};
        for (int masnumero : masnumeros){
            suma += masnumero;
            System.out.println(suma);
        }
    }
}
