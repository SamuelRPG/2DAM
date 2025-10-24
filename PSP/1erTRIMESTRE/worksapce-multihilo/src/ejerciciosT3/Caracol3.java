package ejerciciosT3;

import java.io.*;

public class Caracol3 implements Runnable {
    private String nomCaracol;
    private double velCaracol;
    private boolean meta = false;

    public Caracol3(String n, double v) {
        nomCaracol = n; velCaracol = v;
    }

    public void IniciarCarrera(String f) {
        File fichero = new File(f);
        int i = 0;
        while (i < 100) {
            if (fichero.exists()) {
                IO.println("El caracol "+nomCaracol + " abandona la carrera en el " +(int) Math.floor(i) +"%");
                break;
            } else {
                i+=velCaracol;
                if (i > 100) i=100; //si i se pasa de 100 en algun momento lo asignamos d vuelta a 100.
                IO.println("El caracol "+nomCaracol+" lleva un "+(int) Math.floor(i)+"% del total recorrido");
                if (i == 100 && !meta) {
                    try {
                        //Si no existe, bufferedWriter crea el fichero.
                        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
                        IO.println("El caracol "+nomCaracol+" ha llegado a la meta");
                        bw.write("El caracol "+nomCaracol+" ha llegado a la meta");
                        bw.close();
                        meta=true;

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
       // String contenidoFicheroGanador = LeerFichero(fichero);
        // IO.println(contenidoFicheroGanador);
    }

    public String LeerFichero(File f) {
        String contenido="";
        try (BufferedReader br=new BufferedReader(new FileReader(f))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido+=linea+"\n";
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contenido;
    }


    public void run() {
        IniciarCarrera("meta.txt");
    }

    public static void main() {
        Thread c1 = new Thread(new Caracol3("Pedro", 1+Math.random()*4));
        Thread c2 = new Thread(new Caracol3("Paco", 1+Math.random()*4));
        Thread c3 = new Thread(new Caracol3("Tate", 1+Math.random()*4));
        Thread c4 = new Thread(new Caracol3("Jeison", 1+Math.random()*4));
        Thread c5 = new Thread(new Caracol3("Tilin", 1+Math.random()*4));

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}