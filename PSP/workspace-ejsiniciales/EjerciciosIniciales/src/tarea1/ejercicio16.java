package tarea1;
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        String soloNumeros = fecha.replace("/", "");

        int suma = 0;
        for (int i = 0; i < soloNumeros.length(); i++) {
            char c = soloNumeros.charAt(i);
            suma += Character.getNumericValue(c);
        }

        System.out.println("Tu número de la suerte es: " + suma);
        sc.close();
        }
}
