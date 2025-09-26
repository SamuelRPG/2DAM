package tarea1;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una temperatura en ºC: ");
		double c = sc.nextDouble();
		double f = (c * 9/5) + 32;
		String stringUnDecimal = String.format("%.1f",f);
		System.out.println("La temperatura en grados farenheit es: "+stringUnDecimal);
		sc.close();
	}

}
