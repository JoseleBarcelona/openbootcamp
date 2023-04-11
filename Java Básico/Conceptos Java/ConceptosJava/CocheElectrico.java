package CursosBootcamp.ConceptosJava;

public class CocheElectrico extends Coche{

    String motorElectrico;
    public CocheElectrico() {

    }
    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double longitud, String motorElectrico){
        super(color, fabricante, modelo, peso, longitud);
        this.motorElectrico = motorElectrico;

    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", Longitud=" + Longitud +
                ", velocidad=" + velocidad +
                '}';
    }

}
