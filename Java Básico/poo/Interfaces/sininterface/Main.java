package CursosBootcamp.poo.Interfaces.sininterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //USAMOS VERSION 1 (Si la descomentamos y comentamos la versión 2, funciona)

        EmpleadoCRUDVersion1 empleadoCRUDVersion1 = new EmpleadoCRUDVersion1();

        Empleado juanito = new Empleado("Juanito", 18, 1200,true);
        Empleado antonia = new Empleado("antonia", 51, 1200,true);
        Empleado marcos = new Empleado("marcos", 47, 1200,true);

        //guardar empleados

        empleadoCRUDVersion1.guardar(juanito);
        empleadoCRUDVersion1.guardar(antonia);
        empleadoCRUDVersion1.guardar(marcos);

        //consultar empleados

        List<Empleado> empleados = empleadoCRUDVersion1.findAll();
        System.out.println("\n" + empleados);

        //USAMOS VERSION 2
        /*
        Nos toca cambiar métodos en el main en caso de que queramos implementar una clase nueva
        lo cual nos complica el reutilizar código si el código es muy extenso, de ahí la implementación
        de una interface, para lograr una clase que abstraiga las implementaciones a través de ella, del
        método main.
         */


       /* EmpleadoCRUDVersion2 empleadoCRUDVersion1 = new EmpleadoCRUDVersion2();

        Empleado juanito = new Empleado("Juanito", 18, 1200,true);
        Empleado antonia = new Empleado("antonia", 51, 1200,true);
        Empleado marcos = new Empleado("marcos", 47, 1200,true);

        //guardar empleados

        empleadoCRUDVersion1.guardar(juanito);
        empleadoCRUDVersion1.guardar(antonia);
        empleadoCRUDVersion1.guardar(marcos);

        //consultar empleados

        List<Empleado> empleados = empleadoCRUDVersion1.findAll();
        System.out.println("\n" + empleados); */

    }

}
