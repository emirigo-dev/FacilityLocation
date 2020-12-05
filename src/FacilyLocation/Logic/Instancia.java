package FacilyLocation.Logic;

import java.util.ArrayList;

public class Instancia {

	private ArrayList<Locales> _locales;
	private int _cantidadApertura;
	private ArrayList<Persona> _clientes;

	public Instancia() {

		_locales = new ArrayList<Locales>();
		_clientes = new ArrayList <Persona>();
	}

	public void agregarCliente(Persona cliente) {
		_clientes.add(cliente);
	}
	
	public void agregarClientes (ArrayList <Persona> clientes) {
		for (Persona persona : clientes) {
			_clientes.add(persona);
		}
	}

	public void agregarLocal(Locales local) {
		_locales.add(local);
	}
	
	public void agregarLocales (ArrayList <Locales> locales) {
		for (Locales local : locales) {
			_locales.add(local);
		}
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
	
	public void setCantidadApertura (int x) {
		if (x < 1 )
			throw new IllegalArgumentException("Debe seleccionar una cantidad de locales");
		
		if (x > _locales.size())
			throw new IllegalArgumentException("No se puede abrir mas locales que la cantidad de depositos disponibles");
		
		this._cantidadApertura = x;
	}
}
