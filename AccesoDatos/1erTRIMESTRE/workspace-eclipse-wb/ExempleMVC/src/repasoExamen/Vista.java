package repasoExamen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Vista {

	private JFrame frame;
	private JTextField textFieldGenerar;
	private JTextField textFieldRenombrar;
	private JTextField textFieldEscribir;
	private JTextArea textAreaInfo;

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
		frame.setBounds(100, 100, 693, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldGenerar = new JTextField();
		textFieldGenerar.setBounds(50, 90, 157, 20);
		frame.getContentPane().add(textFieldGenerar);
		textFieldGenerar.setColumns(10);
		
		textFieldRenombrar = new JTextField();
		textFieldRenombrar.setBounds(50, 176, 157, 20);
		frame.getContentPane().add(textFieldRenombrar);
		textFieldRenombrar.setColumns(10);
		
		textFieldEscribir = new JTextField();
		textFieldEscribir.setBounds(50, 261, 157, 20);
		frame.getContentPane().add(textFieldEscribir);
		textFieldEscribir.setColumns(10);
		
		JButton btnGenerar = new JButton("generar fichero");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GenerarFichero();
				textAreaInfo.setText(LeerFichero());
			}
		});
		btnGenerar.setBounds(231, 89, 118, 23);
		frame.getContentPane().add(btnGenerar);
		
		JButton btnRenombrar = new JButton("renombrar fichero");
		btnRenombrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RenombrarFichero();
				textAreaInfo.setText(LeerFichero());
			}
		});
		btnRenombrar.setBounds(231, 175, 125, 23);
		frame.getContentPane().add(btnRenombrar);
		
		
		JButton btnEscribir = new JButton("escribir en fichero");
		btnEscribir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EscribirFichero();
				textAreaInfo.setText(LeerFichero());
			}
		});
		btnEscribir.setBounds(231, 260, 125, 23);
		frame.getContentPane().add(btnEscribir);

		
		JLabel lblNewLabel = new JLabel("Escribe \"info\" para añadir al fichero toda su información relativa");
		lblNewLabel.setBounds(50, 230, 330, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textAreaInfo = new JTextArea();
		textAreaInfo.setBounds(366, 54, 301, 244);
		frame.getContentPane().add(textAreaInfo);
	}
	
	public String LeerFichero() {
		String contenido="";
		try (BufferedReader br=new BufferedReader(new FileReader(textFieldGenerar.getText()))) { 
			String linea;
			while ((linea = br.readLine()) != null) {
				contenido+=linea+"\n";
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return contenido;
	}
	
	public void GenerarFichero() {
		String fichero = textFieldGenerar.getText();
		File f = new File(fichero);
		try {
			f.createNewFile();
			JOptionPane.showMessageDialog(null, "El fichero se creó con éxito", null, JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RenombrarFichero() {
		File nombreRenombrar= new File(textFieldRenombrar.getText());
		File nombreFichero = new File(textFieldGenerar.getText());
		try {
			nombreFichero.renameTo(nombreRenombrar);
			JOptionPane.showMessageDialog(null, "El fichero se creó con éxito", null, JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void EscribirFichero() {
		File f = new File (textFieldGenerar.getText());
		String txtEscrito = textFieldEscribir.getText();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
			if (f.exists()) {
				if (txtEscrito.equals("info")) {
					bw.write("Ruta del fichero: "+f.getAbsolutePath()+"\n");
					bw.write("Se puede leer: "+f.canRead()+"\n");
					bw.write("Se puede escribir: "+ f.canWrite()+"\n");
					bw.write("Se puede ejecutar: "+f.canExecute()+"\n");
				} else {
					bw.write(txtEscrito+"\n");
				}
			} else {
				JOptionPane.showMessageDialog(null, "El fichero no se encontró", null, JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
