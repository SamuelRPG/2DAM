package miniproyectoT3;

public class Miner implements Runnable {
    private int bolsa;
    private int tiempoExtraccion = 1000;
    private Mina minaRecursos;
    private static int bolsaComun = 0;

    public Miner(int tiempo, Mina m) {
        bolsa = 0;
        tiempoExtraccion = tiempo;
        minaRecursos = m;
    }

    void extraerRecursos(String nomMinero) {
        synchronized (minaRecursos) {  // Sincronizamos solo el acceso a la mina
            if (minaRecursos.hayChamba()) {
                minaRecursos.setStock(minaRecursos.getStock() - 1);
                bolsa++;
                bolsaComun++;
                IO.println("El minero " + nomMinero + " tiene " + bolsa + " minerales en la bolsa. Quedan " + minaRecursos.getStock() + " minerales");
            }
        }
    }


    public void run() {
        while (minaRecursos.hayChamba()) {
            try {
                extraerRecursos(Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int getBolsa() {
        return bolsa;
    }
    public static int getBolsaComun() {return bolsaComun;}
}
