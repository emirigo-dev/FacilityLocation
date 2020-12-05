package FacilyLocation.Logic;

import java.util.ArrayList;

public class Locales implements Comparable<Locales>{
	
	private String _nombre;
	private double _latitud;
	private double _longitud;
	private ArrayList<Persona> _clientes;
	private double _costoTotal;
	
	public Locales(String nombre, double latitud, double longitud)
	{
		_nombre = nombre;
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

	public String getNombre() {
		return _nombre;
	}


	public double getCostoTotal() {
		return _costoTotal;
	}


	public void agregarCliente(Persona cliente) {
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
