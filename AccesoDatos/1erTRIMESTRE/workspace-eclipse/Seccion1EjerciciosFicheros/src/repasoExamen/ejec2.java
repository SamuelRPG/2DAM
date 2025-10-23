package repasoExamen;

import java.io.*;


//copiar el contenido de un fichero por parametro en otro fichero pasado por parametro
public class ejec2 {
    public static void main(String[] args) {
        File ficheroLeer = new File(args[0]);
        File ficheroEscribir = new File(args[1]);
        String linea;

        if (ficheroLeer.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroEscribir))) {
                    while ((linea = br.readLine()) != null) {
                        bw.write(linea);
                        bw.newLine();
                        bw.flush();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Archivo no encontrado");
        }
        System.out.println("Contenido de " + ficheroLeer.getName() + " copiado en " + ficheroEscribir.getName());
    }
}
