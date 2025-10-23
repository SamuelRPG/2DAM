package mv3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Vista {

	private JFrame frame;
	private String fichero = "fichero.txt";
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
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
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 722, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnGenerarTablas = new JButton("GENERAR TABLAS");
		btnGenerarTablas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GenerarTablas();
				textArea.setText(LeerFichero());
				
			}
		});
		btnGenerarTablas.setBounds(272, 25, 162, 23);
		frame.getContentPane().add(btnGenerarTablas);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(121, 79, 477, 254);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setRowHeaderView(textArea);
	}
	
	private String LeerFichero() {
		String s="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			String linea;
			while ((linea = br.readLine()) != null) {
				s+=linea + "\n";
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
		
	}
	
	private void GenerarTablas() {
		
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
				bw.write("Tabla del 9");
				for (int i=1; i <= 10; i++) {
					for (int j=1; j <= 10; j++) {
						bw.write("Resultado de "+i+ " x " + j + ": " + (i*j) + "\n");
					}
				}
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
}
