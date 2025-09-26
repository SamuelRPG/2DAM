package Seccion2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ej2seccion2 {
    public static void main (String[] args) {
        try {
            if (args.length > 1) {
                File fichero = new File(args[0]);
                FileReader fr = new FileReader(fichero, StandardCharsets.UTF_8);
                int miliSecs = Integer.parseInt(args[1]);
                int valor=fr.read();

                while (valor != -1) {
                    System.out.print((char) valor);
                    valor=fr.read();
                    Thread.sleep(miliSecs);
                }
                fr.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}