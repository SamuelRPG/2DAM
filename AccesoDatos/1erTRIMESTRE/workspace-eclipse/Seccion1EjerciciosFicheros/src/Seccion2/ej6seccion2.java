package Seccion2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ej6seccion2 {
    public static void main (String[] args) {
        try {
                File fichero = new File(args[0]);
                File ficheroCopia = new File ("C:\\Users\\admin\\Documents\\REPOSITORY\\Local\\2DAM\\AccesoDatos\\1erTRIMESTRE\\workspace-eclipse\\Seccion1EjerciciosFicheros\\src\\Seccion2\\textoCopia.txt");
                try {
                    ficheroCopia.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                FileReader fr = new FileReader(fichero, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(ficheroCopia, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(fw);
                String linea = br.readLine();

                while (linea != null) {
                    bw.write(linea);
                    bw.newLine();
                    linea = br.readLine();
                }
            bw.close();
            fw.close();
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}