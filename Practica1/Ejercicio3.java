package Practica1;
import java.util.Scanner;

public class Ejercicio3 {
	Scanner leer = new Scanner(System.in);
	
	private double[] edades = new double[10];
	
	public Ejercicio3(){
		for(int n = 0; n < 10; n++) {
			this.edades[n] = leer.nextDouble();
		}
	}
	
	public double Promedio() {
		double suma = 0;
		double r;
		for(int i = 0; i<10; i++) {
			suma = suma + this.edades[i];
		}
		r=suma/10;
		return r;
	}
	
	public double DesviacionEstandar() {
		double promedio = Promedio();
		double suma = 0;
		double r;
		for(int i = 0; i < 10; i++) {
			suma = suma + Math.pow((this.edades[i]-promedio),2);
		}
		r = Math.sqrt(suma/(10-1));
		return r;
	}
}
