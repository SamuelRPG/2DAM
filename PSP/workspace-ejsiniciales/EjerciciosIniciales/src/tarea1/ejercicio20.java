package tarea1;

public class ejercicio20 {
    public static void main(String[] args) {
        System.out.println("Código ASCII\tCarácter");
        System.out.println("-------------------------");

        // ASCII extendido: códigos del 0 al 255
        for (int i = 0; i <= 255; i++) {
            char c = (char) i;
            System.out.println(i + "\t\t" + c);
        }
    }
}
