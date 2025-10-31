//Autor: Allyson Dulce Abigail Escobar Sandoval
import java.util.*;

public class Ordenar {
    public static String ordenarPorConsumo(ArrayList<Sistemas> catalogo){
        catalogo.sort((a,b) -> a.medicion(1) - b.medicion(1));
        String cadena="Catálogo ordenado por consumo eléctrico:";
        for(Sistemas s : catalogo){
            cadena+= s.getNombre() + " -> " + s.medicion(1) + " kWh";
        }
        return cadena;
    }
}
