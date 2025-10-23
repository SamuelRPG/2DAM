package repasoExamen;

import java.io.*;

//se pasa por parametro la ruta del archivo destino, y en la linea se dice cuantos archivos se quieren concatenar en el destino
public class ejec4 {
    public static void main(String[] args) {
        File ficheroEscribir = new File(args[0]);
        String linea;

        if (ficheroEscribir.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroEscribir))) {
                if (args.length > 1) {
                    for (int i = 1; i < args.length; i++) {
                        File ficheroLeer = new File(args[i]);
                        try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
                            while ((linea = br.readLine()) != null) {
                                bw.write(linea);
                                bw.newLine();
                                bw.flush();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("archivos concatenados en " + ficheroEscribir.getName());
        }
    }
}
