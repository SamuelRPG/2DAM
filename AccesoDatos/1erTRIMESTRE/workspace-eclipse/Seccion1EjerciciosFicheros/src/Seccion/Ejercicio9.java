package Seccion;
import java.io.*;
import java.util.*;

public class Ejercicio9 {
    public static void main (String[] args) {
        String ruta = args[0];
        File archivo = new File(ruta);
        if (archivo.exists()) {
            if (archivo.canRead() && archivo.canExecute() && archivo.canWrite()) {
                int opcion;
                do {
                    Scanner sc = new Scanner(System.in);
                    MostrarMenu();
                    System.out.println("Selecciona opcion");
                    opcion = sc.nextInt();
                    if (opcion < 1 || opcion > 5) {
                        System.out.println("Tt tas rallao");
                    } else {
                        switch (opcion) {
                            case 1:
                                getInfo(archivo);
                                break;
                            case 2:
                                crearCarpeta(archivo);
                                break;
                            case 3:
                                crearFichero(archivo);
                                break;
                            case 4:
                                renombrarArchivo(archivo);
                                break;
                            case 5:
                                eliminarArchivo(archivo);
                                break;
                        }
                    }
                } while (opcion < 1 || opcion > 5);
            }
        } else {
            return;
        }
    }
    public static void MostrarMenu() {
        System.out.println("MENU DE OPCIONES");
        System.out.println("================");
        System.out.println("1. Obtener información del archivo");
        System.out.println("2. Crear carpeta en directorio local");
        System.out.println("3. Crear fichero en la carpeta creada");
        System.out.println("4. Renombrar archivo");
        System.out.println("5. Eliminar archivo");
    }

    public static void getInfo(File f) {
        System.out.println("Nombre del directorio " + f.getName());
        System.out.println("Ruta: "+ f.getPath());
        System.out.println("Ruta absoluta: "+ f.getAbsolutePath());
        System.out.println("Se puede leer: "+ f.canRead());
        System.out.println("Se puede escribir: "+ f.canWrite());
        System.out.println("Tamaño:"+f.length());
    }

    public static void crearCarpeta(File f) {
        if (f.isDirectory()) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Introduce el nombre de la carpeta a crear");
            String e = sc.nextLine();
            File directorioCreado = new File(f, e);
            if (directorioCreado.mkdir()) {
                System.out.println("Carpeta creada en " + directorioCreado.getAbsolutePath());
            } else System.out.println("No se pudo crear la carpeta");
        } else System.out.println("No se puede crear la carpeta porque no es un directorio");
    }

    public static void crearFichero(File f) {
        if (f.isDirectory()) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Introduce el nombre del fichero a crear");
            String e = sc.nextLine();
            File ficheroCreado = new File (f, e);
            try {
                ficheroCreado.createNewFile();
               System.out.println("Se ha creado el fichero con éxito");
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
    }

    public static void renombrarArchivo(File f) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el nombre para renombrar el fichero/directorio");
        String e = sc.nextLine();
        File archivoRenombrado = new File (f.getParent(), e);
        try {
            f.renameTo(archivoRenombrado);
        } catch (Exception er) {
            er.printStackTrace();
            System.out.println("No se pudo renombrar el archivo");
        }
    }

    public static void eliminarArchivo(File f) {
        try {
            f.delete();
            System.out.println("Se ha eliminado el archivo");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo eliminar el archivo");
        }
    }
}
