package Seccion;

import java.io.File;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada = args[0];
		File dir = new File(entrada);
		System.out.println("Nombre del directorio " + dir.getName());
        System.out.println("Ruta: "+ dir.getPath());
        System.out.println("Ruta absoluta: "+ dir.getAbsolutePath());
        System.out.println("Se puede leer: "+ dir.canRead());
        System.out.println("Se puede escribir: "+ dir.canWrite());
        System.out.println("Tamaño:"+dir.length());
	}

}
