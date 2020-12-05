package FacilyLocation.DAO;


import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import FacilyLocation.Logic.Persona;

public class PersonaDao {

	public static ArrayList <Persona> personasFromJson () {
		
		ArrayList <Persona> personas = new ArrayList <Persona>();
		
		JsonParser parser = new JsonParser();
		FileReader fr;
		
		try {
			fr = new FileReader ("personas.json");
			JsonArray array = parser.parse(fr).getAsJsonArray();
			
			String name;
			double latitude;
			double longitude;
			
			for (JsonElement jsonElement : array) {
				JsonObject obj = jsonElement.getAsJsonObject();
				
				name = obj.get("nombre").getAsString();
				latitude = obj.get("latitud").getAsDouble();
				longitude = obj.get("longitud").getAsDouble();
				
				Persona persona = new Persona (name, latitude, longitude);
				personas.add(persona);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return personas;
	}
}
