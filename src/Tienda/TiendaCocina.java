package Tienda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

public class TiendaCocina {
	
	
	

	private JFrame frmTienda;
	JMenuBar menuBar = new JMenuBar();
	JPanel panel_1 = new JPanel();
	

	
	// Datos mínimos de la primera cocina
	public static String modelo0 = "Mabe EMP6120PG0";
	public static double precio0 = 949.0;
	
	public static double fondo0 = 58.6;
	public static double ancho0 = 60.0;
	public static double alto0 = 91.0;
	public static int quemadores0 = 4;
	// Datos mínimos de la segunda cocina
	public static String modelo1 = "Indurama Parma";
	public static double precio1 = 1089.0;
	public static double ancho1 = 80.0;
	public static double alto1 = 94.0;
	public static double fondo1 = 67.5;
	public static int quemadores1 = 6;
	// Datos mínimos de la tercera cocina
	public static String modelo2 = "Sole COSOL027";
	public static double precio2 = 850.0;
	public static double ancho2 = 60.0;
	public static double alto2 = 90.0;
	public static double fondo2 = 50.0;
	public static int quemadores2 = 4;
	// Datos mínimos de la cuarta cocina
	public static String modelo3 = "Coldex CX602";
	public static double precio3 = 629.0;
	public static double ancho3 = 61.6;
	public static double alto3 = 95.0;
	public static double fondo3 = 51.5;
	public static int quemadores3 = 5;
	// Datos mínimos de la quinta cocina
	public static String modelo4 = "Reco Dakota";
	public static double precio4 = 849.0;
	public static double ancho4 = 75.4;
	public static double alto4 = 94.5;
	public static double fondo4 = 66.0;
	public static int quemadores4 = 5;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	// Cantidad óptima de unidades vendidas
	public static int cantidadOptima = 30;
	// Cuota diaria
	public static double cuotaDiaria = 75000;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TiendaCocina window = new TiendaCocina();
					window.frmTienda.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TiendaCocina() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTienda = new JFrame();
		frmTienda.setTitle("Tienda 1.0");
		frmTienda.setBounds(100, 100, 450, 300);
		frmTienda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenu archivo = new JMenu("Archivo");
		JMenu mantenimiento = new JMenu("Mantenimiento");
		JMenu ventas = new JMenu("Ventas");
		JMenu configuracion = new JMenu("Configuración");
		JMenu ayuda = new JMenu("Ayuda");

		// Crear las subopciones del menú "Archivo"
		JMenuItem salir = new JMenuItem("Salir");
		archivo.add(salir);

		// Crear las subopciones del menú "Mantenimiento"
		JMenuItem consultarCocina = new JMenuItem("Consultar cocina");
		JMenuItem modificarCocina = new JMenuItem("Modificar cocina");
		JMenuItem listarCocinas = new JMenuItem("Listar cocinas");
		mantenimiento.add(consultarCocina);
		mantenimiento.add(modificarCocina);
		mantenimiento.add(listarCocinas);
			

		// Crear las subopciones del menú "Ventas"
		JMenuItem vender = new JMenuItem("Vender");
		JMenuItem generarReportes = new JMenuItem("Generar reportes");
		ventas.add(vender);
		ventas.add(generarReportes);

		// Crear las subopciones del menú "Configuración"
		JMenuItem configurarDescuentos = new JMenuItem("Configurar descuentos");
		JMenuItem configurarObsequios = new JMenuItem("Configurar obsequios");
		JMenuItem configurarCantidadOptima = new JMenuItem("Configurar cantidad óptima");
		JMenuItem configurarCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		configuracion.add(configurarDescuentos);
		configuracion.add(configurarObsequios);
		configuracion.add(configurarCantidadOptima);
		configuracion.add(configurarCuotaDiaria);

		// Crear las subopciones del menú "Ayuda"
		JMenuItem acercaDeTienda = new JMenuItem("Acerca de Tienda");
		ayuda.add(acercaDeTienda);

		// Agregar los menús principales al menúBar
		menuBar.add(archivo);
		menuBar.add(mantenimiento);
		menuBar.add(ventas);
		menuBar.add(configuracion);
		menuBar.add(ayuda);

		// Agregar el menúBar al JFrame
		frmTienda.setJMenuBar(menuBar);
		frmTienda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTienda.setSize(800, 500);
		frmTienda.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel.setIcon(new ImageIcon("D:\\All-Works\\eclipse-workspace\\Test\\src\\img\\9a1bafbc6555e1b2cf89e1705876518d.jpg"));
		lblNewLabel.setBounds(140, 0, 513, 439);
		frmTienda.getContentPane().add(lblNewLabel);
		frmTienda.setVisible(true);
		

	}
	
	

}
