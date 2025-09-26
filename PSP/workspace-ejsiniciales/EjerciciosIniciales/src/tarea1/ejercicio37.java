package tarea1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ejercicio37 {
    public static void main (String[] args) {
        long inicio = System.currentTimeMillis();
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce un número para representar el inicio del intervalo: ");
        int num = sc.nextInt();
        System.out.println("Introduce el límite del intervalo: ");
        int limite = sc.nextInt();
        List<Integer> numerosIntervalo = new ArrayList<Integer>();

        for (int i = num + 1; i < limite; i++) {
            numerosIntervalo.add(i);
        }

        System.out.println("Números dentro del intervalo:");
        for (Integer n : numerosIntervalo) {
            System.out.println(n);
        }

        long fin = System.currentTimeMillis();
        long tiempoTotal = fin - inicio;

        System.out.println("El programa tardó " + tiempoTotal + " ms en ejecutarse.");
    }
}

