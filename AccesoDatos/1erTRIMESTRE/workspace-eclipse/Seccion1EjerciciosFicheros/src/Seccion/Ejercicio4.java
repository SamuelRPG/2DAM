package Seccion;

import java.io.File;

public class Ejercicio4 {

	public static void main(String[] args) {
		File dir = new File(args[0]);
		 if (dir.exists() && dir.isDirectory()) {
	            System.out.println("El directorio existe: " + dir.getAbsolutePath());
	        } else {
	            System.out.println("El directorio no existe o no es válido.");
	        }		
	}

}
