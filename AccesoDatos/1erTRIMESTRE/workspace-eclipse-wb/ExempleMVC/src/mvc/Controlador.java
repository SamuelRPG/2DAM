package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

	Model m;
	Vista v;
	ActionListener actionListenerBoto;
	
	Controlador(Model m, Vista v) {
		this.m = m;
		this.v = v;
		control();
	}
	
	void control() {
		
		actionListenerBoto = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String missatge = m.getMsg();
				//v.getTextField().setText(missatge);
				v.posarText(missatge);
			}	
		};
		v.getBoto().addActionListener(actionListenerBoto);
	}
	
	
}
