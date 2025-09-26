package tarea1;

public class ejercicio24 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debes pasar un número como parámetro.");
            return;
        }

        // Convertimos el parámetro a entero
        int parametro = Integer.parseInt(args[0]);

        // Número aleatorio entre 0 y 9 (puedes cambiar el rango)
        int numAle = (int) (Math.random() * 10); 

        // Comparamos
        if (parametro == numAle) {
            System.out.println("Enhorabuena, has ganado");
        } else {
            System.out.println("Has perdido. El número era: " + numAle);
        }
    }
}


