package repasoExamen;

import java.io.*;

//para remplazar en un fichero pasado por parametro una palabra que se busca por una palabra que queremos remplazar
public class ejec6 {
    public static void main(String[] args) {
        File ficheroLeer = new File(args[0]);
        String palabraBuscar = args[1];
        String palabraRemplazar = args[2];
        int contador = 0;

        if (ficheroLeer.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
                File ficheroEscribir = new File(ficheroLeer + "remplazado");
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroEscribir))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        if (linea.contains(palabraBuscar)) {
                            String lineaRemplazada = linea.replace(palabraBuscar, palabraRemplazar);
                            bw.write(lineaRemplazada);
                            bw.newLine();
                            bw.flush();
                            contador++;
                        } else {
                            bw.write(linea);
                            bw.newLine();
                            bw.flush();
                        }
                    }
                }
                System.out.println("se han remplazado " + contador + " coincidencias de " + palabraBuscar + " y " + palabraRemplazar);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Fichero no encontrado");
        }
    }
}
