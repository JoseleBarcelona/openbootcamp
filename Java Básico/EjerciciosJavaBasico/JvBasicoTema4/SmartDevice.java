package CursosBootcamp.EjerciciosJavaBasico.JvBasicoTema4;

public class SmartDevice {

    String marca;
    String modelo;
    String color;
    int peso;
    double dimension;

    public SmartDevice(){

    }
    public SmartDevice(String marca, String modelo, String color, int peso, double dimension) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.peso = peso;
        this.dimension = dimension;
    }
    @Override
    public String toString() {
        return "\nSmartDevice\n" + "\nMarca= " + marca + "\nModelo= " + modelo + "\nColor= " + color + "\nPeso= " + peso + "\nDimension= " + dimension;
    }
}