package repasoExamen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//contador de palabras de un fichero que se pasa por parametro
public class ej1 {
    public static void main(String[] args) {
        File ficheroLeer = new File(args[0]);
        int contador = 0;
        String linea;

        try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                contador += palabras.length;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Numero de palabras en " + ficheroLeer.getName() + " son: " + contador);
    }
}