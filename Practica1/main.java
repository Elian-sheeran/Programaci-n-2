package Practica1;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("-------------------------EJERCICIO 1-------------------------");
		System.out.println("Ingrese los datos del ejercicio 1");
		double a = leer.nextDouble();
		double b = leer.nextDouble();
		double c = leer.nextDouble();
		double d = leer.nextDouble();
		double e = leer.nextDouble();
		double f = leer.nextDouble();
		Ejercicio1 E1 = new Ejercicio1(a,b,c,d,e,f);
		if(E1.tieneSolucion() == true) {
			System.out.println("Tiene Solucion");
			System.out.println(E1.getX());
			System.out.println(E1.getY());
		} else {
			System.out.println("No tiene solucion");
		}
		
		System.out.println("-------------------------EJERCICIO 2-------------------------");
		System.out.println("Ingrese los datos del ejercicio 2");
		double a2 = leer.nextDouble();
		double b2 = leer.nextDouble();
		double c2 = leer.nextDouble();
		Ejercicio2 E2 = new Ejercicio2(a2, b2, c2);
		if(E2.Discriminante() > 0) {
			System.out.println("La ecuacion tiene dos raices");
			System.out.println(E2.getRaiz1());
			System.out.println(E2.getRaiz2());
		} 
		if(E2.Discriminante() == 0) {
			System.out.println("La ecuacion tiene una raiz");
			System.out.println(E2.getRaiz1());
		}
		if(E2.Discriminante() < 0) {
			System.out.println("La ecuacion no tiene raices reales");
		} 		
		
		
		System.out.println("-------------------------EJERCICIO 3-------------------------");
		System.out.println("Ingrese los datos del ejercicio 3");
		Ejercicio3 E3 = new Ejercicio3();
		
		System.out.println("El promedio es " + E3.Promedio());
		System.out.println("La desviacion estandar es" + E3.DesviacionEstandar());
		
	}

}
