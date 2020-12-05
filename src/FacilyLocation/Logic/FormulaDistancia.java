package FacilyLocation.Logic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FormulaDistancia {
	
	public static double distFrom(double lat1, double lon1, double lat2, double lon2) {
		final int R = 6371; // Radious of the eart
		 Double latDistance = toRad(lat2-lat1);
		 Double lonDistance = toRad(lon2-lon1);
		 Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + 
		 Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) * 
		 Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		 Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		 Double distance = R * c;
		 
		 //Limitacion de distancia a dos decimales. En caso de ser necesario
		 //Redondea para arriba
		 BigDecimal bd = new BigDecimal(distance).setScale(2, RoundingMode.UP);
		 return bd.doubleValue();
		 
	}
	
	
	private static Double toRad(Double value) {
		 return value * Math.PI / 180;
	}
}


