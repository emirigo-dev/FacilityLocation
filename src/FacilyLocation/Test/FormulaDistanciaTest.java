package FacilyLocation.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import FacilyLocation.CentroDistribucion;
import FacilyLocation.FormulaDistancia;

class FormulaDistanciaTest {

	@Test
	void distanceUngsMunMA() {
		CentroDistribucion UNGS = new CentroDistribucion (1,-34.5211588714962, -58.70075482096675);
		CentroDistribucion munMA = new CentroDistribucion (2,-34.49777838279985, -58.70136173570425);
		
		double distance = FormulaDistancia.distFrom(UNGS.get_latitud(),UNGS.get_longitud(),munMA.get_latitud(),munMA.get_longitud());
		double diference = 2.6 - distance;
		
		assertTrue (diference > -0.1 && diference < 0.1);
	}
	
	@Test
	void distanceUngsCasaRosada() {
		CentroDistribucion UNGS = new CentroDistribucion (1,-34.5211588714962, -58.70075482096675);
		CentroDistribucion casaRosada = new CentroDistribucion (2,-34.60783481920125, -58.3702456161329);
		
		double distance = FormulaDistancia.distFrom(UNGS.get_latitud(),UNGS.get_longitud(),casaRosada.get_latitud(),casaRosada.get_longitud());
		double diference = 31.74 - distance;
		
		assertTrue (diference > -0.1 && diference < 0.1);
	}
	
	@Test
	void distanceCasaRosadaChicago() {
		CentroDistribucion casaRosada = new CentroDistribucion (2,-34.60783481920125, -58.3702456161329);
		CentroDistribucion chicago = new CentroDistribucion (1,41.88012882620769, -87.63594677582024);
		
		double distance = FormulaDistancia.distFrom(casaRosada.get_latitud(),casaRosada.get_longitud(),chicago.get_latitud(),chicago.get_longitud());
		double diference = 9013.25 - distance;
		
		System.out.println(distance);
		assertTrue (diference > -0.1 && diference < 0.1);
	}

}
