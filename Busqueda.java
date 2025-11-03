// Autor: Allyson Dulce Abigail Escobar Sandoval
import java.util.ArrayList;

public class Busqueda {

    public static String buscar(ArrayList<Sistemas> catalogo, String dato) {
        try {
            int id = Integer.parseInt(dato);
            for (Sistemas s : catalogo) {
                if (s.getID() == id) {
                    return mostrarInfo(s);
                }
            }
        } catch (NumberFormatException e) {
            for (Sistemas s : catalogo) {
                if (s.getNombre().equalsIgnoreCase(dato)) {
                    return mostrarInfo(s);
                }
            }
        }
        return "No se encontró ningún equipo con el dato ingresado.";
    }

    private static String mostrarInfo(Sistemas s) {
        return """
               ------ Informacion del Sistema ------
               ID: """ + s.getID() +
                "\nNombre: " + s.getNombre() +
                "\nFabricante: " + s.getFabricante() +
                "\nCaracterísticas: " + s.getCaracteristicas() +
                "\nRegistro: " + s.registro() +
                "\nAcción: " + s.accion() + "\n";
    }
}
