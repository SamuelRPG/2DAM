package ejsComplementarios.ejercicio1;

public class Subproceso {
    public static void main (String[] args) {
        int personas;
        int contador = 0;
        if (args.length == 0) {
            personas = 100;
        } else {
            personas = Integer.parseInt(args[0]);
        }
        Hilo sp = new Hilo();
        for (int i=0; i < personas; i++ ) {
            Thread t = new Thread(sp);
            contador++;
            t.start();
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        IO.println("La lista creada tiene un tamaño de "+ Hilo.getLista().size());
        IO.println("Han participado "+contador+" en la lista");
    }

}
