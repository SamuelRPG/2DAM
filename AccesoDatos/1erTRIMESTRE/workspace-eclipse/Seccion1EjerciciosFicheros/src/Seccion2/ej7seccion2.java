package Seccion2;

import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ej7seccion2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sw = true;
        File fNuevo = new File("C:\\Users\\admin\\Documents\\REPOSITORY\\Local\\2DAM\\AccesoDatos\\1erTRIMESTRE\\workspace-eclipse\\Seccion1EjerciciosFicheros\\src\\Seccion2\\textoCopiaStrings.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fNuevo.createNewFile();
            fw = new FileWriter(fNuevo, StandardCharsets.UTF_8, true);
            bw = new BufferedWriter(fw);
        } catch (Exception e) {
            e.printStackTrace();
        }

        do {
            System.out.println("Introduce strings para añadirlos a un fichero (escribe exit para acabar)");
            String s = sc.nextLine();
            if (s.equals("exit")) sw=false;
            else {
                try {
                    bw.write(s);
                    bw.newLine();
                    bw.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } while (sw);
        try {
            fw.close();
            bw.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
