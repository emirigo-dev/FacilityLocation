package FacilyLocation;


public class Locales {
	
	private int _numero;
	private double _latitud;
	private double _longitud;
	
	public Locales(int numero, double latitud, double longitud)
	{
		_numero = numero;
		_latitud = latitud;
		_longitud = longitud;
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
	

}
