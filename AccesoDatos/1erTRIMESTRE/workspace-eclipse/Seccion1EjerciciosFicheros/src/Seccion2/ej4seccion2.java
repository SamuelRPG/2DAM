package Seccion2;
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ej4seccion2 {
    public static void main (String[] args) {
        try {
            File f = new File (args[0]);
            FileReader fr = new FileReader(f, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea=br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}