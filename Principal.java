// Autor: Allyson Dulce Abigail Escobar Sandoval
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Sistemas> catalogo = new ArrayList<>();

        // Datos para el catalogo
        Sensores s1 = new Sensores(); s1.setID(1); s1.setFabricante("AgroTech");
        Sensores s2 = new Sensores(); s2.setID(2); s2.setFabricante("GreenSoil");
        EstacionMet e1 = new EstacionMet(); e1.setID(3); e1.setFabricante("ClimaCorp");
        EstacionMet e2 = new EstacionMet(); e2.setID(4); e2.setFabricante("MeteoPro");
        DronRiego d1 = new DronRiego(); d1.setID(5); d1.setFabricante("AgriFly");
        DronRiego d2 = new DronRiego(); d2.setID(6); d2.setFabricante("CropJet");
        DronMonitoreo dm1 = new DronMonitoreo(); dm1.setID(7); dm1.setFabricante("SkyVision");
        DronMonitoreo dm2 = new DronMonitoreo(); dm2.setID(8); dm2.setFabricante("TerraScan");
        EstacionMet e3 = new EstacionMet(); e3.setID(9); e3.setFabricante("WeatherNow");
        Sensores s3 = new Sensores(); s3.setID(10); s3.setFabricante("FieldSense");

        // Agregar sistemas al catálogo
        catalogo.add(s1); 
        catalogo.add(s2); 
        catalogo.add(e1); 
        catalogo.add(e2);
        catalogo.add(d1); 
        catalogo.add(d2); 
        catalogo.add(dm1); 
        catalogo.add(dm2);
        catalogo.add(e3); 
        catalogo.add(s3);

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                \n-------- MENÚ -------------
                1. Listar equipos con sus características
                2. Buscar un equipo por ID o nombre
                3. Ordenar catálogo por consumo eléctrico
                4. Salir
                --------------------------
                """);
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    for (Sistemas s : catalogo) {
                        System.out.println(s.toString());
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el ID o nombre del equipo: ");
                    String entrada = sc.nextLine();
                    System.out.println(Busqueda.buscar(catalogo, entrada));
                    break;
                case 3:
                    System.out.println(Ordenar.ordenarPorConsumo(catalogo));
                    break;
                case 4:
                    System.out.println("Salió del sistema");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 4);

        sc.close();
    }
}
