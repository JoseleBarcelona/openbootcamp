package EjerciciosJavaBasico;

public class JvBasicoTema2 {

    public static void main(String[] args) {

        double precio = ivaagregado(250);
        System.out.println(precio);

    }
    private static double ivaagregado(double nume1) {

        System.out.println("Valor dado= " + nume1);
        System.out.println("IVA= " + nume1 * 21/100);
        System.out.println("Total ");

        return nume1 * 21/100 + nume1;
         /*Esto devuelve la suma del precio dado, le aplica el IVA
        y posteriormente se lo suma para dar el total a cobrar en una factura.
       */
    }
}
