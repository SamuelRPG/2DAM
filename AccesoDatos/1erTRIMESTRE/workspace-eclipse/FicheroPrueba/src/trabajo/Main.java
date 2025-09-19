package trabajo;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fichero = new File("file.txt");

        System.out.println("Nombre del fichero " + fichero.getName());
        System.out.println("Ruta: "+ fichero.getPath());
        System.out.println("Ruta absoluta: "+ fichero.getAbsolutePath());
        System.out.println("Se puede leer: "+ fichero.canRead());
        System.out.println("Se puede escribir: "+ fichero.canWrite());
        System.out.println("Tamaño:"+fichero.length());
        
        // el (.) es la ruta actual donde esta el proyecto
        File directorio = new File(".");
        String[] listaArchivos = directorio.list();
        System.out.println("Contenido del directorio:"+directorio.getName());
        
        // esta estructura de for es equivalente a la del for each 
        for (String s : listaArchivos) {
			System.out.println(s);
		}
        
        String strdirectorio2 = args[0];
        //System.out.println(strdirectorio2);
        
        File directorio2 = new File(strdirectorio2);
        FiltroExtension filtro = new FiltroExtension(".txt");
        String[] listaArchivos2 = directorio2.list(filtro);
        for (int i = 0; i < listaArchivos2.length; i++) {
        		System.out.println(listaArchivos2[i]);
        }
        
        
        File fichero2 = new File("file2.txt");
        try {
        				fichero2.createNewFile();
        }catch (IOException e) {
					System.out.println("No se ha podido crear el fichero");
					e.printStackTrace();
        }
	}

}
