package tarea1;
import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cuenta = 1;
		int suma= 0;
		do {
			System.out.println("Escribe el numero " + cuenta + ":");
			int n = sc.nextInt();
			cuenta++;
			suma+=n;
		}while(cuenta < 6);
		
		System.out.println("La suma de los números es: "+suma);
		
		sc.close();	
	}

}