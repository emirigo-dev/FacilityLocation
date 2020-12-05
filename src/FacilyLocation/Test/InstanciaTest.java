package FacilyLocation.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import FacilyLocation.Logic.Instancia;
import FacilyLocation.Logic.Locales;
import FacilyLocation.Logic.Persona;

public class InstanciaTest {

	@Test
	public void agregarPersonas () {
		Instancia instancia = setUp();
		assertEquals (10, instancia.getClientes().size());
	}
	
	@Test
	public void agregarLocales() {
		Instancia instancia = setUp();
		assertEquals (10, instancia.getCentroDistribucion().size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void aperturaSinLocales () {
		Instancia instancia = setUp();
		instancia.setCantidadApertura(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void aperturaMasLocales () {
		Instancia instancia = setUp();
		instancia.setCantidadApertura(12);
	}
	
	private Instancia setUp(){
		ArrayList <Persona> personas = new ArrayList <Persona>();
		ArrayList <Locales> locales = new ArrayList <Locales>();
		for (int i = 0; i < 10; i++) {
			Locales local = new Locales (" "+ i, -34.5111300808166, -58.71008204208784);
			Persona persona = new Persona ("Nombre", -34.513576075644664, -58.68754071098584);
			
			locales.add(local);
			personas.add(persona);
			
		}
		Instancia instancia = new Instancia();
		instancia.agregarClientes(personas);
		instancia.agregarLocales(locales);
		
		return instancia;
	}

}
