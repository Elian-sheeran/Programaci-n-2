package Practica02;

public class Main {
    public static void main(String[] args) {
        Vector a = new Vector(2, 3, 1);
        Vector b = new Vector(-1, 2, 0);

        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);

        System.out.println("a ⟂ b (producto punto): " + AlgebraVectorial.esPerpendicular3(a, b));
        System.out.println("a || b: " + AlgebraVectorial.esParalelo1(a, b));
        System.out.println("Proy_a sobre b: " + AlgebraVectorial.proyeccion(a, b));
        System.out.println("Componente de a en b: " + AlgebraVectorial.componente(a, b));
    }
}