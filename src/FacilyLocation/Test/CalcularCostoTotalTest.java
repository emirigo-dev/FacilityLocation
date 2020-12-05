package FacilyLocation.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import FacilyLocation.Logic.Instancia;
import FacilyLocation.Logic.Locales;
import FacilyLocation.Logic.Persona;
import FacilyLocation.Logic.Solver;

public class CalcularCostoTotalTest {

	ArrayList<Persona> clientes = new ArrayList<Persona>();
	Locales l;
	Locales l2;

	@Before
	public void setUp() {
		Persona p = new Persona("Emiliano Tertu", -34.513576075644664, -58.68754071098584);
		Persona p2 = new Persona("Ricardo Morched", -34.50040949989878, -58.69752094322693);
		Persona p3 = new Persona("Juan Perez", -34.500834644814745, -58.70756537993633);
		Persona p4 = new Persona("Miguel Tibia", -34.49950110695363, -58.71618153397614);
		Persona p5 = new Persona("Luciano Perone", -34.49608496158865, -58.73636144500945);
		l = new Locales("Rivadavia", -34.522181722278994, -58.70067486591713);
		l2 = new Locales("Guiter", -34.5111300808166, -58.70716885234531);
		clientes.add(p);
		clientes.add(p2);
		clientes.add(p3);
		clientes.add(p4);
		clientes.add(p5);
	}

	@Test
	public void testCalcularCostoTotalLocal1() {
		Instancia instancia = new Instancia();
		instancia.agregarClientes(clientes);
		instancia.agregarLocal(l);
		Solver solver = new Solver(instancia);
		solver.calcularCostoTotal();
		double diference = Math.abs(13.66 - solver.get_instancia().getCentroDistribucion().get(0).getCostoTotal());
		assertTrue(diference < 1);

	}

	@Test
	public void testCalcularCostoTotalLocal2() {
		Instancia instancia = new Instancia();
		instancia.agregarClientes(clientes);
		instancia.agregarLocal(l2);
		Solver solver = new Solver(instancia);
		solver.calcularCostoTotal();
		double diference = Math.abs(9.16 - solver.get_instancia().getCentroDistribucion().get(0).getCostoTotal());
		assertTrue(diference < 1);

	}

}
