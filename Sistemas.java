public interface Sistemas{
    /**
     * Autor: Allyson Dulce Abigail Escobar Sandoval
     * 
     * 
     * Atributos de todos los sistemas: sensores de suelo, estaciones meteorológicas, drones de riego y monitoreo
     * @return
     */
    public String getNombre();
    public void setID(int id);
    public int getID();
    public String getCaracteristicas();
    public void setFabricante(String fabri);
    public String getFabricante();
    //////////////Contratos de acceso///////////////
    /**
     * Permite verificar si el sistema soporta o no
     * @param cantidad: int - permite ver la cantidad de horas que soporta el funcionamiento 
     */
    public boolean soporta(int cantidad);
    /**
     * Permite realizar la accion del sistema
     */
    public String accion();
    /**
     * Registra el sistema 
     */
    public String registro();
    //permite ver el consumo eléctrico
    public int medicion(int cantidad);

}