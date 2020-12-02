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
	
	public double get_longitud() {
		return _longitud;
	}

	public double get_latitud() {
		return _latitud;
	}

	public String get_nombre() {
		return _nombre;
	}
	
	@Override
	public String toString () {
		return (this._nombre + "  " + this._longitud + "  " + this._latitud);
	}

}
