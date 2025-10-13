package miniproyecto;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;

public class CalculadoraNEO {
    private static double CalcularProbabilidad(double pos, double vel) {
        double posTierra=1;
        double velTierra=100;
        for (int i = 0; i < (50 * 365 * 24 * 60 * 60); i++) {
            pos = pos + vel * i;
            posTierra= posTierra + velTierra * i;
        }
        double resultado = 100 * Math.random() *
                Math.pow(((pos-posTierra)/(pos+posTierra)), 2);
        return resultado;
    }

    public static void RellenarFichero(double pos, double vel, String NEO) {
        try {
            double probabilidad = CalcularProbabilidad(pos, vel);
            FileWriter fw = new FileWriter(NEO, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(probabilidad));
            DecimalFormat df = new DecimalFormat("#.00");
            if (probabilidad < 10) {
                System.out.println(NEO + " tiene " + df.format(probabilidad) + "% de probabilidad Y NO PRESENTA UN RIESGO");
            } else {
                System.out.println(NEO + " tiene " + df.format(probabilidad) + "% de probabilidad de colision");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main (String[] args) {
        if (args.length < 3) {
            System.err.println("Uso: CalculadoraNEO <nombreNEO> <pos> <vel>");
            return;
        }
        String nomNEO = args[0];
        double posNEO = Double.parseDouble(args[1]);
        double velNEO = Double.parseDouble(args[2]);
        RellenarFichero(posNEO, velNEO, nomNEO);
    }
}
