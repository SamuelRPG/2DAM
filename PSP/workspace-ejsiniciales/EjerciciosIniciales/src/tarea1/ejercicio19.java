package tarea1;

public class ejercicio19 {
    public static void main(String[] args) {
        System.out.println("Código ASCII\tCarácter");
        System.out.println("-------------------------");

        // ASCII estándar: códigos del 0 al 127
        for (int i = 0; i <= 127; i++) {
            char c = (char) i;
            System.out.println(i + "\t\t" + c);
        }
    }
}
