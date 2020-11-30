package FacilyLocation;

import java.text.DecimalFormat;


public class ComparadorDistancia {
	
	public static double total(double lat1, double lon1, double lat2, double lon2) {
		final int R = 6371; // Radious of the eart
		 Double latDistance = toRad(lat2-lat1);
		 Double lonDistance = toRad(lon2-lon1);
		 Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + 
		 Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) * 
		 Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		 Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		 Double distance = R * c;
		 return distance;
	}
	private static Double toRad(Double value) {
		 return value * Math.PI / 180;
		 }

	  	
	public static void main(String[] args) {
		
		System.out.println(total(-34.49826314536168,-58.7009993753278,-34.521956602567435,-58.701066465237886));
		
	}
	}


