package Seccion;
import java.io.File;

public class Ejercicio5 {

	public static void main(String[] args) {
		String dir = args[0];
		String ext = args[1];
		
		FiltroExtension extFiltrada = new FiltroExtension(ext);
		File directorio = new File(dir);

        //meto dentro de un array de strings aquellos archivos que tengan como extensión la
        //que pasemos como segundo parámetro
		String[] listaFicheros = directorio.list(extFiltrada);
		for (String fichero : listaFicheros) {
            System.out.println(fichero);
        }
	}
}
