package CursosBootcamp.JavaBasico.TiposDatosAvanzados.TryCatchThrows;

public class Throws2 {
    public static void main(String[] args) {
        int x = Math.incrementExact(2147483647); //integer overflow (Desbordamiento en memoria)
        int y = Math.incrementExact(17); //Incrementa el valor en 1
        System.out.println(x);
        System.out.println(y);
    }
}
/*Esto nos da como resultado:
Exception in thread "main" java.lang.ArithmeticException: integer overflow
	at java.base/java.lang.Math.incrementExact(Math.java:1259)
	at CursosBootcamp.JavaBasico.TiposDatosAvanzados.TryCatchThrows.Throws2.main(Throws2.java:5)

Process finished with exit code 1

Si clickamos control+botón derecho del ratón sobre (Math.java:1259), nos lleva al método de la
clase Math:

 @IntrinsicCandidate
    public static int incrementExact(int a) {
        if (a == Integer.MAX_VALUE) {
            throw new ArithmeticException("integer overflow");
        }

        return a + 1;
    }
    Lo que te dice es que has sobrepasado el valor máximo asignado en memoria que tiene un Integer
 */