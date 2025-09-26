import java.io.*;
import java.util.*;

public class LanzadorDeComandos {
    public static void lanzador(int n1, int n2) {
        try {
            String javaHome = System.getProperty("java.home");
            String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
            String classpath = System.getProperty("java.class.path");
            String clase = "Sumador";
            List<String> command = new ArrayList<>();
            command.add(javaBin);
            command.add("-cp");
            command.add(classpath);
            command.add(clase);
            command.add(String.valueOf(n1));
            command.add(String.valueOf(n2));

            ProcessBuilder builder = new ProcessBuilder(command);
            //builder.start();
            builder.inheritIO().start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main (String[] args) {
        lanzador(1, 50);
        lanzador(51, 100);
    }
}
