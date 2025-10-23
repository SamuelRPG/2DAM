package repasoExamen;

import java.io.*;

//compresor de archivo rudimentario, se pasa un fichero a leer y otro a escribir, y se cortan todos los espacios
public class ejec7 {
    public static void main(String[] args) {
        File ficheroLeer = new File(args[0]);
        File ficheroEscribir = new File(args[1]);

        if (ficheroLeer.exists() && ficheroEscribir.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroEscribir))) {
                    String linea;
                    String nuevaLinea = "";
                    while ((linea = br.readLine()) != null) {
                        String[] palabras = linea.split("\\s+");
                        for (String palabra : palabras) {
                            nuevaLinea = nuevaLinea.concat(palabra);
                        }
                        bw.write(nuevaLinea);
                        bw.newLine();
                        bw.flush();
                        nuevaLinea = "";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("archivo comprimido correctamente");
            System.out.println("Tamaño original: " + ficheroLeer.length() + " megabytes");
            System.out.println("Tamaño comprimido: " + ficheroEscribir.length() + " megabytes");
        } else {
            System.out.println("alguno de los archivos no existen");
        }
    }
}
