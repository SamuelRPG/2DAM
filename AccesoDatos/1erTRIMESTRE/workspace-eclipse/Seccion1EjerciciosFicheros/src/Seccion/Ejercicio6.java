package Seccion;

import java.io.File;

public class Ejercicio6 {
    public static void main (String[] args) {
        File directorio = new File(args[0]);
        //si el usuario me pasa de 2 parámetros, solo permito que aquel en segundo lugar
        //tome el rol de ser el filtro y el resto de parámetros los desecho
        if (args.length > 1) {
            FiltroExtension filtro = new FiltroExtension(args[1]);
            String[] listaFicheros = directorio.list(filtro);
            for (String f : listaFicheros) {
                System.out.println(f);
            }
        } else {
            String[] listaFicheros = directorio.list();
            for (String f : listaFicheros) {
                System.out.println(f);
            }
        }

    }
}
