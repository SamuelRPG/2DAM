import java.io.File;

public class Ej1 {
    public static void main(String[] args) {
        File fichero = new File(ej1.txt);

        System.out.println("Nombre del fichero " + fichero.getName());
        System.out.println("Ruta: "+ fichero.getPath());
        System.out.println("Ruta absoluta: "+ fichero.getAbsolutePath);
        System.out.println("Se puede leer: "+ fichero.canRead());
        System.out.println("Se puede escribir: "+ fichero.canWrite());
        System.out.println("Tamaño:"+fichero.length());
    }
}