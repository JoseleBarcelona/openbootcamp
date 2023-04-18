package CursosBootcamp.EjerciciosJavaBasico.JvBasicoTema5;

public class CocheCRUDImpl implements CocheCRUD{
    public CocheCRUDImpl(){

    }
    @Override
    public void save() {
        System.out.println("Este es el método SAVE");
    }

    @Override
    public void findAll() {
        System.out.println("Este es el método FINDALL");
    }

    @Override
    public void delete() {
        System.out.println("Este es el método DELETE");
    }
}
