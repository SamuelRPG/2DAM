package tarea1;

import java.util.Scanner;
import java.util.Stack;

public class ejercicio35 {
    public static void main(String[] args) {
        Stack<Integer> stackNums = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int suma=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el numero " + (i + 1) + ": ");
            stackNums.push(sc.nextInt());
            suma+=stackNums.peek();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Numero introducido: "+stackNums.pop());
        }
        System.out.println("Suma: "+suma);
    }
}
