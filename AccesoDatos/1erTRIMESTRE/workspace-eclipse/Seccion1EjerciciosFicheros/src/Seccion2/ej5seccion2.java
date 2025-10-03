package Seccion2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ej5seccion2 {
    public static void main (String[] args) {
        try {
            if (args.length > 1) {
                File fichero = new File(args[0]);
                FileReader fr = new FileReader(fichero, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(fr);
                int miliSecs = Integer.parseInt(args[1]);
                String linea = br.readLine();

                while (linea != null) {
                    System.out.println(linea);
                    linea = br.readLine();
                    Thread.sleep(miliSecs);
                }
                fr.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
