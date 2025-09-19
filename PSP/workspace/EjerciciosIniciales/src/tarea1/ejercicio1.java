package tarea1;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número tt: ");
		String n1 = sc.nextLine();
		System.out.println("Introduce otro número tt: ");
		String n2 = sc.nextLine();
		
		// parseo lo que recojo en string a int 
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		System.out.println("La suma es: " + (num1 + num2));
		
		
	}

}
