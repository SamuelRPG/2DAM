package ejerciciosT3;

public class Contador implements Runnable {
    private String nomFil;
    private int inicioContador;
    private int limitContador;

    public Contador(String nom, int inicio, int limite) {
        nomFil = nom;
        inicioContador = inicio;
        limitContador = limite;
    }

    public void CuentaRegresiva() {
        for (int i = inicioContador; i < limitContador; i++) {
            IO.println("Cuenta regresiva del hilo "+ nomFil + " : "+ i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        CuentaRegresiva();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Contador("01", 1, 10));
        Thread t2 = new Thread(new Contador("02", 4, 12));
        Thread t3 = new Thread(new Contador("03", 2, 15));
        Thread t4 = new Thread(new Contador("04", 1, 30));
        Thread t5 = new Thread(new Contador("05", 1, 6));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
