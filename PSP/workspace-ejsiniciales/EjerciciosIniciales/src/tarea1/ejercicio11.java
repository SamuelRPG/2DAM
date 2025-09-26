package tarea1;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce el número de DNI (sin letra): ");
        int dni = sc.nextInt();

        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J',
                         'Z','S','Q','V','H','L','C','K','E'};

        int resto = dni % 23;

        char letra = letras[resto];


        System.out.println("El DNI completo es: " + dni + letra);

        sc.close();
    }
}

