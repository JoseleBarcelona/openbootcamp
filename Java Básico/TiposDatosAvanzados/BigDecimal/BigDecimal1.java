package CursosBootcamp.JavaBasico.TiposDatosAvanzados.BigDecimal;

import java.math.BigDecimal;

public class BigDecimal1 {
    public static void main(String[] args) {

        System.out.println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f); // = 1.0000001

        /*Esto debería de dar como resultado 1, en cambio da 1.0000001, lo que quiere decir es que los microprocesadores
        * no son tan exactos como pensamos, por eso mismo no debemos nunca usar double o float para trabajar con
        * datos financieros o datos de alta precisión numérica, para ello está el método BigDecimal*/

        BigDecimal valorA = new BigDecimal(0.2);
        BigDecimal valorB = new BigDecimal(0.1);

        BigDecimal resultado = valorA.add(valorB); //La precisión aumenta
        BigDecimal resultado2 = valorA.multiply(valorB);
        BigDecimal resultado3 = valorA.divide(valorB);
        BigDecimal resultado4 = valorA.subtract(valorB);

        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
    }
}
/*
Código ejecutado

1.0000001
0.3000000000000000166533453693773481063544750213623046875
0.0200000000000000022204460492503131424770215565731879227912941627176741932192527428924222476780414581298828125
2
0.1000000000000000055511151231257827021181583404541015625

Process finished with exit code 0

 */
