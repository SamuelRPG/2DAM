package tarea1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		List<Double> suspensos = new ArrayList<>();
		List<Double> aprobados = new ArrayList<>();
		List<Double> notables = new ArrayList<>();
		List<Double> excelentes = new ArrayList<>();
		List<Double> matricula = new ArrayList<>();
		Integer contador=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce la nota número "+ (contador+1)+": ");
			double e = sc.nextDouble();
			if (e < 0 || e > 10) {
				System.out.println("No se puede asignar esta nota");
			} 	else if (e < 5) { suspensos.add(e); contador++; }
				else if (e >= 5 && e < 7) { aprobados.add(e); contador++; }
				else if (e >= 7 && e < 9) { notables.add(e); contador++;}
				else if (e >= 9 && e < 10) { excelentes.add(e); contador++;}
				else { matricula.add(e); contador++;}
		} while (contador < 10);
		
		if (suspensos.isEmpty()) { System.out.println("No hay ningún supenso");
		} else {
			System.out.println("Hay "+ suspensos.size()+" suspendidos");
			System.out.println("Notas de los suspendidos: ");
			for(int i=0; i<suspensos.size(); i++) {
				System.out.println("Nota del suspendido número"+(i+1)+": "+suspensos.get(i));
			}
		}
		
		if (aprobados.isEmpty()) { System.out.println("No hay ningún alumno en la lista de aprobados");
		} else {
			System.out.println("Hay "+ aprobados.size()+" aprobados");
			System.out.println("Notas de los aprobados: ");
			for(int i=0; i<aprobados.size(); i++) {
				System.out.println("Nota del aprobado número"+(i+1)+": "+aprobados.get(i));
			}
		}
		
		if (notables.isEmpty()) { System.out.println("No hay ningún alumno con notable");
		} else {
			System.out.println("Hay "+ notables.size()+" notables");
			System.out.println("Notas de los notables: ");
			for(int i=0; i<notables.size(); i++) {
				System.out.println("Nota del notable número"+(i+1)+": "+notables.get(i));
			}
		}
		
		if (excelentes.isEmpty()) { System.out.println("No hay ningún excelente");
		} else {
			System.out.println("Hay "+ excelentes.size()+" excelentes");
			System.out.println("Notas de los excelentes: ");
			for(int i=0; i<excelentes.size(); i++) {
				System.out.println("Nota del excelente número"+(i+1)+": "+excelentes.get(i));
			}
		}
		
		if (matricula.isEmpty()) { System.out.println("No hay ninguna matrícula");
		} else {
			System.out.println("Hay "+ matricula.size()+" matrículas");
			System.out.println("Notas de las matriculas: ");
			for(int i=0; i<matricula.size(); i++) {
				System.out.println("Nota de la matricula número"+(i+1)+": "+matricula.get(i));
			}
		}
		
		
		

	}

}
