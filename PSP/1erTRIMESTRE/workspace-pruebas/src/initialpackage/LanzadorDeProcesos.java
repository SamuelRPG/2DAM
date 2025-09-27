package initialpackage;

public class LanzadorDeProcesos {
    public void ejecutar (String ruta) {
        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder(ruta);
            pb.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) {
        String ruta = "C:\\Windows\\System32\\calc.exe";
        LanzadorDeProcesos lp = new LanzadorDeProcesos();
        lp.ejecutar(ruta);
        System.out.println("Finalizado");
    }
}
