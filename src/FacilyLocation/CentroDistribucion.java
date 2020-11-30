package FacilyLocation;

import java.util.ArrayList;

public class CentroDistribucion {
	
	private int _numero;
	private double _latitud;
	private double _longitud;
	private ArrayList<Persona> _clientes;
	
	public CentroDistribucion(int numero, double latitud, double longitud)
	{
		_numero = numero;
		_latitud = latitud;
		_longitud = longitud;
		_clientes = new ArrayList<Persona>();
	}
	
		
	public double get_longitud() {
		return _longitud;
	}

	public double get_latitud() {
		return _latitud;
	}

	public int get_nombre() {
		return _numero;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Persona> getClientes()
	{
		return (ArrayList<Persona>) _clientes.clone();
	}


}
