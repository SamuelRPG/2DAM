package miniproyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Modelo {
	
	private String f;
	private String fSalida;
	
	public Modelo() {
	f = "lorem.txt";	
	fSalida = "lorem_salida.txt";
	}
	public String getf() {
		return f;
	}
	public String getfSalida() {
		return fSalida;
	}
	
	public String LeerFichero(String f) {
		String contenido="";
		try {
			FileReader fr= new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			
			while ((linea = br.readLine()) != null) {
				contenido+=linea + "\n";
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return contenido;
	}
	
	public int BuscarCoincidencias(String busqueda) {
		int contador = 0;
		String palabraBuscada = busqueda.toLowerCase();
		String texto = LeerFichero(f);
		Integer index = -1;
		index = texto.indexOf(busqueda);
		while (index != -1) {
			contador++;
			index = texto.indexOf(busqueda, index + 1);
		}
		return contador;
	}
	
	public void Reemplazar(String palabraParaReemplazar, String palabraDeReemplazo) {
		String contenido = LeerFichero(f);
		String contenidoModificado = contenido.replaceAll(palabraParaReemplazar, palabraDeReemplazo);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fSalida));){
			bw.write(contenidoModificado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
