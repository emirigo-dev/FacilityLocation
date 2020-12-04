package FacilyLocation.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import FacilyLocation.CentroDistribucion;
import FacylyLocation.DAO.CentroDistribucionDao;

class CentroDistribucionDaoTest {

	@Test
	void centroDistribucionSize() {
		ArrayList <CentroDistribucion> centros = CentroDistribucionDao.centrosFromJson();
		assertTrue (centros.size() == 4);
	}

}
