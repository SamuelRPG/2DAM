package tarea1;

import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Sumador3 {
    public static int sumar(int n1, int n2) {
        System.out.println("Sumando de "+n1+" hasta "+n2);
        int resultado=0;
        for (int i=n1; i<=n2;i++) {
            resultado+=i;
        }
        return resultado;
    }

    public static void main (String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        String nomFichero = args[2];
        int resultado=sumar(n1,n2);

        try {
            File f = new File (nomFichero);
            FileWriter fw = new FileWriter(f, StandardCharsets.UTF_8);
            f.createNewFile();
            fw.write(String.valueOf(resultado));
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("La suma del intervalo de estos dos números es: "+resultado);

    }
}