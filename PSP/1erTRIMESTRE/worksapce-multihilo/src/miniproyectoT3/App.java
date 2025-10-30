package miniproyectoT3;

public class App {
    public static void main (String[] args) {
        int total = 0;
        Mina mina = new Mina(12000);
         for (int i=0; i < 30; i++) {
             Thread hilo = new Thread(new Miner(500, mina));
             hilo.setName("Minero "+ i);
             hilo.start();
         }
         try {
             Thread.sleep(500);
         } catch (Exception e) {
             e.printStackTrace();
         }

         IO.println("Stock restante: " + Mina.getStock());
         IO.println("Minerales extraidos: "+Miner.getBolsaComun());
    }
}
