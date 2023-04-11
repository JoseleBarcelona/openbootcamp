package CursosBootcamp.EjerciciosJavaBasico.JvBasicoTema4;

public class SmartPhone extends SmartDevice{
    boolean llamar = true;


    public SmartPhone() {

    }

    public SmartPhone(String marca, String modelo, String color, int peso, double dimension, boolean llamar) {
        super(marca, modelo, color, peso, dimension);
        this.llamar = llamar;
        llamar();
    }
    public void llamar(){
        if (llamar == true){
            System.out.println("\nLlamada entrante");
        }

    }
}
