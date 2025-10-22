package ejerciciosT3;

import java.io.*;

public class Caracol3 implements Runnable {
    private String nomCaracol;
    private double velCaracol;
    private boolean meta = false;
    private static Thread[] hilos;

    public Caracol3(String n, double v) {
        nomCaracol = n; velCaracol = v;
    }

    public void IniciarCarrera(String f) {
        File fichero = new File(f);
        int i = 0;
        while (i < 100) {
            i+=velCaracol;
            if (i > 100) i=100; //si i se pasa de 100 en algun momento lo asignamos d vuelta a 100.
            IO.println("El caracol "+nomCaracol+" lleva un "+(int) Math.floor(i)+"% del total recorrido");
            if (i == 100 && !meta) {
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
                    bw.write("El caracol "+nomCaracol+" ha llegado a la meta");
                    bw.close();
                    meta=true;

                    for (Thread t: hilos) {
                        if (t != Thread.currentThread()) {
                            t.interrupt();
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void run() {
        IniciarCarrera("meta.txt");
    }

    public static void main() {
        Thread c1 = new Thread(new Caracol3("Pedro", 1+Math.random()*4));
        Thread c2 = new Thread(new Caracol3("Paco", 1+Math.random()*4));
        Thread c3 = new Thread(new Caracol3("Tate", 1+Math.random()*4));
        Thread c4 = new Thread(new Caracol3("Nigga", 1+Math.random()*4));
        Thread c5 = new Thread(new Caracol3("Porro", 1+Math.random()*4));

        hilos = new Thread[] { c1, c2, c3, c4, c5 };

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}