// Autor: Allyson Dulce Abigail Escobar Sandoval
import java.util.ArrayList;

public class Ordenar {

    public static String ordenarPorConsumo(ArrayList<Sistemas> catalogo) {
        catalogo.sort((a, b) -> a.medicion(1) - b.medicion(1));
        StringBuilder cadena = new StringBuilder("\nCatálogo ordenado por consumo eléctrico:\n");
        for (Sistemas s : catalogo) {
            cadena.append(s.toString()).append("\n");
        }
        return cadena.toString();
    }
}