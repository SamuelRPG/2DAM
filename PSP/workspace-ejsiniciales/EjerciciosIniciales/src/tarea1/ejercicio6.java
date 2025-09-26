package tarea1;
import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		for(int i=0;i<5;i++) {
			System.out.println("Escribe el numero " + (i +1) + ":");
			int n = sc.nextInt();
			suma+=n;
		}
		System.out.println("La suma de los 5 números es "+ suma);
		
		sc.close();	
	}

}
