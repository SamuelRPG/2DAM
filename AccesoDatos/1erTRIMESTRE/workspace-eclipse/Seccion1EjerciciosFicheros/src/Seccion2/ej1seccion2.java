package Seccion2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ej1seccion2 {
    public static void main (String[] args) {
        try {
            File fichero = new File(args[0]);
            FileReader fr = new FileReader(fichero, StandardCharsets.UTF_8);
            int valor=fr.read();

            while (valor != -1) {
                System.out.print((char) valor);
                valor=fr.read();
                Thread.sleep(100);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

