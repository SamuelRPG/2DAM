package mvc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	JButton boto;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Vista frame = new Vista();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		boto = new JButton("Missatge");
		boto.setBounds(163, 68, 85, 21);
		contentPane.add(boto);
		
		textField = new JTextField();
		textField.setBounds(115, 128, 207, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		this.setVisible(true);
	}
	
	JButton getBoto() {
		return boto;
	}
	
	JTextField getTextField() {
		return textField;
	}

	public void posarText(String missatge) {
		textField.setText(missatge);
		
	}
	
}
