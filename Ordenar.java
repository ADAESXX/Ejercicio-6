//Autor: Allyson Dulce Abigail Escobar Sandoval
import java.util.*;

public class Ordenar {
    public static void ordenarPorConsumo(ArrayList<Sistemas> catalogo){
        catalogo.sort((a,b) -> a.medicion(1) - b.medicion(1));
        System.out.println("Catálogo ordenado por consumo eléctrico:");
        for(Sistemas s : catalogo){
            System.out.println(s.getNombre() + " -> " + s.medicion(1) + " kWh");
        }
    }
}
