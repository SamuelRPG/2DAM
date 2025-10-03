package miniproyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Lanzador {
    public static void lanzador(int n1, int n2, String f) {
        try {
            File ficheroNEO=new File(f);
            FileReader fr = new FileReader(f, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            while (linea != null) {
                String[] lineaArray = linea.split(",");
                String javaHome = System.getProperty("java.home");
                String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
                String classpath = System.getProperty("java.class.path");
                String clase = "miniproyecto.CalculadoraNEO"; // la clase que quieres ejecutar

                List<String> command = new ArrayList<>();
                command.add(javaBin);
                command.add("-cp");
                command.add(classpath);
                command.add(clase);
                command.add(String.valueOf(lineaArray[0]));
                command.add(String.valueOf(lineaArray[1]));
                command.add(String.valueOf(lineaArray[2]));

                ProcessBuilder builder = new ProcessBuilder(command);

                linea = br.readLine();

            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) {
        lanzador(1, 50, "C:\\Users\\Usuario\\Documents\\2DAM\\PSP\\1erTRIMESTRE\\workspace-pruebas\\src\\miniproyecto\\NEO.txt");
    }
}
