package ejerciciosT3;

public class Caracol2 implements Runnable {
    private String nomCaracol;
    private double velCaracol;
    private static int puestos[] = {0, 0, 0};
    private static Object lock = new Object();

    public Caracol2(String n, double v) {
        nomCaracol = n;
        velCaracol = v;
    }

    public void IniciarCarrera2() {
        int i = 0;
        while (i < 100) {
            i += velCaracol;
            if (i > 100) i = 100; //si i se pasa de 100 en algun momento lo asignamos d vuelta a 100.
            IO.println("El caracol " + nomCaracol + " lleva un " + (int) Math.floor(i) + "% del total recorrido");
        }
    }

    public void run() {
        IniciarCarrera2();
    }

    public static void main() {
        try {
            // Crear los hilos
            Thread c1 = new Thread(new Caracol2("Pedro", 2));
            Thread c2 = new Thread(new Caracol2("Paco", 2));
            Thread c3 = new Thread(new Caracol2("Tate", 2));
            Thread c4 = new Thread(new Caracol2("Nigga", 2));
            Thread c5 = new Thread(new Caracol2("Porro", 2));

            // Iniciar los hilos
            c1.start();
            c1.join();

            c2.start();
            c2.join();

            c3.start();
            c3.join();

            c4.start();
            c4.join();

            c5.start();
            c5.join();

            // Esperar a que todos los hilos terminen

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

