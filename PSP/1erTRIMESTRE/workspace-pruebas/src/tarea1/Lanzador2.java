package tarea1;

import initialpackage.LanzadorDeProcesos;

import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Lanzador2 {
    public static void lanzador2(int n1, int n2, String f) {
        try {
            String javaHome = System.getProperty("java.home");
            String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
            String classpath = System.getProperty("java.class.path");
            String clase = "tarea1.Sumador2";
            List<String> command = new ArrayList<>();
            command.add(javaBin);
            command.add("-cp");
            command.add(classpath);
            command.add(clase);
            command.add(String.valueOf(n1));
            command.add(String.valueOf(n2));
            command.add(f);

            ProcessBuilder builder = new ProcessBuilder(command);
            //builder.start();
            Process process = builder.start();
            //espero hasta que el fichero se haya escrito
            process.waitFor();

            FileReader fr = new FileReader(f, StandardCharsets.UTF_8);
            int valor = fr.read();
            while (valor != -1) {
                System.out.print((char) valor);
                valor=fr.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main (String[] args) {
        lanzador2(1, 50, "salida.txt");
    }
}