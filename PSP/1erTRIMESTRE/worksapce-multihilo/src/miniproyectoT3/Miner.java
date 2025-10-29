package miniproyectoT3;

public class Miner implements Runnable {
    private int bolsa;
    private int tiempoExtraccion = 1000;

    public Miner() {
        bolsa = 0;
    }

    synchronized void extraerRecursos(String nomMinero) {
        while (Mina.getStock() != 0) {
            bolsa++;
            int stock = Mina.getStock();
            stock--;
            IO.println("El minero "+nomMinero+" ha extraido un recurso. Capacidad de la bolsa: "+bolsa);
        }
    }

    public void run() {
        extraerRecursos(Thread.currentThread().getName());
    }

    public int getBolsa() {
        return bolsa;
    }
}
