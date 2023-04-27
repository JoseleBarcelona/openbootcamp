package IntroduccionProgramacion;

public class EjercicioTema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 18;
        cliente.credito = 25;
        cliente.nombre = "Mangandumio";
        cliente.telefono = 589625475;
        System.out.println("Nombre del cliente: " + cliente.nombre + "\nEdad:" + cliente.edad + "\nTeléfono: " + cliente.telefono
        + "\nEl crédito que le queda en su cuenta es de: " + cliente.credito + "€");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 48;
        trabajador.nombre = "Margarito";
        trabajador.telefono = 487598682;
        trabajador.salario = 1850;
        System.out.println("\nNombre del cliente: " + trabajador.nombre + "\nEdad:" + trabajador.edad + "\nTeléfono: " + trabajador.telefono
                + "\nEl salario mensual del trabajador es de: " + trabajador.salario + "€");

    }
}
class Persona2{
    int edad;
    String nombre;
    int telefono;

}
class Cliente extends Persona2{
    int credito;

}
class Trabajador extends Persona2{
    int salario;
}
/*
Código ejecutado

Nombre del cliente: Mangandumio
Edad:18
Teléfono: 589625475
El crédito que le queda en su cuenta es de: 25€

Nombre del cliente: Margarito
Edad:48
Teléfono: 487598682
El salario mensual del trabajador es de: 1850€

Process finished with exit code 0
 */
