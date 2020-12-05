package FacilyLocation.DAO;

import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import FacilyLocation.Logic.Locales;

public class LocalesDao {

	
public static ArrayList <Locales> centrosFromJson () {
		
		ArrayList <Locales> centros = new ArrayList <Locales>();
		
		JsonParser parser = new JsonParser();
		FileReader fr;
		
		try {
			fr = new FileReader ("centros.json");
			JsonArray array = parser.parse(fr).getAsJsonArray();
			
			String nombre;
			double latitude;
			double longitude;
			
			for (JsonElement jsonElement : array) {
				JsonObject obj = jsonElement.getAsJsonObject();
				
				nombre = obj.get("nombre").getAsString();
				latitude = obj.get("latitud").getAsDouble();
				longitude = obj.get("longitud").getAsDouble();
				
				Locales centro = new Locales (nombre, latitude, longitude);
				centros.add(centro);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return centros;
	}

}
