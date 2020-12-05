package FacilyLocation.Logic;

import java.util.ArrayList;

public class Instancia {

	private ArrayList<Locales> _locales;
	private int _cantidadApertura;
	private ArrayList<Persona> _clientes;

	public Instancia(int cantidadApertura) {
		_locales = new ArrayList<Locales>();
		_cantidadApertura = cantidadApertura;
	}

	public void agregarClientes(Persona cliente) {
		_clientes.add(cliente);
	}

	public void agregar(Locales local) {
		_locales.add(local);
	}

		
	public ArrayList<Persona> getClientes() {
		return _clientes;
	}


	@SuppressWarnings("unchecked")
	public ArrayList<Locales> getCentroDistribucion() {
		return (ArrayList<Locales>) _locales.clone();
	}

	public int getCantidadApertura() {
		return _cantidadApertura;
	}
}
