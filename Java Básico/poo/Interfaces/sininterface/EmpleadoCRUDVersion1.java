package CursosBootcamp.poo.Interfaces.sininterface;

import java.util.ArrayList;
import java.util.List;

/*
   CRUD
   Create
   Retrieve/Read
   Update
   Delete
 */
public class EmpleadoCRUDVersion1 {
    //Estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    //Operaciones CRUD
    // CREATE - guardar un empleado
    public void guardar(Empleado empleado){

        empleados.add(empleado);
    }
    public List<Empleado> findAll(){
        return empleados;
    }
}
