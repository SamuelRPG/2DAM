package ejerciciosT3;

public class Caracol implements Runnable {
    private String nomCaracol;
    private double velCaracol;
    private static int puestos[] = {0,0,0};
    private static Object lock = new Object();

    public Caracol(String n, double v) {
        nomCaracol = n; velCaracol = v;
    }

    public void IniciarCarrera() {
        int i = 0;
        while (i < 100) {
            i+=velCaracol;
            if (i > 100) i=100; //si i se pasa de 100 en algun momento lo asignamos d vuelta a 100.
            IO.println("El caracol "+nomCaracol+" lleva un "+(int) Math.floor(i)+"% del total recorrido");

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (lock) {
            if (puestos[0] == 0) {
                puestos[0] = 1; // Primer lugar
                System.out.println(nomCaracol + " ha ganado el primer puesto!");
            } else if (puestos[1] == 0) {
                puestos[1] = 1; // Segundo lugar
                System.out.println(nomCaracol + " ha ganado el segundo puesto!");
            } else if (puestos[2] == 0) {
                puestos[2] = 1; // Tercer lugar
                System.out.println(nomCaracol + " ha ganado el tercer puesto!");
            }
        }
    }


    public void run() {
        IniciarCarrera();
    }

    public static void main() {
        Thread c1 = new Thread(new Caracol("Pedro", 1+Math.random()*4));
        Thread c2 = new Thread(new Caracol("Paco", 1+Math.random()*4));
        Thread c3 = new Thread(new Caracol("Tate", 1+Math.random()*4));
        Thread c4 = new Thread(new Caracol("Nigga", 1+Math.random()*4));
        Thread c5 = new Thread(new Caracol("Porro", 1+Math.random()*4));
        c1.setPriority(10);
        c2.setPriority(8);
        c3.setPriority(5);
        c4.setPriority(3);
        c5.setPriority(1);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}
