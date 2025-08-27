package Practica1;

public class Ejercicio1 {
	private double a,b,c,d,e,f;
	public Ejercicio1(double A, double B, double C, double D, double E, double F){
		this.a=A;
		this.b=B;
		this.c=C;
		this.d=D;
		this.e=E;
		this.f=F;
	}
	public boolean tieneSolucion(){
		double res=((this.a*this.d)-(this.b*this.c));
		if(res!=0){
			return true;
		}else{
			return false;
		}
		
	}
	
	public double getX(){
		double x;
		double aux1;
		double aux2;
		aux1=(this.e*this.d)-(this.b*this.f);
		aux2=(this.a*this.d)-(this.b*this.c);
		x = aux1/aux2;
		return x;
	}
	
	public double getY(){
		double y;
		double aux1;
		double aux2;
		aux1=(this.a*this.f)-(this.e*this.c);
		aux2=(this.a*this.d)-(this.b*this.c);
		y = aux1/aux2;
		return y;
	}
		
		 
} 