package repasoExamen;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//sacar los correos electronicos que tengan o cumplan el patron de un archivo origen a un archivo destino
public class ejec11 {
    public static void main(String[] args) {
        File ficheroLeer = new File(args[0]);
        File ficheroEscribir = new File(args[1]);
        String linea;
        int contador = 0;

        Pattern patron = Pattern.compile("\\b[\\w.-]+@[\\w.-]+\\.\\w+\\b");

        if (ficheroLeer.exists() && ficheroEscribir.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer)); BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroEscribir))) {
                while ((linea = br.readLine()) != null) {
                    Matcher matcher = patron.matcher(linea);
                    while (matcher.find()) {
                        bw.write(matcher.group());
                        bw.newLine();
                        contador++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("se han extraido " + contador + " correos electronicos de " + ficheroEscribir.getName());
        } else {
            System.out.println("alguno de los archivos no existe");
        }

    }
}