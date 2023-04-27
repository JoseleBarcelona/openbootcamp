package IntroduccionProgramacion;

public class EjercicioTema8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(19);
        persona.setNombre("Matias ");
        persona.setTelefono(652847594);
        System.out.println("\nNombre de usuario: " + persona.getNombre() + "\nEdad: " + persona.getEdad()
        + "\nTeléfono: " + persona.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
/*
Código ejecutado

Nombre de usuario: Matias
Edad: 19
Teléfono: 652847594

Process finished with exit code 0
 */
