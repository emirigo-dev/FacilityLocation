package FacylyLocation.DAO;

import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import FacilyLocation.CentroDistribucion;

public class CentroDistribucionDao {

	
public static ArrayList <CentroDistribucion> centrosFromJson () {
		
		ArrayList <CentroDistribucion> centros = new ArrayList <CentroDistribucion>();
		
		JsonParser parser = new JsonParser();
		FileReader fr;
		
		try {
			fr = new FileReader ("centros.json");
			JsonArray array = parser.parse(fr).getAsJsonArray();
			
			Integer number;
			double latitude;
			double longitude;
			
			for (JsonElement jsonElement : array) {
				JsonObject obj = jsonElement.getAsJsonObject();
				
				number = obj.get("numero").getAsInt();
				latitude = obj.get("latitud").getAsDouble();
				longitude = obj.get("longitud").getAsDouble();
				
				CentroDistribucion centro = new CentroDistribucion (number, latitude, longitude);
				centros.add(centro);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return centros;
	}

}
