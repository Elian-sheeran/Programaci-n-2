package examen;

public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA MI TELEFÉRICO - 2do EXAMEN");
        System.out.println("=\n");
        
        MiTeleferico teleferico = new MiTeleferico();
        
        Persona p1 = new Persona("Chio", 20, 60);
        Persona p2 = new Persona("Luis", 30, 70);
        Persona p3 = new Persona("Aless", 65, 55);
        Persona p4 = new Persona("Lucas", 40, 80);
        Persona p5 = new Persona("Angy", 18, 75);
        Persona p6 = new Persona("Sharol", 28, 65);
        
        Cabina cab1 = new Cabina(101);
        Cabina cab2 = new Cabina(102);
        Cabina cab3 = new Cabina(201);
        Cabina cab4 = new Cabina(301);
        
        teleferico.agregarCabina("Amarillo", cab1);
        teleferico.agregarCabina("Amarillo", cab2);
        teleferico.agregarCabina("Rojo", cab3);
        teleferico.agregarCabina("Verde", cab4);
        
        System.out.println("\n: AGREGANDO PERSONAS A CABINAS ---");
        teleferico.agregarPrimeraPersonaACabina("Amarillo", 101, p1);
        teleferico.agregarPrimeraPersonaACabina("Amarillo", 101, p2);
        teleferico.agregarPrimeraPersonaACabina("Rojo", 201, p3);
        teleferico.agregarPrimeraPersonaACabina("Verde", 301, p4);
        teleferico.agregarPrimeraPersonaACabina("Verde", 301, p5);
        teleferico.agregarPrimeraPersonaACabina("Verde", 301, p6);
        
        teleferico.verificarTodasCabinas();
        
        float total = teleferico.calcularIngresoTotal();
        System.out.println("\n INGRESO TOTAL: " + total + " bs");
        
        teleferico.mostrarLineaConMasIngresoRegular();
    }
}