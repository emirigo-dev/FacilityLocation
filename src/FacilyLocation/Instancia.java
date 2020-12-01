package FacilyLocation;

import java.util.ArrayList;

public class Instancia {

	private ArrayList<Locales> _locales;
	private ArrayList<Persona> _clientes;

	public Instancia() {
		_locales = new ArrayList<Locales>();
		_clientes = new ArrayList<Persona>();
	}

	public void agregarClientes(Persona cliente) {
		_clientes.add(cliente);
	}

	public void agregarLocal(Locales local) {
		_locales.add(local);
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Persona> getClientes() {
		return (ArrayList<Persona>) _clientes.clone();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Locales> getCentroDistribucion() {
		return (ArrayList<Locales>) _locales.clone();
	}
}
