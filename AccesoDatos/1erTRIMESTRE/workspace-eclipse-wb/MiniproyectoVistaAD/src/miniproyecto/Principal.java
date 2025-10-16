package miniproyecto;

public class Principal {
	public static void main(String[] args) {

		Modelo m = new Modelo();
		Vista v = new Vista();
		Controlador c = new Controlador(m, v);

	}
}
