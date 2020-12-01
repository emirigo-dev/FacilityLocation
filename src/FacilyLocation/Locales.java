package FacilyLocation;

import java.util.ArrayList;

public class Locales implements Comparable<Locales>{
	
	private int _numero;
	private double _latitud;
	private double _longitud;
	private ArrayList<Persona> _clientes;
	private double _distancia;
	
	public Locales(int numero, double latitud, double longitud)
	{
		_numero = numero;
		_latitud = latitud;
		_longitud = longitud;
		_clientes = new ArrayList<Persona>();
		_distancia = 0;
	}
	
		
	public double getLongitud() {
		return _longitud;
	}

	public double getLatitud() {
		return _latitud;
	}

	public int getNumero() {
		return _numero;
	}


	public double getDistancia() {
		return _distancia;
	}


	public void agregarClientes(Persona cliente) {
		_clientes.add(cliente);
	}
		
	public void setDistancia(double _distancia) {
		this._distancia = _distancia;
	}


	@Override
	public int compareTo(Locales otro) {
		return (int) (this.getDistancia() - otro.getDistancia());
	}
	

}
