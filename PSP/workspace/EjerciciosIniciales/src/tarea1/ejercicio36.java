package tarea1;

import java.util.Scanner;

public class ejercicio36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el nombre del empleado: ");
        String nom = sc.nextLine();
        System.out.println("Introduce los años de experiencia: ");
        int anyosExp = sc.nextInt();
        Empleado emp = new Empleado(nom, anyosExp);

        System.out.println(emp.SalarioEstimado());
    }
}

class Empleado {
    private String nombre;
    private int anyosExp;

    public Empleado (String n, int aExp) { this.nombre=n; this.anyosExp=aExp;}

    public String SalarioEstimado() {
        if (anyosExp < 1) return "Desenvolupador Junior L1 – 15000-18000";
        else if (anyosExp <=2) return "Desenvolupador Junior L2 – 18000-22000";
        else if (anyosExp <=5) return "Desenvolupador Junior L1 – 22000-28000";
        else if (anyosExp <=8) return "Desenvolupador Sènior L2 – 28000-36000";
        else return "Analista / Arquitecte. Salari a convenir en base a rol";
    }
}
