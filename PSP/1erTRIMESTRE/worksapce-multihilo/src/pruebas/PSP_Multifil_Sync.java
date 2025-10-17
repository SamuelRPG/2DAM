package pruebas;

public class PSP_Multifil_Sync implements Runnable {
    int entradesDisponibles = 100;
    static int entradesVenudes = 0;

    synchronized public void reservaEntrada(String nom, int entrades) {
        //public void reservaEntrada (String nom, int entrades) {
        if (entrades <= entradesDisponibles) {
            System.out.println(entrades + " reservades per a " + nom);
            entradesDisponibles = entradesDisponibles - entrades;
            entradesVenudes = entradesVenudes + entrades;
        } else {
            System.out.println("No queden entrades");
        }
    }

    public void run() {
        String nom = Thread.currentThread().getName();
        int entrades = (int) (Math.random() * 10 + 1);
        reservaEntrada(nom, entrades);
    }

    public static void main (String[]args) {
        PSP_Multifil_Sync s = new PSP_Multifil_Sync ();
        Thread t;
        for (int i = 0; i < 100; i++) {
            t = new Thread(s);
            t.setName("Client " + (i + 1));
            t.start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        } //Pausa per a que acaben tots els threads
        System.out.println("Total entrades venudes: " +
                entradesVenudes);
    }
}
