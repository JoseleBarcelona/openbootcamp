package EjerciciosJavaBasico;

public class JvBasicoTema2 {

    public static void main(String[] args) {

        double precio = ivaagregado(250);
        System.out.println(precio);

    }
    private static double ivaagregado(double nume1) {

        /*Esto devuelve la suma del precio dado, le aplica el IVA
        y posteriormente se lo suma para dar el total a cobrar en una factura.
       */
        return nume1 * 21/100 + nume1;
    }
}
