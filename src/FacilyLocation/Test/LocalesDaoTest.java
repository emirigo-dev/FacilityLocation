package FacilyLocation.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import FacilyLocation.DAO.LocalesDao;
import FacilyLocation.Logic.Locales;

class LocalesDaoTest {

	@Test
	void centroDistribucionSize() {
		ArrayList <Locales> centros = LocalesDao.centrosFromJson();
		assertTrue (centros.size() == 4);
	}

}
