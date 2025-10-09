package miniproyecto;

import java.io.BufferedReader;
import java.io.FileReader;

public class Modelo {
	public int BuscarCoincidencias(String busqueda, String texto) {
		int contador = 0;
		String palabraBuscada = busqueda.toLowerCase();
		String linea;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(texto));
			while ((linea = br.readLine()) != null) {
				String[] palabras = linea.toLowerCase().split("//W+");
				for (String elem : palabras) {
					if (elem == palabraBuscada) contador++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return contador;
	}
	
	public int Reemplazar(String reemplazo, String texto) {
		
	}
}
