package FacilyLocation;

public class Persona {

	private String _nombre;
	private double _latitud;
	private double _longitud;
	
	public Persona(String nombre, double latitud, double longitud)
	{
		_nombre = nombre;
		_latitud = latitud;
		_longitud = longitud;
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

}
