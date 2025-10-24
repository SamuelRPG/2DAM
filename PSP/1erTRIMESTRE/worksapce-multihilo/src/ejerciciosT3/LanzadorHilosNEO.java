package ejerciciosT3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class LanzadorHilosNEO {
    public static void main (String[] args) {
    long tiempoInicio = System.currentTimeMillis();
    LanzaHilos("NEO.txt");
    long tiempoFinal = System.currentTimeMillis();
    long duracionEjecucion = (tiempoFinal - tiempoInicio);
    IO.println("La ejecución de todos los hilos ha sido " +duracionEjecucion + " milisegundos");
    }

    public static void LanzaHilos(String f) {
        try {
            CalculadoraDeNEO cNeo;
            File ficheroNEO=new File(f);
            FileReader fr = new FileReader(ficheroNEO, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            while (linea != null) {
                String[] lineaArray = linea.split(",");
                if (lineaArray.length < 3) {
                    System.err.println("Línea inválida (se esperaban 3 campos): " + linea);
                    continue;
                }
                cNeo = new CalculadoraDeNEO(lineaArray[0], lineaArray[1],
                        lineaArray[2]);
                Thread hilo = new Thread(cNeo);
                hilo.start();
                linea = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
