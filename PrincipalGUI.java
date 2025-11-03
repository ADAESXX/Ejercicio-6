//autor:Allyson Dulce Abigail Escobar Sandoval
//ayuda: chat gpt para poder ordenar mejor la parte grafica
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PrincipalGUI {

	private JFrame frame;
	private JTextArea textArea;
	private ArrayList<Sistemas> catalogo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalGUI window = new PrincipalGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PrincipalGUI() {
		initialize();
		cargarDatos();
	}
//parte grafica :)
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Sistema de Monitoreo Agrícola");
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnListar = new JButton("Listar equipos");
		btnListar.setBounds(20, 20, 160, 25);
		frame.getContentPane().add(btnListar);

		JButton btnBuscar = new JButton("Buscar equipo");
		btnBuscar.setBounds(210, 20, 160, 25);
		frame.getContentPane().add(btnBuscar);

		JButton btnOrdenar = new JButton("Ordenar por consumo");
		btnOrdenar.setBounds(400, 20, 170, 25);
		frame.getContentPane().add(btnOrdenar);

		textArea = new JTextArea();
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(20, 60, 550, 280);
		frame.getContentPane().add(scrollPane);

		//listeners
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				for (Sistemas s : catalogo) {
					sb.append(s.toString()).append("\n");
				}
				textArea.setText(sb.toString());
			}
		});

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dato = JOptionPane.showInputDialog(frame, "Ingrese el ID o nombre del equipo:");
				if (dato != null && !dato.isEmpty()) {
					textArea.setText(Busqueda.buscar(catalogo, dato));
				}
			}
		});

		btnOrdenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(Ordenar.ordenarPorConsumo(catalogo));
			}
		});
	}

	private void cargarDatos() {
		catalogo = new ArrayList<>();

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

		catalogo.add(s1); catalogo.add(s2); catalogo.add(e1); catalogo.add(e2);
		catalogo.add(d1); catalogo.add(d2); catalogo.add(dm1); catalogo.add(dm2);
		catalogo.add(e3); catalogo.add(s3);
	}
}

