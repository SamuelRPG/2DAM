package miniproyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Vista {

	private JFrame frame;
	private JTextField textFieldBuscar;
	private JTextField textFieldReemplazar;
	private JButton btnBuscar;
	private JButton btnReemplazar;

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
		frame.setBounds(100, 100, 733, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldBuscar = new JTextField();
		textFieldBuscar.setBounds(23, 185, 197, 20);
		frame.getContentPane().add(textFieldBuscar);
		textFieldBuscar.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(232, 184, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		textFieldReemplazar = new JTextField();
		textFieldReemplazar.setBounds(386, 185, 172, 20);
		frame.getContentPane().add(textFieldReemplazar);
		textFieldReemplazar.setColumns(10);
		
		btnReemplazar = new JButton("Reemplazar");
		btnReemplazar.setBounds(568, 184, 89, 23);
		frame.getContentPane().add(btnReemplazar);
		
		JTextArea textAreaInput = new JTextArea();
		textAreaInput.setBounds(23, 11, 684, 163);
		frame.getContentPane().add(textAreaInput);
		
		JTextArea textAreaChanges = new JTextArea();
		textAreaChanges.setBounds(23, 230, 684, 169);
		frame.getContentPane().add(textAreaChanges);
	}
	
	public JButton getBtnBuscar() {
		return btnBuscar;
	}
	public JButton getBtnReemplazar() {
		return btnReemplazar;
	}
	public JTextField getTextFieldBuscar() {
		return textFieldBuscar;
	}
	public JTextField getTextFieldReemplazar() {
		return textFieldReemplazar;
	}
}
