package FacylyLocation.DAO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

import FacilyLocation.Persona;

public class PersonaDao {

	public static Persona [] personasFromJson () {
		
		Persona [] personas = new Persona [7];
		
		try {
			BufferedReader br = new BufferedReader (new FileReader("personas.json"));
			Gson gson = new Gson();
			personas = gson.fromJson(br, Persona[].class);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return personas;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		Persona[] p = personasFromJson();
//		
//		for (Persona persona : p) {
//			persona.toString();
//		}
	}
}
