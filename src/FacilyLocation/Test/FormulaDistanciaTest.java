package FacilyLocation.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import FacilyLocation.Logic.FormulaDistancia;
import FacilyLocation.Logic.Locales;

class FormulaDistanciaTest {

	@Test
	void distanciaUngsMunMA() {
		Locales UNGS = new Locales (1,-34.5211588714962, -58.70075482096675);
		Locales munMA = new Locales (2,-34.49777838279985, -58.70136173570425);
		
		double distance = FormulaDistancia.distFrom(UNGS.getLatitud(),UNGS.getLongitud(),munMA.getLatitud(),munMA.getLongitud());
		double diference = 2.6 - distance;
		
		assertTrue (diference > -0.1 && diference < 0.1);
	}
	
	@Test
	void distanciaUngsCasaRosada() {
		Locales UNGS = new Locales (1,-34.5211588714962, -58.70075482096675);
		Locales casaRosada = new Locales (2,-34.60783481920125, -58.3702456161329);
		
		double distance = FormulaDistancia.distFrom(UNGS.getLatitud(),UNGS.getLongitud(),casaRosada.getLatitud(),casaRosada.getLongitud());
		double diference = 31.74 - distance;
		
		assertTrue (diference > -0.1 && diference < 0.1);
	}
	
	@Test
	void distanciaCasaRosadaChicago() {
		Locales casaRosada = new Locales (2,-34.60783481920125, -58.3702456161329);
		Locales chicago = new Locales (1,41.88012882620769, -87.63594677582024);
		
		double distance = FormulaDistancia.distFrom(casaRosada.getLatitud(),casaRosada.getLongitud(),chicago.getLatitud(),chicago.getLongitud());
		double diference = 9013.25 - distance;
		
		assertTrue (diference > -0.1 && diference < 0.1);
	}
	
	@Test void mismaUbicacion () {
		Locales UNGS = new Locales (1,-34.5211588714962, -58.70075482096675);
		Locales UNGSCopy = new Locales (2,-34.5211588714962, -58.70075482096675);
		
		double distance = FormulaDistancia.distFrom(UNGS.getLatitud(),UNGS.getLongitud(),UNGSCopy.getLatitud(),UNGSCopy.getLongitud());
		assertTrue (distance == 0);
		
	}

}
