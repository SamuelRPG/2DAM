package tarea1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio28 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		for (int i=0; i < 5; i++) {
			System.out.println("Ingresa el tipo de vehículo: ");
			String tipo = sc.nextLine();
			System.out.println("Ingresa la marca del vehiculo: ");
			String marca = sc.nextLine();
			System.out.println("Ingresa el tipo de modelo: ");
			String modelo = sc.nextLine();
			
			Vehiculo h = new Vehiculo(tipo, marca, modelo);
			listaVehiculos.add(h);
		}
		Vehiculo.ListarVehiculos(listaVehiculos);
		sc.close();
	}
}

class Vehiculo {
	private String tipo;
	private String marca;
	private String modelo;
	
	public Vehiculo (String t, String marc, String mod) {
		this.tipo = t;
		this.marca = marc;
		this.modelo = mod;
	}
	
	public static void ListarVehiculos(List<Vehiculo> l) {
		for(Vehiculo elem : l) {
			System.out.println("Tipo de vehiculo: "+elem.tipo);
			System.out.println("Marca del vehiculo: "+elem.marca);
			System.out.println("Modelo del vehiculo: "+elem.modelo);
		}
	}
}