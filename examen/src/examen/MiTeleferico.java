package examen;

public class MiTeleferico {
    private Linea[] lineas;
    private float cantidadIngresos;
    
    public MiTeleferico() {
        this.lineas = new Linea[3];
        this.lineas[0] = new Linea("Amarillo");
        this.lineas[1] = new Linea("Rojo");
        this.lineas[2] = new Linea("Verde");
        this.cantidadIngresos = 0;
    }
    
    public void agregarPersonaFila(Persona p, String linea) {
        for (Linea l : lineas) {
            if (l.getColor().equals(linea)) {
                l.agregarPersona(p);
                break;
            }
        }
    }
    
    public void agregarCabina(String linea, Cabina cabina) {
        for (Linea l : lineas) {
            if (l.getColor().equals(linea)) {
                l.agregarCabina(cabina);
                System.out.println("Cabina " + cabina.getNroCabina() + " agregada a línea " + linea);
                break;
            }
        }
    }
    
    public boolean agregarPrimeraPersonaACabina(String colorLinea, int nroCabina, Persona persona) {
        for (Linea linea : lineas) {
            if (linea.getColor().equals(colorLinea)) {
                return linea.agregarPrimeraPersonaACabina(nroCabina, persona);
            }
        }
        System.out.println("❌ Línea " + colorLinea + " no encontrada");
        return false;
    }
    
    public boolean verificarTodasCabinas() {
        System.out.println("\n--- VERIFICANDO REGLAS DE LAS CABINAS ---");
        boolean todasCumplen = true;
        for (Linea linea : lineas) {
            if (!linea.verificarReglasCabinas()) {
                todasCumplen = false;
            }
        }
        return todasCumplen;
    }
    
    public float calcularIngresoTotal() {
        System.out.println("\n--- CALCULANDO INGRESOS TOTALES ---");
        float total = 0;
        for (Linea linea : lineas) {
            float ingresoLinea = linea.calcularIngresoLinea();
            total += ingresoLinea;
            System.out.println("Línea " + linea.getColor() + ": " + ingresoLinea + " bs");
        }
        this.cantidadIngresos = total;
        return total;
    }
    
    public void mostrarLineaConMasIngresoRegular() {
        System.out.println("\n--- LÍNEA CON MÁS INGRESO REGULAR ---");
        String lineaMax = "";
        float maxIngreso = -1;
        
        for (Linea linea : lineas) {
            float ingreso = linea.calcularIngresoRegularLinea();
            System.out.println("Línea " + linea.getColor() + " (solo regular): " + ingreso + " bs");
            
            if (ingreso > maxIngreso) {
                maxIngreso = ingreso;
                lineaMax = linea.getColor();
            }
        }
        
        if (!lineaMax.isEmpty()) {
            System.out.println(" LÍNEA GANADORA: " + lineaMax + " - " + maxIngreso + " bs");
        }
    }
}