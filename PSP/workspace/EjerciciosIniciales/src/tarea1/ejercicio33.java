package tarea1;

public class ejercicio33 {
    public static void main(String[] args) {
        int n = 5, f = 1;
        //lo que hago en este for, es, antes de hacer i++, multiplicar f * i;
        for (int i = 1; i <= n; f *= i, i++); {
            System.out.println(f);
        }
    }
}
