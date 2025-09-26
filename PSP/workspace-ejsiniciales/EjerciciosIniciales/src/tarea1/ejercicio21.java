package tarea1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listaPersonas = new ArrayList<String>();
		Scanner sc= new Scanner(System.in);
		
		for (int i=0;i<5;i++) {
			System.out.println("Introduce el nombre de la persona número "+(i+1)+": ");
			String s= sc.nextLine();
			listaPersonas.add(s);
		}
		
		for (int i=0;i<listaPersonas.size();i++) {
			System.out.println("Nombre de la persona nº"+(i+1)+": "+(listaPersonas.get(i)));
		}
		sc.close();
	}

}
