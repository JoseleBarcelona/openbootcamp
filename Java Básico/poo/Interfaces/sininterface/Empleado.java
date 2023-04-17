package CursosBootcamp.poo.Interfaces.sininterface;

public class Empleado {

    //1. Atributos
    String nombre;
    int edad;
    double salario;
    boolean alta;

    //2. constructores

    public Empleado(){

    }
    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
