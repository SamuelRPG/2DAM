package miniproyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Controlador {
	Modelo modelo;
	Vista vista;
	ActionListener actionlistenerBtnBuscar, actionlistenerBtnReemplazar;
	
	public Controlador(Modelo m, Vista v) {
		modelo = m;
		vista = v;
		iniciar();
	}
	
	public void iniciar() {
		String f1 = modelo.getf();
		String f2 = modelo.getfSalida();
		vista.getTextAreaInput().setText(modelo.LeerFichero(f1));
		
		vista.getBtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p = vista.getTextFieldBuscar().getText();
				Integer salida = modelo.BuscarCoincidencias(p);
				JOptionPane.showMessageDialog(
			            null, // el componente padre (puede ser null o vista)
			            "La palabra \"" + p + "\" se encontró " + salida + " veces.",
			            "Resultado de la búsqueda",
			            JOptionPane.INFORMATION_MESSAGE
			        );
			}
		});
		vista.getBtnReemplazar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String p1 = vista.getTextFieldBuscar().getText();
				String p2 = vista.getTextFieldReemplazar().getText();
				modelo.Reemplazar(p1, p2);
				String contenido = modelo.LeerFichero(f2);
				vista.getTextAreaChanges().setText(contenido);
			}
		});
	}
	
	
	
}
