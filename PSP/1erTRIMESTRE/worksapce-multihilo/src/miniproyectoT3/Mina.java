package miniproyectoT3;

public class Mina {
    private static int stock;

    public Mina (int cant) {
        stock = cant;
    }

    public static int getStock() {
        return stock;
    }
    public static void setStock(int valor) {
        stock = valor;
    }

    public static boolean hayChamba() {
        if (stock > 0) {
            return true;
        } else return false;
    }
}
