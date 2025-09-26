package tarea1;
import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduce un número del 1 al 12 (0 para acabar):");
            num = sc.nextInt();

            if (num == 0) {
                System.out.println("Programa terminado.");
            } else if (num == 1) {
                System.out.println("El número 1 corresponde a Enero");
            } else if (num == 2) {
                System.out.println("El número 2 corresponde a Febrero");
            } else if (num == 3) {
                System.out.println("El número 3 corresponde a Marzo");
            } else if (num == 4) {
                System.out.println("El número 4 corresponde a Abril");
            } else if (num == 5) {
                System.out.println("El número 5 corresponde a Mayo");
            } else if (num == 6) {
                System.out.println("El número 6 corresponde a Junio");
            } else if (num == 7) {
                System.out.println("El número 7 corresponde a Julio");
            } else if (num == 8) {
                System.out.println("El número 8 corresponde a Agosto");
            } else if (num == 9) {
                System.out.println("El número 9 corresponde a Septiembre");
            } else if (num == 10) {
                System.out.println("El número 10 corresponde a Octubre");
            } else if (num == 11) {
                System.out.println("El número 11 corresponde a Noviembre");
            } else if (num == 12) {
                System.out.println("El número 12 corresponde a Diciembre");
            } else {
                System.out.println("tt tas rallao eso no es del 1 al 12.");
            }

        } while (num != 0);

        sc.close();
    }
}