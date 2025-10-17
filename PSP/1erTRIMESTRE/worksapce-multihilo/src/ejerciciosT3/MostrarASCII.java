package ejerciciosT3;

public class MostrarASCII implements Runnable {
    private int tipo;

    public MostrarASCII(int t) {
        tipo = t;
    }

    public void mostrarASCII() {
        for (int i = 32; i <= 126; i++) {
            if (tipo == 1 && i % 2 == 0) {
                System.out.println("Hilo 1 (pares): " + i + " -> " + (char) i);
            } else if (tipo == 2 && i % 2 == 1) {
                System.out.println("Hilo 2 (impares): " + i + " -> " + (char) i);
            }

            // Pequeña pausa para que los hilos alternen
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        mostrarASCII();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MostrarASCII(1));
        Thread t2 = new Thread(new MostrarASCII(2));

        t1.start();
        t2.start();
    }
}

