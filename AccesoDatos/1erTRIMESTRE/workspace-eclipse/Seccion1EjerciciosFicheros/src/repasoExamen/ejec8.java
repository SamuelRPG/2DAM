package repasoExamen;

import java.io.*;

//se pasan 3 argumentos, un fichero a leer, un prefijo del nombre que quieres que se llamen los nuevos archivos y un top de lineas por archivo
//dividira el archivo original en varios segun el maximo de lineas, con el nombre de prefijo escrito por parametro
public class ejec8 {
    public static void main(String[] args) {
        File ficheroLeer = new File(args[0]);
        String nombrePrefijo = args[1];
        int maxLineas = Integer.parseInt(args[2]);
        int contador = 0;
        int lineasEscritas = 0;
        BufferedWriter bw = null;

        if (ficheroLeer.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    if (lineasEscritas % maxLineas == 0) {
                        if (bw != null) {
                            bw.close();
                        }
                        bw = new BufferedWriter(new FileWriter(nombrePrefijo + "_" + contador + ".txt"));
                        contador++;
                        lineasEscritas = 0;
                    }
                    bw.write(linea);
                    bw.newLine();
                    lineasEscritas++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (bw != null) {
                    try {
                        bw.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("Archivo no encontrado");
        }
        System.out.println("Se han creado " + contador + " archivos dividos de " + ficheroLeer.getName());
    }
}
