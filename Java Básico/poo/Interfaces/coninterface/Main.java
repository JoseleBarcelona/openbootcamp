package CursosBootcamp.poo.Interfaces.coninterface;

import CursosBootcamp.poo.Interfaces.sininterface.Empleado;

public class Main {
     static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDExcel();
     /*
     Puedo poner tanto new EmpleadoCRUDExcel(); como EmpleadoCRUDEMySQL(); a través
     de la interface sin que afecte en cambios dentro del main.
      */
    public static void main(String[] args) {

        empleadoCRUD.findAll();
        empleadoCRUD.guardar(new Empleado());
    }
}
