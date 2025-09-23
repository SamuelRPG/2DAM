package tarea1;

public class ejercicio32 {
    public static void main(String[] args) {
        int suma = SumaParametros(args);
        System.out.println("La suma total de los parámetros es "+ suma);
    }

    public static int SumaParametros(String[] args) {
        int sumaTotal=0;
        for (String elem : args) {
            if (Integer.parseInt(elem) % 2 == 0) {
                sumaTotal+=Integer.parseInt(elem);
            }
        }
        return sumaTotal;
    }
}
