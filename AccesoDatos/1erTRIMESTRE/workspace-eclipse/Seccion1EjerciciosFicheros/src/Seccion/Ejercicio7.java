package Seccion;

import java.io.File;

public class Ejercicio7 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Introduce al menos un parámetro");
            System.exit(0);
        }

        File directorio = new File(args[0]);
        if (args.length > 1) {
            for (int i = 1; i < args.length; i++) {
                FiltroExtension filtro = new FiltroExtension(args[i]);
                String[] listaFicheros = directorio.list(filtro);
                for (String f : listaFicheros) {
                    System.out.println(f);
                }
            }
        } else {
            String[] listaFicheros = directorio.list();
            for (String f : listaFicheros) {
                System.out.println(f);
            }

        }
    }
}
