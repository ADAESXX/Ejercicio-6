/**
 * Autor: Allyson Dulce Abigail Escobar Sandoval
 * 
 * Representa un dron de monitoreo agrícola
 */
public class DronMonitoreo implements Sistemas {
    private int identificacion;
    private String fabricante;

    @Override
    public String getNombre() {
        return "Dron de Monitoreo";
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
        return "Captura imágenes multiespectrales, mide índice de vegetación y genera reportes de salud de cultivos.";
    }

    @Override
    public boolean soporta(int cantidad) {
        int horas = 6;
        return cantidad <= horas;
    }

    @Override
    public String accion() {
        return "Dron de monitoreo activado: iniciando vuelo y captura de imágenes multiespectrales.";
    }

    @Override
    public String registro() {
        return "Registro completado: Dron de monitoreo ID " + identificacion + " generando informes visuales.";
    }

    @Override
    public int medicion(int cantidad) {
        int consumoPorHora = 120; // kWh estimados
        return cantidad * consumoPorHora;
    }
    @Override
    public String toString() {
        return "ID: " + identificacion +" | Nombre: " + getNombre() +" | Fabricante: " + fabricante +" | Consumo: " + medicion(1) + " kWh";
    }
}
