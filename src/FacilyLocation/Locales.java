package FacilyLocation;

import java.util.ArrayList;

public class Locales implements Comparable<Locales>{
	
	private int _numero;
	private double _latitud;
	private double _longitud;
	private ArrayList<Persona> _clientes;
	private double _costoTotal;
	
	public Locales(int numero, double latitud, double longitud)
	{
		_numero = numero;
		_latitud = latitud;
		_longitud = longitud;
		_clientes = new ArrayList<Persona>();
		_costoTotal = 0;
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


	public double getCostoTotal() {
		return _costoTotal;
	}


	public void agregarClientes(Persona cliente) {
		_clientes.add(cliente);
	}
		
	public void setCostoTotal(double costoTotal) {
		this._costoTotal = costoTotal;
	}


	@Override
	public int compareTo(Locales otro) {
		return (int) (this.getCostoTotal() - otro.getCostoTotal());
	}
	

}
