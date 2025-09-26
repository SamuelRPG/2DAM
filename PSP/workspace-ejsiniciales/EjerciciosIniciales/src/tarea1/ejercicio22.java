package tarea1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listaPersonas = new ArrayList<String>();
		Scanner sc= new Scanner(System.in);
		String s;
		
		do {
			System.out.println("Introduce el nombre de la persona");
			s= sc.nextLine();
			if (s.equals("0")) System.out.println("Usted va a finalizar el programa");
			else listaPersonas.add(s);
		}while (!s.equals("0"));
		
		
		for (int i=0;i<listaPersonas.size();i++) {
			System.out.println("Nombre de la persona nº"+(i+1)+": "+(listaPersonas.get(i)));
		}
		sc.close();
	}

}
