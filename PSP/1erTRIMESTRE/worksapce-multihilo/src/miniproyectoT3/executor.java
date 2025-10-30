package miniproyectoT3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executor {
    public static final int NUMHILOS = 10;
    public static void main (String[] args) {
        int total = 0;
        Mina mina = new Mina(12000);
        ExecutorService es = Executors.newFixedThreadPool(NUMHILOS);
        for (int i=0; i < 30; i++) {
            es.execute(new Miner(500, mina));
        }
        es.shutdown();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }

        IO.println("Stock restante: " + Mina.getStock());
        IO.println("Minerales extraidos: "+Miner.getBolsaComun());
    }
}
