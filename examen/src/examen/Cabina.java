package examen;

public class Cabina {
    private int nroCabina;
    private Persona[] personasAbordo;
    private int cantidadPersonas;
    private float pesoActual;
    
    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        this.personasAbordo = new Persona[10];
        this.cantidadPersonas = 0;
        this.pesoActual = 0;
    }
    
    public boolean agregarPersona(Persona p) {
        if (cantidadPersonas >= 10) return false;
        if (pesoActual + p.getPesoPersona() > 850) return false;
        
        personasAbordo[cantidadPersonas] = p;
        cantidadPersonas++;
        pesoActual += p.getPesoPersona();
        return true;
    }
    
    public int getNroCabina() { return nroCabina; }
    public int getCantidadPersonas() { return cantidadPersonas; }
    public float getPesoActual() { return pesoActual; }
    public Persona[] getPersonasAbordo() { return personasAbordo; }
    
    public boolean cumpleReglas() {
        return cantidadPersonas <= 10 && pesoActual <= 850;
    }
    
    public float calcularIngreso() {
        float total = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            if (personasAbordo[i].getEdad() <= 25 || personasAbordo[i].getEdad() >= 60) {
                total += 1.5f;
            } else {
                total += 3.0f;
            }
        }
        return total;
    }
    
    public float calcularIngresoRegular() {
        float total = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            if (personasAbordo[i].getEdad() > 25 && personasAbordo[i].getEdad() < 60) {
                total += 3.0f;
            }
        }
        return total;
    }
}