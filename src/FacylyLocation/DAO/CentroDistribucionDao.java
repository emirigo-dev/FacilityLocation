package FacylyLocation.DAO;

import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;

import FacilyLocation.CentroDistribucion;

public class CentroDistribucionDao {

	
	public static CentroDistribucion[] centrosFromJson (){
	
		CentroDistribucion [] centros = new CentroDistribucion [50];
		
		Gson gson = new Gson();
		try {
			BufferedReader br = new BufferedReader (new FileReader ("asd"));
			centros = gson.fromJson(br, CentroDistribucion[].class);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return centros;
	}
	
	public static void main(String[] args) {
		CentroDistribucion[] p = centrosFromJson();
		
		for (CentroDistribucion  centro : p) {
			centro.toString();
		}
	}
}
