package CursosBootcamp.poo.Interfaces.coninterface;

import CursosBootcamp.poo.Interfaces.sininterface.Empleado;
import CursosBootcamp.poo.Interfaces.sininterface.EmpleadoCRUDVersion2;

import java.util.List;

public interface EmpleadoCRUD {

    //Las interfaces solo declaran métodos, es decir, no los implementan.

    //Actúa como un contrato, dice lo que hacer pero no lo hace.
    void guardar(Empleado empleado);
    List<Empleado> findAll();

    void delete(Empleado empleado);
}
