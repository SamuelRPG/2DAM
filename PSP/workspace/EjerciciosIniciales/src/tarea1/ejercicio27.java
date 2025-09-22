package tarea1;
import java.util.Scanner;

public class ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce el número de DNI (sin letra): ");
        int dni = sc.nextInt();
        sc.close();
        System.out.println("Tu DNI completo es "+dni+CalculaLetra(dni));
    }
    
    public static char CalculaLetra(int id) {
    	char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J',
                'Z','S','Q','V','H','L','C','K','E'};

    	int resto = id % 23;

    	char letra = letras[resto];
    	return letra;
    }
}