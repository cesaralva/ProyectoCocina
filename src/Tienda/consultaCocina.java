package Tienda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class consultaCocina {

	private JFrame frame;
	private JLabel lblTitulo;
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultaCocina window = new consultaCocina();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the application.
	 */
	public consultaCocina() {
		initialize();
		
		frame.setTitle("Consulta de cocina");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        JLabel lblTitulo = new JLabel("Consulta de cocina");
        JTextArea txtResultado = new JTextArea();
        JButton  btnConsultar = new JButton("Consultar");        
        frame.add(lblTitulo, BorderLayout.NORTH);
        frame.add(new JScrollPane(txtResultado), BorderLayout.CENTER);
        frame.add(btnConsultar, BorderLayout.SOUTH);
	}

	
		// TODO Auto-generated method stub
		
	



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	


}
