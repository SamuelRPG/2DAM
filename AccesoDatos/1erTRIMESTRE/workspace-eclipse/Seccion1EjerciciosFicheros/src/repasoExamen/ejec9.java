package repasoExamen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

//contador de errores que no coinciden con el patron del formato, del fichero que se pasa por parametro
public class ejec9 {
    public static void main(String[] args) {
        File ficheroLeer = new File(args [0]);
        int contadorErrores = 0;
        int contadorLineas = 1;
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS");
        ArrayList<Integer> numerosLineasErrores = new ArrayList<Integer>();

        try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    formato.parse(linea);
                } catch (Exception e) {
                    contadorErrores++;
                    contadorLineas++;
                    numerosLineasErrores.add(contadorLineas);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Errores encontrados en las lineas: " + numerosLineasErrores);
        System.out.println("Total de errores: " + contadorErrores);
    }
}
