package repasoExamen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

//se pasa un fichero y un tope de lineas a generar, en el fichero destino que hemos pasado se generara el N numero de lineas al azar del arraylist
public class ejec10 {
    public static void main(String[] args) {
        File ficheroEscribir = new File(args[0]);
        String maxLineas = args[1];
        int contadorLineas = 0;
        int maxLineasInt = Integer.valueOf(maxLineas);

        //array de textos al azar
        ArrayList<String> textosRandom = new ArrayList<>();
        textosRandom.add("Pitopollon Martinez");
        textosRandom.add("Joaquin se te ven los huevos");
        textosRandom.add("Pedro Sanchez mamon");
        textosRandom.add("bombardeen Ahora ERP");

        if (ficheroEscribir.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroEscribir))) {
                while (contadorLineas <= maxLineasInt) {
                    Random random = new Random();
                    int indiceAleatorio = random.nextInt(textosRandom.size());
                    String elementoAleatorio = textosRandom.get(indiceAleatorio);
                    String linea = elementoAleatorio;
                    bw.write(linea);
                    bw.newLine();
                    bw.flush();
                    contadorLineas++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("archivo " + ficheroEscribir.getName() + " generado con " + maxLineas  + " lineas al azar");
        } else {
            System.out.println("El fichero de escribir no existe");
        }
    }
}
