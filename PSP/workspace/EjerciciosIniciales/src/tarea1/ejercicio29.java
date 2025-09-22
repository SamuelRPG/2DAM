//ya que este ejercicio es casi igual al anterior, uso ChatGPT
//para darme ideas de validacion para variables introducidas por teclado.

package tarea1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = 0; // cantidad de vehículos
        boolean valido = false;

        // 🔹 Preguntar hasta que el usuario meta un número válido
        do {
            System.out.println("Introduce cuantos vehiculos quieres introducir:");
            if (sc.hasNextInt()) {
                index = sc.nextInt();
                valido = true;
            } else {
                System.out.println("⚠️ Error: Debes introducir un número entero.");
                sc.next(); // consumir lo que el usuario metió mal
            }
        } while (!valido);

        sc.nextLine(); // ⚠️ limpiar salto de línea pendiente de nextInt()

        List<Vehiculo> listaVehiculos = new ArrayList<>();

        for (int i = 0; i < index; i++) {
            System.out.println("Ingresa el tipo de vehículo: ");
            String tipo = sc.nextLine();
            System.out.println("Ingresa la marca del vehiculo: ");
            String marca = sc.nextLine();
            System.out.println("Ingresa el modelo del vehiculo: ");
            String modelo = sc.nextLine();

            Vehiculo h = new Vehiculo(tipo, marca, modelo);
            listaVehiculos.add(h);
        }

        Vehiculo.ListarVehiculos(listaVehiculos);
        sc.close();
    }
}
