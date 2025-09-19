package tarea1;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio de un círculo: ");
		double r = sc.nextDouble();
		double area = Math.PI*(Math.pow(r, 2));
		double diametro = r*2;
		double volumen = 4/3 * Math.PI * Math.pow(r, 3);
		String resultado = String.format("El área es %.3f, el diámetro es %.3f y el volumen es %.3f", area, diametro, volumen);
		System.out.println(resultado);
		sc.close();
	}

}