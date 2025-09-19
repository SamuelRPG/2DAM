package tarea1;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio de un círculo: ");
		double r = sc.nextDouble();
		double area = Math.PI*(Math.pow(r, 2));
		double diametro = r*2;
		String resultado = String.format("El área es %.3f y el diámetro es %.3f", area, diametro);
		System.out.println(resultado);
		sc.close();
	}

}
