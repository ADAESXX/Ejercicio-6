//Autor: Allyson Dulce Abigail Escobar Sandoval
import java.util.ArrayList;

public class Busqueda {
    public static void buscar(ArrayList<Sistemas> catalogo, String dato){
        try {
            int id = Integer.parseInt(dato);
            for(Sistemas s : catalogo){
                if(s.getID() == id){
                    mostrarInfo(s);
                    return;
                }
            }
        } catch(NumberFormatException e){
            for(Sistemas s : catalogo){
                if(s.getNombre().equalsIgnoreCase(dato)){
                    mostrarInfo(s);
                    return;
                }
            }
        }
    }

    private static String mostrarInfo(Sistemas s){
        return "---------- Informacionn dl Sistema -------ID: " + s.getID() +"Nombre: " + s.getNombre() +"Fabricante: " + s.getFabricante() + "Características: " + s.getCaracteristicas() + "Registro: " + s.registro()+"Acción: " + s.accion();
    }
}
