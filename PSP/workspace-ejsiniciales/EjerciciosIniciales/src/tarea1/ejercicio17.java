package tarea1;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean hayMayuscula = false;
		Boolean hayNumero = false;
		Boolean longitudMinima = false;
		Scanner sc= new Scanner(System.in);

		System.out.println("Introduce tu contraseña: ");
		String e = sc.nextLine();
		
		if (e.length() > 5) longitudMinima=true; 
		
		for (int i = 0; i < e.length(); i++) {
			char c = e.charAt(i);
			if (Character.isDigit(c)) {
				hayNumero = true;
			} else if (Character.isUpperCase(c)) {
				hayMayuscula=true;
			}
		}
		
		if (!hayMayuscula) {System.out.println("Tu contraseña no tiene 1 mayúscula"); }
		if (!hayNumero) {System.out.println("Tu contraseña no tiene 1 número");}
		if (!longitudMinima) {System.out.println("Tu contraseña no tiene una longitud mínima de 5 caracteres");}
		if (hayMayuscula && hayNumero && longitudMinima) {System.out.println("Tu contraseña es válida");}
		sc.close();
	}

}
