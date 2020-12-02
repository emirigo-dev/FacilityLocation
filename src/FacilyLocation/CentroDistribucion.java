package FacilyLocation;

public class CentroDistribucion {
	
	private int _numero;
	private double _latitud;
	private double _longitud;

	
	public CentroDistribucion(int numero, double latitud, double longitud)
	{
		_numero = numero;
		_latitud = latitud;
		_longitud = longitud;
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

}
