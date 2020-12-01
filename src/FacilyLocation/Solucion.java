package FacilyLocation;

import java.util.ArrayList;

public class Solucion {
	
	private ArrayList<Locales> _locales;

	public Solucion () {
		_locales = new ArrayList<Locales>();
	}
	
	public void agregar(Locales centro) {
		_locales.add(centro);
	}	
	
	public double distanciaTotal(ArrayList<Locales> locales, ArrayList<Persona> clientes){	
		FormulaDistancia.total(locales.ge, lon1, lat2, lon2)
	}
}
