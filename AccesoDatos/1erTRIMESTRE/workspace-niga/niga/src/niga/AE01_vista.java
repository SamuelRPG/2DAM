package niga;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class AE01_vista {

	JFrame frmSincronitzadorDeFitxers;
	JTextField textFieldDir1, textFieldDir2;
	JTextArea textArea1, textArea2;
	File ficheroDir1 = new File("dir1.txt");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AE01_vista window = new AE01_vista();
					window.frmSincronitzadorDeFitxers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AE01_vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSincronitzadorDeFitxers = new JFrame();
		frmSincronitzadorDeFitxers.setTitle("Sincronitzador de fitxers");
		frmSincronitzadorDeFitxers.setBounds(100, 100, 872, 503);
		frmSincronitzadorDeFitxers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSincronitzadorDeFitxers.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Directori 1 (local)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(29, 28, 146, 15);
		frmSincronitzadorDeFitxers.getContentPane().add(lblNewLabel);

		JLabel lblDirectoriDestinaci = new JLabel("Directori 2 (remot)");
		lblDirectoriDestinaci.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDirectoriDestinaci.setBounds(500, 28, 146, 15);
		frmSincronitzadorDeFitxers.getContentPane().add(lblDirectoriDestinaci);

		textFieldDir1 = new JTextField();
		textFieldDir1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldDir1.setBounds(29, 53, 318, 18);
		frmSincronitzadorDeFitxers.getContentPane().add(textFieldDir1);
		textFieldDir1.setColumns(10);

		textFieldDir2 = new JTextField();
		textFieldDir2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldDir2.setColumns(10);
		textFieldDir2.setBounds(500, 54, 341, 18);
		frmSincronitzadorDeFitxers.getContentPane().add(textFieldDir2);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 119, 318, 328);
		frmSincronitzadorDeFitxers.getContentPane().add(scrollPane);

		textArea1 = new JTextArea();
		scrollPane.setViewportView(textArea1);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(500, 119, 341, 328);
		frmSincronitzadorDeFitxers.getContentPane().add(scrollPane_1);

		textArea2 = new JTextArea();
		scrollPane_1.setViewportView(textArea2);

		
		
		//action listeners de los botones 
		JButton btnExplorar2 = new JButton("Explorar");
		btnExplorar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea2.setText(MostrarElementos2());
			}
		});
		btnExplorar2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExplorar2.setBounds(757, 71, 84, 20);
		frmSincronitzadorDeFitxers.getContentPane().add(btnExplorar2);
		
		JButton btnExplorar1 = new JButton("Explorar");
		btnExplorar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea1.setText(MostrarElementos());
			}
		});
		btnExplorar1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExplorar1.setBounds(263, 71, 84, 20);
		frmSincronitzadorDeFitxers.getContentPane().add(btnExplorar1);
		
		
		JButton btnPush = new JButton("Pujar (push) >>>");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CopiarElementos();
			}
		});
		btnPush.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPush.setBounds(357, 228, 133, 20);
		frmSincronitzadorDeFitxers.getContentPane().add(btnPush);

		JButton btnPull = new JButton("<<< Baixar (pull)");
		btnPull.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CopiarElementos2();
			}
		});
		btnPull.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPull.setBounds(357, 279, 133, 20);
		frmSincronitzadorDeFitxers.getContentPane().add(btnPull);
	}
	
	
	
	/** Este metodo lee un fichero 
	 * @param f Parámetro que recibe el metodo. Es aquel fichero que se leerá.
	 * @return retorna en formato String el contenido leido
	 */
	public String LeerFichero(File f) {
		String contenido="";
		try (BufferedReader br=new BufferedReader(new FileReader(f))) { 
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
	
	/**Este método copia todos los elementos del directorio 1 al 2 (push)
	 * No retorna nada ya que solo copia el contenido.
	 */
	public void CopiarElementos() {
		//me da error el metodo pero si que copia los elementos excepto directorios
		File f = new File(textFieldDir1.getText());
		if (!f.isDirectory()) {
			JOptionPane.showMessageDialog(null, "El elemento especificado no es un directorio o no existe", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			String [] elementosDirectorio = f.list();
			File directorioRemoto = new File(textFieldDir2.getText());
			int numFicheros = 0;
			Double bytesTotales = (double) 0;
			for (String el : elementosDirectorio) {
				try {
					File elemento = new File(el);
					if (elemento.isDirectory()) {
						JOptionPane.showMessageDialog(null, "El elemento especificado no es un directorio o no existe", null, JOptionPane.INFORMATION_MESSAGE);
					} else {
						Double size = (double) elemento.length();
						String contenidoFichero = LeerFichero(elemento);
						File fCreado = new File(directorioRemoto, elemento.getName());
						fCreado.createNewFile();
						BufferedWriter bw = new BufferedWriter(new FileWriter(fCreado));
						bw.write(contenidoFichero);
						bw.close();
						numFicheros++;
						bytesTotales+=size;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			JOptionPane.showMessageDialog(null, "Se han transferido " + numFicheros + " ficheros y han sido "+ bytesTotales + " bytes en total.", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	/**Este metodo copia todos los elementos del directorio 2 al 1 (pull)
	 *  No retorna nada ya que solo copia el contenido.
	 */
	public void CopiarElementos2() {
		File f = new File(textFieldDir2.getText());
		if (!f.isDirectory()) {
			JOptionPane.showMessageDialog(null, "El elemento especificado no es un directorio o no existe", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			String [] elementosDirectorio = f.list();
			File directorioRemoto = new File(textFieldDir1.getText());
			int numFicheros = 0;
			Double bytesTotales = (double) 0;
			for (String el : elementosDirectorio) {
				try {
					File elemento = new File(el);
					if (elemento.isDirectory()) {
						JOptionPane.showMessageDialog(null, "El elemento especificado no es un directorio o no existe", null, JOptionPane.INFORMATION_MESSAGE);
					} else {
						Double size = (double) elemento.length();
						String contenidoFichero = LeerFichero(elemento);
						File fCreado = new File(directorioRemoto, elemento.getName());
						fCreado.createNewFile();
						BufferedWriter bw = new BufferedWriter(new FileWriter(fCreado));
						bw.write(contenidoFichero);
						bw.close();
						numFicheros++;
						bytesTotales+=size;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			JOptionPane.showMessageDialog(null, "Se han transferido " + numFicheros + " ficheros y han sido "+ bytesTotales + " bytes en total.", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	/** Este metodo muestra los elementos que se encuentran dentro del directorio 1 (local)
	 * junto a su tamaño en bytes, kilobytes o megabytes y su fecha de ultima modificación
	 * así como sus subdirectorios en formato "\nombreSubdirectorio"
	 * @return String de toda la información de todos los elementos de un directorio
	 */
	public String MostrarElementos() {
			File f = new File(textFieldDir1.getText());
		StringBuilder sb = new StringBuilder();
		if (!f.isDirectory() || !f.exists()) {
			JOptionPane.showMessageDialog(null, "El elemento especificado no es un directorio o no existe", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
				SimpleDateFormat fecha = new SimpleDateFormat("DD/MM-hh:mm:ss");
				String[] elementosDirectorio = f.list();
				for (String elem : elementosDirectorio) {
					File elemento = new File(elem);
					if (elemento.isDirectory()) {
						sb.append("\"" + elemento);
					} else {
						if (elemento.getName().length() > 15) {
							sb.append(elemento.getName().toString().substring(0, 15)+"(...)" + " | ");
						} else {
							sb.append(elemento.getName() + " | ");
						}
						
						
						if (elemento.length() < 1000) {
							sb.append(elemento.length()+ "B | ");
						} else if (elemento.length() >= 1000 && elemento.length() <=99999) {
							Double cantidadKB = (double) elemento.length();
							sb.append((cantidadKB / 1024) + " | "); 
						} else {
							Double cantidadMB = (double) elemento.length();
							sb.append((cantidadMB / 2048) + " | ");
						}
						sb.append(fecha.format(elemento.lastModified()) + "\n");
					}
				}
			
		}
		return sb.toString();
	}
	
	/** Este metodo muestra los elementos que se encuentran dentro del directorio 1 (local)
	 * junto a su tamaño en bytes, kilobytes o megabytes y su fecha de ultima modificación
	 * así como sus subdirectorios en formato "\nombreSubdirectorio"
	 * @return String de toda la información de todos los elementos del directorio
	 */
	public String MostrarElementos2() {
		File f = new File(textFieldDir2.getText());
	StringBuilder sb = new StringBuilder();
	if (!f.isDirectory() || !f.exists()) {
		JOptionPane.showMessageDialog(null, "El elemento especificado no es un directorio o no existe", null, JOptionPane.INFORMATION_MESSAGE);
	} else {
			SimpleDateFormat fecha = new SimpleDateFormat("DD/MM-hh:mm:ss");
			String[] elementosDirectorio = f.list();
			for (String elem : elementosDirectorio) {
				File elemento = new File(elem);
				if (elemento.isDirectory()) {
					sb.append("\"" + elemento);
				} else {
					if (elemento.getName().length() > 15) {
						sb.append(elemento.getName().toString().substring(0, 15)+"(...)" + " | ");
					} else {
						sb.append(elemento.getName() + " | ");
					}
					
					
					if (elemento.length() < 1000) {
						sb.append(elemento.length()+ "B | ");
					} else if (elemento.length() >= 1000 && elemento.length() <=99999) {
						Double cantidadKB = (double) elemento.length();
						sb.append((cantidadKB / 1024) + " | "); 
					} else {
						Double cantidadMB = (double) elemento.length();
						sb.append((cantidadMB / 2048) + " | ");
					}
					sb.append(fecha.format(elemento.lastModified()) + "\n");
				}
			}
	}
	return sb.toString();
}

}
