package tarea1;

import initialpackage.LanzadorDeProcesos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Lanzador1 {
    public static void lanzador1(int n1, int n2) {
        try {
            String javaHome = System.getProperty("java.home");
            String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
            String classpath = System.getProperty("java.class.path");
            String clase = "tarea1.Sumador1";
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
        lanzador1(1, 50 );
        lanzador1(51, 100 );
    }
}
