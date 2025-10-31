/**
 * Autor: Allyson Dulce Abigail Escobar Sandoval
 * 
 * Representa un dron de riego agrícola
 */
public class DronRiego implements Sistemas {
    private int identificacion;
    private String fabricante;

    @Override
    public String getNombre() {
        return "Dron de Riego";
    }

    @Override
    public void setID(int id) {
        identificacion = id;
    }

    @Override
    public int getID() {
        return identificacion;
    }

    @Override
    public void setFabricante(String fabri) {
        fabricante = fabri;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String getCaracteristicas() {
        return "Rocía las parcelas agrícolas con precisión. Incluye sensores de nivel de agua y presión.";
    }

    @Override
    public boolean soporta(int cantidad) {
        int horas = 8;
        return cantidad <= horas;
    }

    @Override
    public String accion() {
        return "Dron de riego activado: rociando parcelas con agua y nutrientes.";
    }

    @Override
    public String registro() {
        return "Registro completado: Dron de riego ID " + identificacion + " en operación controlada.";
    }

    @Override
    public int medicion(int cantidad) {
        int consumoPorHora = 150; // kWh estimados
        return cantidad * consumoPorHora;
    }
}
