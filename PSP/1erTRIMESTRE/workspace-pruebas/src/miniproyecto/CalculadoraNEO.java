package miniproyecto;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraNEO {
    private static double CalcularProbabilidad(double pos, double vel) {
        double posTierra=0;
        for (int i = 0; i < (50 * 365 * 24 * 60 * 60); i++) {
            pos = pos + vel * i;
            posTierra= posTierra + vel * i;
        }
        double resultado = 100 * Math.random() *
                Math.pow( ((pos-posTierra/(pos+posTierra))), 2);
        return resultado;
    }

    public static void RellenarFichero(File fichero, double pos, double vel, String NEO) {
        try {
            double probabilidad = CalcularProbabilidad(pos, vel);
            fichero.createNewFile();
            FileWriter fw = new FileWriter(fichero, StandardCharsets.UTF_8, true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (probabilidad < 10) {
                bw.write(NEO + ": " + String.format("%.2f", probabilidad) + "%");
                bw.newLine();
            } else {
                System.err.println("NEO con probabilidad alta de impacto" + NEO + ": " + String.format("%.2f", probabilidad) + "%");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main (String[] args) {
        String nomNEO = args[0];
        double posNEO = Double.parseDouble(args[1]);
        double velNEO = Double.parseDouble(args[2]);
        File ficheroSalida = new File(args[3]);
        RellenarFichero(ficheroSalida, posNEO, velNEO, nomNEO);
    }
}
