package tarea1;

import java.util.ArrayList;
import java.util.List;

public class ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List <Integer> lista = new ArrayList();
        lista.add(101);
        lista.add(30);
        lista.add(200);

        System.out.println("El número mayor de la lista es "+ MayorDeTodos(lista));
	}

    public static int MayorDeTodos(List<Integer> l) {
        int mayor=Integer.MIN_VALUE;
        for (int elem : l) {
            if (elem > mayor) mayor  = elem;
        }
        return mayor;
    }

}
