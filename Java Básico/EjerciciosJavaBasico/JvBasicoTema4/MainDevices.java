package CursosBootcamp.EjerciciosJavaBasico.JvBasicoTema4;

public class MainDevices {
    public static void main(String[] args) {

        SmartDevice device[] = new SmartDevice[2];
        device[0] = new SmartPhone("Huawei","P30","Negro",165,71.36,true);
        device[1] = new SmartWatch("Samsung","Galaxy watch4","Violeta",52,46,false);

        for(SmartDevice iterador: device){
            System.out.println(iterador.toString());
            System.out.println("");

        }

    }
}
/*
Código ejecutado

Llamada entrante

El número al que llama, está apagado o fuera de cobertura

SmartDevice

Marca= Huawei
Modelo= P30
Color= Negro
Peso= 165
Dimension= 71.36


SmartDevice

Marca= Samsung
Modelo= Galaxy watch4
Color= Violeta
Peso= 52
Dimension= 46.0


Process finished with exit code 0

 */
