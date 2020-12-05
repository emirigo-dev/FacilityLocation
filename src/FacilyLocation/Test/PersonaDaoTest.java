package FacilyLocation.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import FacilyLocation.DAO.PersonaDao;
import FacilyLocation.Logic.Persona;

class PersonaDaoTest {

	@Test
	public void peopleSize() {
		
		ArrayList <Persona> personas = PersonaDao.personasFromJson();
		assertTrue (personas.size() == 20);
	}

}
