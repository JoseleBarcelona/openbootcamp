package CursosBootcamp.JavaBasico.TiposDatosAvanzados.TryCatchThrows;

public class Throws {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        System.out.println("El saldo depositado es de: " + cuenta.depositar(100));
        try { //intenta primero hacer esto
            System.out.println("Se retiró " + cuenta.retirar(150) + "€");

        }catch (Exception e){  //Catch captura la excepción
            System.out.println("La cantidad a retirar supera el saldo disponible, elija una cantidad inferior");

            e.printStackTrace(); //Muestra el tipo de excepción que es
            System.out.println("El tipo de excepción es : " + e.getClass());
        }

    }
}
class Cuenta{
    private double saldo; //Atributos

    public Cuenta(){  //Método constructor
        saldo = 0;
    }
    public double depositar(double cantidad){
        saldo += cantidad;
        return saldo;
    }
    public double retirar(double cantidad) throws Exception { // Throws declara que podría haber una excepción
        if (cantidad > saldo){
            throw new Exception ("No hay fondos suficientes"); // Throw lanza la excepción
        }
        saldo -= cantidad;
        return saldo;
    }
}
/*Código ejecutado

El saldo depositado es de: 100.0
La cantidad a retirar supera el saldo disponible, elija una cantidad inferior
El tipo de excepción es : class java.lang.Exception
java.lang.Exception: No hay fondos suficientes
	at CursosBootcamp.JavaBasico.TiposDatosAvanzados.TryCatchThrows.Cuenta.retirar(Throws.java:32)
	at CursosBootcamp.JavaBasico.TiposDatosAvanzados.TryCatchThrows.Throws.main(Throws.java:9)
 */