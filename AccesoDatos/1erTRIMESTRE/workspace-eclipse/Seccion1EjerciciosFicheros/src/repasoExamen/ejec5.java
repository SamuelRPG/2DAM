package repasoExamen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//contador de caracteres, palabras y lineas de un fichero que se pasa por parametro
public class ejec5 {
    public static void main(String[] args) {
        File ficheroLeer = new File(args [0]);
        int numCaracteres = 0;
        int numPalabras = 0;
        int numLineas = 0;

        if (ficheroLeer.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    numLineas++;
                    numPalabras += linea.split("\\s+").length;
                    numCaracteres += linea.length();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Estadisticas del archivo: " + ficheroLeer.getName());
            System.out.println("lineas: " + numLineas);
            System.out.println("palabras: " + numPalabras);
            System.out.println("caracteres: " + numCaracteres);
        } else {
            System.out.println("No existe el fichero " + ficheroLeer.getName());
        }
    }
}
