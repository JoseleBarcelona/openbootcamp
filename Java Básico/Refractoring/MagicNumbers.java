package CursosBootcamp.Refractoring;

public class MagicNumbers {

    /*
    Creamos contantes y así podemos cambiarlo en un futuro desde aquí y no tener que ir clase por
    clase cambiando en el código que haya sido implementado.
     */
    private static final double PRECIO_MINIMO_COMPRA = 100;
    private static final double PRECIO_ENVIO = 2.99;
    private static final double ENVIO_GRATIS = 0;

    public static void main(String[] args) {
        double price = 129.99;

        double shippingPrice = calculateShipping(price);
        double discountPrice = calculateDiscount(price);

    }
    private static double calculateShipping(double price){
        return price< PRECIO_MINIMO_COMPRA ? PRECIO_ENVIO : ENVIO_GRATIS;
    }
    private static double calculateDiscount(double price){
        return price * 0.1;
    }
}
