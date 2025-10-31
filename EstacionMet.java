/**
 * Autor: Allyson Dulce Abigail Escobar Sandoval
 * 
 * Representa una estación meteorológica de la cooperativa
 */
public class EstacionMet implements Sistemas {
    private int identificacion;
    private String fabricante;

    @Override
    public String getNombre() {
        return "Estación Meteorológica";
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
        return "Mide temperatura, humedad y velocidad del viento";
    }

    @Override
    public boolean soporta(int cantidad) {
        int horas = 12;
        return cantidad <= horas;
    }

    @Override
    public String accion() {
        return "La estación meteorológica no realiza acciones físicas. Solo mide y reporta.";
    }

    @Override
    public String registro() {
        return "Registro completado: Estación meteorológica ID " + identificacion + " activa y reportando.";
    }

    @Override
    public int medicion(int cantidad) {
        int consumoPorHora = 50; // kWh estimados
        return cantidad * consumoPorHora;
    }
}
