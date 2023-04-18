package CursosBootcamp.EjerciciosJavaBasico.JvBasicoTema5;

public class Main {
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();
    public static void main(String[] args) {
        cocheCRUD.save();
        cocheCRUD.delete();
        cocheCRUD.findAll();
    }
}
