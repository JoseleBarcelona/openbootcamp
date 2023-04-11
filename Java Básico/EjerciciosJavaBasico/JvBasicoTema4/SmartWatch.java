package CursosBootcamp.EjerciciosJavaBasico.JvBasicoTema4;

public class SmartWatch extends SmartDevice{

    boolean contestar = false;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String marca, String modelo, String color, int peso, double dimension, boolean contestar) {
        super(marca, modelo, color, peso, dimension);
        this.contestar = contestar;
        contestar();
    }
    public void contestar(){
        if (contestar == true){
            System.out.println("\nLlamada entrante");
        }else {
            System.out.println("\nEl número al que llama, está apagado o fuera de cobertura");
        }

    }

}
