package repasoExamen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//contador de palabras y en que linea aparecen
public class ejec3 {
    public static void main(String[] args) {
        File ficheroLeer = new File(args [0]);
        String palabraLeer = args[1];
        String linea;
        int contador = 1;

        try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String palabra : palabras) {
                    if (palabra.equals(palabraLeer)) {
                        System.out.println("la palabra " + palabraLeer + " aparece en la linea " + contador + ": " + linea );
                    }
                }
                contador++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}