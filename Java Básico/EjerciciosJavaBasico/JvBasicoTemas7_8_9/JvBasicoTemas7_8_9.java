package CursosBootcamp.JavaBasico.EjerciciosJavaBasico.JvBasicoTemas7_8_9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class JvBasicoTemas7_8_9 {
    public static void main(String[] args) {

        reverse("hola mundo");
        arrayUnidimensional();
        arrayBidimensional();
        vectores();
        arrayList();
        arrayListInteger();
        copiarTexto("C:\\Users\\34660\\IdeaProjects\\Intellij idea\\src\\CursosBootcamp\\JavaBasico\\EjerciciosJavaBasico\\JvBasicoTemas7_8_9\\Documento de texto.txt", "C:\\Users\\34660\\IdeaProjects\\Intellij idea\\src\\CursosBootcamp\\JavaBasico\\EjerciciosJavaBasico\\JvBasicoTemas7_8_9\\Copia Documento de texto.txt");


        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDigita el numerador: ");
        int a = entrada.nextInt();
        System.out.print("Digita el denominador: ");
        int b = entrada.nextInt();
        try {
            int resultado = DividePorCero(a, b);
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }

    }
    public static String reverse(String texto){
        System.out.println("\nhola mundo al revés es:");
        String invierte = texto;
        for (int i = invierte.length()-1; i >=0; i--){
            System.out.print(invierte.charAt(i));
        }
        return invierte;
    }
    public static void arrayUnidimensional(){
        System.out.println("\n\nLos valores del array unidimensional son:");
        String marcas[] = new String[3];
        marcas[0] = "Opel";
        marcas[1] = "Pegaso";
        marcas[2] = "Renault";
        for (int i=0; i < marcas.length; i++){
            System.out.println(marcas[i]);
        }
        System.out.println("");
    }
    public static void arrayBidimensional(){
        int numeros[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i < numeros.length; i++){
            for (int j=0; j < numeros[i].length; j++){
                System.out.println("En el índice " + i + " el valor es " + numeros[i][j]);
            }
            System.out.println("");
        }
        System.out.println("La matriz es:");
        for (int k=0; k < numeros.length; k++){
            for (int l=0; l < numeros[k].length; l++){
                System.out.print(" " + numeros[k][l]);
            }
            System.out.println("");

        }
    }
    public static void vectores(){
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(11);
        vector.add(12);
        vector.add(13);
        vector.add(14);

        System.out.println("\n" + "Los valores del vector son: " + vector);
        vector.remove(1);
        vector.remove(1);
        System.out.println("\n" + "Los valores actuales del vector son: " + vector);
        /*
        4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
        si tuviésemos 1000 elementos para ser añadidos al mismo.
           El problema es que cada vez que un vector crece, por debajo se hace una copia del array actual
           y deja espacio para el siguiente y eso computacionalmente es insostenible si la cantidad es muy
           grande, ya que la array va desde 10, 20, 40, 80 y así sucesivamente.
         */
    }
    public static void arrayList(){
        System.out.println("\nEl saludo es:");
        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("H");
        arrayList1.add("O");
        arrayList1.add("L");
        arrayList1.add("A\n");
        for (String saludo : arrayList1){
            System.out.print(saludo);
        }
        LinkedList<String> linkedList = new LinkedList<>(arrayList1);
        for (String saludo2 : linkedList){
            System.out.println(saludo2);
        }

    }
    public static void arrayListInteger(){
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i=1; i <= 10; i++){
            lista.add(i);
        }
        System.out.println("Lista entera rellenada: " + lista);
        for (int j=0; j <lista.size(); j++){
            if (lista.get(j) %2 == 0){
                lista.remove(j);
            }
        }
        System.out.println("Lista con los números pares eliminados: " + lista);
    }
    public static int DividePorCero(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Esto no puede hacerse");
        }
        return a / b;
    }
    public static void copiarTexto(String fileIn, String fileOut){
        try {
            InputStream entrada = new FileInputStream(fileIn);
            byte[] leerDatos = entrada.readAllBytes();
            entrada.close();

            PrintStream salida = new PrintStream(fileOut);
            salida.write(leerDatos);
            salida.close();


        }catch (IOException e){
            System.out.println("Excepción: " + e.getMessage());

        }

    }

}
