package Seccion2;
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ej3seccion2 {
    public static void main (String[] args) {
        try {
                Scanner sc = new Scanner(System.in);
                File f = new File (args[0]);
                FileReader fr = new FileReader(f, StandardCharsets.UTF_8);
                int caracter = fr.read();
                int contador=0;

                while (caracter != -1) {
                    System.out.print((char)caracter);
                    contador++;
                    caracter=fr.read();
                    if (contador==90) {
                        sc.nextLine();
                        contador=0;
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
