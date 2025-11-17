package examen;

public class Linea {
    private String color;
    private Persona[] filaPersonas;
    private Cabina[] cabinas;
    private int cantidadCabinas;
    
    public Linea(String color) {
        this.color = color;
        this.filaPersonas = new Persona[100];
        this.cabinas = new Cabina[10];
        this.cantidadCabinas = 0;
    }
    
    public void agregarPersona(Persona p) {
        for (int i = 0; i < filaPersonas.length; i++) {
            if (filaPersonas[i] == null) {
                filaPersonas[i] = p;
                break;
            }
        }
    }
    
    public void agregarCabina(Cabina cabina) {
        if (cantidadCabinas < cabinas.length) {
            cabinas[cantidadCabinas] = cabina;
            cantidadCabinas++;
        }
    }
    
    public boolean agregarPrimeraPersonaACabina(int nroCabina, Persona persona) {
        for (int i = 0; i < cantidadCabinas; i++) {
            if (cabinas[i].getNroCabina() == nroCabina) {
                boolean resultado = cabinas[i].agregarPersona(persona);
                if (resultado) {
                    System.out.println("- " + persona.getNombre() + " agregado a cabina " + nroCabina + " línea " + color);
                } else {
                    System.out.println("❌ No se pudo agregar " + persona.getNombre() + " a cabina " + nroCabina);
                }
                return resultado;
            }
        }
        System.out.println("❌ Cabina " + nroCabina + " no encontrada en línea " + color);
        return false;
    }
    
    public boolean verificarReglasCabinas() {
        for (int i = 0; i < cantidadCabinas; i++) {
            if (!cabinas[i].cumpleReglas()) {
                System.out.println("❌ Cabina " + cabinas[i].getNroCabina() + " NO cumple reglas");
                return false;
            }
        }
        System.out.println("Todas las cabinas de línea " + color + " cumplen reglas");
        return true;
    }
    
    public float calcularIngresoLinea() {
        float total = 0;
        for (int i = 0; i < cantidadCabinas; i++) {
            total += cabinas[i].calcularIngreso();
        }
        return total;
    }
    
    public float calcularIngresoRegularLinea() {
        float total = 0;
        for (int i = 0; i < cantidadCabinas; i++) {
            total += cabinas[i].calcularIngresoRegular();
        }
        return total;
    }
    
    public String getColor() { return color; }
    public Cabina[] getCabinas() { return cabinas; }
    public int getCantidadCabinas() { return cantidadCabinas; }
}