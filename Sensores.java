/**
 * Autor: Allyson Dulce Abigail Escobar Sandoval
 * 
 * Uno de los sitemas de la coorporación
 */
public class Sensores implements Sistemas{
    private int identificacion;
    private String fabricante;

    @Override
    public String getNombre() {
        return "Sensores de suelo";
    }
    @Override
    public void setID(int id) {
        identificacion=id;
    }
    @Override
    public int getID() {
        return identificacion;
    }

    @Override
    public void setFabricante(String fabri) {
        fabricante= fabri;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String getCaracteristicas() {
        return "Este sistema es el encargado de la ejecución de apertura de las válvulas";
    }

    @Override
    public boolean soporta(int cantidad) {
        int horasdeaguante=10;
        return cantidad <= horasdeaguante;
    }

    @Override
    public String accion() {
        return "Sistema de sensores de suelo iniciado...";
    }

    @Override
    public String registro() {
        return "Registro completado: Sensor de suelo con ID " + identificacion + " agregado al sistema.";
    }

    @Override
    public int medicion(int cantidad) {
        //es un valor elegido aleatoriamente kWh
        int consumoElectricoXHora= 100;
        return cantidad*consumoElectricoXHora;
    }

    
}
