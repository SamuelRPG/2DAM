package Seccion2;

import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ej8seccion2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sw = true;
        File fNuevo = new File("C:\\Users\\admin\\Documents\\REPOSITORY\\Local\\2DAM\\AccesoDatos\\1erTRIMESTRE\\workspace-eclipse\\Seccion1EjerciciosFicheros\\src\\Seccion2\\textoRenombrar.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fNuevo.createNewFile();
            fw = new FileWriter(fNuevo, StandardCharsets.UTF_8, true);
            bw = new BufferedWriter(fw);

            //Añado la fecha y hora de creación a la primera línea del fichero
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String fechaHora = "Archivo creado el: " + LocalDateTime.now().format(formatter);
            bw.write(fechaHora);

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