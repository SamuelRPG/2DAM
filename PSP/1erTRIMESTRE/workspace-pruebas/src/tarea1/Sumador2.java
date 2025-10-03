package tarea1;

import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Sumador2 {
    public static int sumar(int n1, int n2, String fichero) {
        System.out.println("Sumando de "+n1+" hasta "+n2);
        int resultado=0;
        for (int i=n1; i<=n2;i++) {
            resultado+=i;
        }
        try {
            File f = new File (fichero);
            FileWriter fw = new FileWriter(f, StandardCharsets.UTF_8);
            f.createNewFile();
            fw.write(String.valueOf(resultado));
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return resultado;
    }

    public static void main (String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        String nomFichero = args[2];
        int resultado=sumar(n1,n2, nomFichero);

        System.out.println("La suma del intervalo de estos dos números es: "+resultado);

    }
}