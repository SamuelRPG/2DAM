package ejsComplementarios.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hilo implements Runnable{
    private static List<String> listaColorinchis = new ArrayList<>();

    synchronized void AñadirColorin(String color) {
        listaColorinchis.add(color);
        IO.println("Se ha añadido el color "+color);
    }

    public void run() {
        String[] colorines = {"amarillo", "azul", "verde", "rojo", "morado"};
        Random rnd = new Random();
        String colorAsignado = colorines[rnd.nextInt(0, 5)];
        AñadirColorin(colorAsignado);
    }

    public static List<String> getLista() { return listaColorinchis;}
}
