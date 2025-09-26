package tarea1;

import java.lang.reflect.Array;

public class ejercicio31 {
    public static void main(String[] args) {
        String[] listaNombres = new String[6];

        listaNombres[0] = "Ana";
        listaNombres[1] = "Luis";
        listaNombres[2] = "Carlos";
        listaNombres[3] = "María";
        listaNombres[4] = "Sofía";
        listaNombres[5] = "Pedro";

        MostrarNombres(listaNombres);
    }

    public static void MostrarNombres(String[] n) {
        for (String elem : n) {
            System.out.println(elem);
        }
    }
}
