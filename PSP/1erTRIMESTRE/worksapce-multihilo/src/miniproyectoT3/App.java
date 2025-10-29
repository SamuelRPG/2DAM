package miniproyectoT3;

public class App {
    public static void main (String[] args) {
        Mina mina = new Mina(1200);
        Miner minero = new Miner();
        Thread hilo;
         for (int i=0; i < 30; i++) {
             hilo = new Thread(minero);
             hilo.setName("Minero "+ i);
             hilo.start();
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

         IO.println("Stock restante: " + Mina.getStock());
    }
}
