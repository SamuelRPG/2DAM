package tarea1;

public class ejercicio25 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debes pasar al menos un número como parámetro.");
            return;
        }
        
        for (int i = 0; i < args.length; i++) {
            try {
                int parametro = Integer.parseInt(args[i]);
                int numAle = (int) (Math.random() * 10); // Número aleatorio entre 0 y 9
                if (parametro == numAle) {
                    System.out.println("Intento " + (i+1) + ": Enhorabuena, has ganado (tu número: " + parametro + ", número aleatorio: " + numAle + ")");
                } else {
                    System.out.println("Intento " + (i+1) + ": Has perdido. Tu número: " + parametro + ", el número era: " + numAle);
                }
            } catch (NumberFormatException e) {
                System.out.println("Intento " + (i+1) + ": '" + args[i] + "' no es un número válido.");
            }
        }
    }
}
