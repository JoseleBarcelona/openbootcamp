package CursoJavaBasico.Funciones;

public class Funciones1 {

    public static void main(String[] args) {
        //opción 1 : función sin parámetros y sin tipo de retorno
        showmenu();
        showmenu();
        //opción 2 : función sin parámetros y con tipo de retorno
        String menu = getmenu();
        System.out.println(menu);//Esta es una manera de llamar a la función
        System.out.println(getmenu());//Esta es otra manera de llamar a la función

        double price = getPrice();
        System.out.println("Por debajo de los " + price);


    }

    static double getPrice() {

        return 100.99;
    }

    /**
     * void indica que no devuelve nada
     */
    static void showmenu() {

        System.out.println("Bienvenidos a la zapatería Santos");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("Salir");

    }

    static String getmenu() {
        //Para cambiar de mayúsculas a minúsculas Ctr+shift+u
        System.out.println("ZAPATERÍA SANTOS");
        return "Aquí tenemos las mejores zapatillas \na precios razonables";
        //Si insertamos \n, el texto que le sigue salta a la siguiente linea


    }
}
