package es.florida.ae01;

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

public class App {

	JFrame frmSincronitzadorDeFitxers;
	JTextField textFieldDir1, textFieldDir2;
	JTextArea textArea1, textArea2;
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy-hh:mm:ss");
	ArrayList<String> llistaFitxers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
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

		JButton btnExplorar1 = new JButton("Explorar");
		btnExplorar1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExplorar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectorDir(1);
			}
		});
		btnExplorar1.setBounds(263, 71, 84, 20);
		frmSincronitzadorDeFitxers.getContentPane().add(btnExplorar1);

		JButton btnExplorar2 = new JButton("Explorar");
		btnExplorar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectorDir(2);
			}
		});
		btnExplorar2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExplorar2.setBounds(757, 71, 84, 20);
		frmSincronitzadorDeFitxers.getContentPane().add(btnExplorar2);

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

		JButton btnPush = new JButton("Pujar (push) >>>");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				transferir(1, 2);
			}
		});
		btnPush.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPush.setBounds(357, 228, 133, 20);
		frmSincronitzadorDeFitxers.getContentPane().add(btnPush);

		JButton btnPull = new JButton("<<< Baixar (pull)");
		btnPull.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				transferir(2, 1);
			}
		});
		btnPull.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPull.setBounds(357, 279, 133, 20);
		frmSincronitzadorDeFitxers.getContentPane().add(btnPull);
	}

	/**
	 * Mètode per seleccionar un directori mitjançant finestra de selecció
	 * 
	 * @param seleccio Enter que indica el directori a seleccionar {1: directori1,
	 *                 2: directori2}
	 */
	public void selectorDir(int seleccio) {
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new java.io.File("."));
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int returnVal = fc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File folder = fc.getSelectedFile();
			if (seleccio == 1) {
				textFieldDir1.setText(folder.getAbsolutePath());
				String contingut = listFiles(folder.getAbsolutePath());
				textArea1.setText(contingut);
			} else {
				textFieldDir2.setText(folder.getAbsolutePath());
				String contingut = listFiles(folder.getAbsolutePath());
				textArea2.setText(contingut);
			}
		}
	}

	/**
	 * Metode que proporciona un String amb una llista dels fitxers i subdirectoris
	 * del directori passat com a parametre
	 * 
	 * @param workDir Directori de treball
	 * @return String amb la llista de fixters i subdirectoris
	 */
	public String listFiles(String workDir) {
		File folder = new File(workDir);
		String[] contents = folder.list();
		StringBuilder contingut = new StringBuilder();
		for (int i = 0; i < contents.length; i++) {
			File item = new File(workDir + File.separator + contents[i]);
			long grandaria = item.length();
			String strGrandaria = grandaria + " B | ";
			if ((grandaria >= 1000) && (grandaria < 1000000)) {
				grandaria = grandaria / 1024;
				strGrandaria = grandaria + " KB | ";
			} else if (grandaria > 1000000) {
				grandaria = grandaria / 1024 / 1024;
				strGrandaria = grandaria + " MB | ";
			}
			String data = dateFormat.format(item.lastModified());
			if (item.isDirectory()) {
				contingut.append("\\" + contents[i] + "\n");
			} else {
				String nomFitxer = contents[i];
				String extensio = "";
				String[] partsNomFitxer = nomFitxer.split("\\.");
				if (partsNomFitxer.length > 1) {
					extensio = "." + partsNomFitxer[partsNomFitxer.length - 1];
				}
				if (contents[i].length() > 15) {
					nomFitxer = contents[i].substring(0, 15) + "(...)" + extensio;
				}
				contingut.append(nomFitxer + " | " + strGrandaria + data + "\n");
			}
		}
		return contingut.toString();
	}

	/**
	 * Mètode per transferir els fitxers d'un origen a una destinacio
	 * 
	 * @param origen     Enter amb l'origen {1: directori1, 2: directori2}
	 * @param destinacio Enter amb la destinació {1: directori1, 2: directori2}
	 */
	public void transferir(int origen, int destinacio) {
		int numTransferits = 0;
		long bytesTransferits = 0;
		File dirOrigen;
		llistaFitxers = new ArrayList<String>();
		if (origen == 1) {
			dirOrigen = new File(textFieldDir1.getText());
			preparaLlistaTransferir(dirOrigen);
		} else if (origen == 2) {
			dirOrigen = new File(textFieldDir2.getText());
			preparaLlistaTransferir(dirOrigen);
		}
		for (String s : llistaFitxers) {
			File fitxerOrigen = new File(s);
			String rutaDestinacio;
			if (origen == 1) {
				rutaDestinacio = s.replace(textFieldDir1.getText(), textFieldDir2.getText());
			} else {
				rutaDestinacio = s.replace(textFieldDir2.getText(), textFieldDir1.getText());
			}
			File fitxerDestinacio = new File(rutaDestinacio);
			if (fitxerDestinacio.exists()) {
				int seleccio = JOptionPane.showConfirmDialog(null,
						"El fitxer " + fitxerDestinacio.getAbsolutePath() + " ja existix. Sobreescriure?");
				if (seleccio > 0) {
					continue;
				}
			} else {
				File crearDirectori = fitxerDestinacio.getParentFile();
				crearDirectori.mkdirs();
			}
			try {
				FileReader fr = new FileReader(fitxerOrigen);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(fitxerDestinacio);
				BufferedWriter bw = new BufferedWriter(fw);
				String linea;
				while ((linea = br.readLine()) != null) {
					bw.write(linea + "\n");
				}
				bw.close();
				br.close();
				numTransferits++;
				bytesTransferits += fitxerOrigen.length();
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		JOptionPane.showMessageDialog(null,
				"S'han transferit " + numTransferits + " fitxers (" + bytesTransferits + " bytes)", "Info",
				JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Mètode auxiliar de tipus recursiu per generar la llista de fitxers a
	 * transferir
	 * 
	 * @param directori Directori a transferir
	 */
	public void preparaLlistaTransferir(File directori) {
		File[] contingutDir = directori.listFiles();
		for (int i = 0; i < contingutDir.length; i++) {
			if (contingutDir[i].isFile()) {
				llistaFitxers.add(contingutDir[i].getAbsolutePath());
			} else {
				preparaLlistaTransferir(contingutDir[i]);
			}
		}
	}

}
