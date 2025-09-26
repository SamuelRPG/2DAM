package Seccion;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Ejercicio8 {
    public static void main(String[] args) {
        File copia = new File("textoCopia.txt");
        try {
            File fichero = new File("texto.txt");
            FileReader fr = new FileReader(fichero, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(copia, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(fw);
            String linea = br.readLine();
            int contador = 1;
            while (linea != null) {
                System.out.println(linea);
                Thread.sleep(100);
                bw.newLine();
                linea = br.readLine();
                System.out.print("Linea " + contador + " escrita. ");
                contador++;
            }
            br.close();
            fr.close();
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (copia.exists()) {
                System.out.println("Se procede a borrar el fichero " + copia);
                copia.delete();
            } else {
                System.out.println("No se ha podido borrar el fichero " + copia);
            }
        }
    }
}
