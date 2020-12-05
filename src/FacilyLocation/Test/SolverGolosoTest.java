package FacilyLocation.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import FacilyLocation.DAO.LocalesDao;
import FacilyLocation.Logic.Instancia;
import FacilyLocation.Logic.Locales;
import FacilyLocation.Logic.Persona;
import FacilyLocation.Logic.Solucion;
import FacilyLocation.Logic.Solver;
import FacilyLocation.DAO.*;

public class SolverGolosoTest {

	private Instancia setUp() {
		Instancia instancia = new Instancia();
		ArrayList<Locales> locales = LocalesDao.centrosFromJson();
		ArrayList<Persona> clientes = PersonaDao.personasFromJson();
		instancia.agregarClientes(clientes);
		instancia.agregarLocales(locales);
		instancia.setCantidadApertura(2);
		return instancia;
	}
	
	
	@Test
	public void testDosLocalesAperturaSize() {
		Instancia instancia = setUp();
		Solver solver = new Solver(instancia);
		Solucion solucion = solver.resolver();
		assertTrue(solucion.getLocales().size() == 2);
	}
	
	@Test
	public void testNombrePrimerLocal(){
		Instancia instancia = setUp();
		Solver solver = new Solver(instancia);
		Solucion solucion = solver.resolver();
		assertTrue(solucion.getLocales().get(0).getNombre().equals("Gutierrez"));
	}

	@Test
	public void testNombreSegundoLocal(){
		Instancia instancia = setUp();
		Solver solver = new Solver(instancia);
		Solucion solucion = solver.resolver();
		assertTrue(solucion.getLocales().get(1).getNombre().equals("Leon Suarez"));
	}


	

}
