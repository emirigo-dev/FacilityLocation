package FacilyLocation;

import java.util.ArrayList;
import java.util.Collections;

public class Solver {
	private Instancia _instancia;
	
	public Solver(Instancia instancia) {
		_instancia = instancia;
	}

	private void calcularCostoTotal() {
		for (Locales local : _instancia.getCentroDistribucion()) {
			double distanciaTotal = 0;
			for (Persona cliente : _instancia.getClientes()) {
				distanciaTotal += FormulaDistancia.distFrom(local.getLatitud(), local.getLongitud(), cliente.getLatitud(), cliente.getLongitud());
			}
			local.setCostoTotal(distanciaTotal);
		}
		
	}
	
	public Solucion resolver(int cantidadApertura) {
		Solucion ret = new Solucion();
		int contador = 0;
		calcularCostoTotal();
		while(contador<cantidadApertura) {
			ret.agregar(localesOrdenados().get(contador));
			contador ++;
			}
		return ret;
		}
	
	
	
	private ArrayList<Locales> localesOrdenados (){
		ArrayList<Locales> ret = _instancia.getCentroDistribucion();
		Collections.sort(ret);
		return ret;
	}
	
	public Instancia get_instancia() {
		return _instancia;
	}

}
