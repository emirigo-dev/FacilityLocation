package FacilyLocation.Logic;

import java.util.ArrayList;

public class Solucion {
	
	private ArrayList<Locales> _locales;
	//private HashMap<Locales,ArrayList<Persona>> _localesUbicados;

	@SuppressWarnings("unchecked")
	public ArrayList<Locales> getLocales() {
		return (ArrayList<Locales>) _locales.clone();
	}

	

	public Solucion () {
		_locales = new ArrayList<Locales>();
		//_localesUbicados = new HashMap<Locales,ArrayList<Persona>>();
	}
	
	public void agregar(Locales centro) {
//		_localesUbicados.put(centro, new ArrayList<Persona>());
		_locales.add(centro);
	}
	
	
	
}
