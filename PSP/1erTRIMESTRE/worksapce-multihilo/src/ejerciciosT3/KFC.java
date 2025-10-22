package ejerciciosT3;

public class KFC implements Runnable{
    private static int alitas = 100;


    synchronized void consumirAla(String nom, int cantidad) {
        if (cantidad > alitas) {
            IO.println("No quedan alitas tt");
        } else {
            IO.println(nom+" ha consumido "+cantidad+ " alitas");
            alitas-=cantidad;
        }
     }


    public void run() {
        String nombre = Thread.currentThread().getName();
        int numAlitas =(int) (1 + Math.random() * 5);
        consumirAla(nombre, numAlitas);
    }

    public static void main(String[] args) {
        KFC pollo = new KFC();
        Thread t;
        for (int i=0; i < 30; i++) {
            t = new Thread(pollo);
            t.setName("Alumno " +(i+1));
            t.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
