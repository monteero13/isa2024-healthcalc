package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	
	private final HealthCalcImpl c = new HealthCalcImpl();

	@Test
	@DisplayName("Test para la entrada de altura negativa.")
	public void test_negative_heightIBW(){
		assertThrows(IllegalArgumentException.class, () -> c.idealWeight(-150, 'M'), "Altura negativa");
	}

	@Test
	@DisplayName("Test para la entrada de género erróneo.")
	public void test_wrong_genderIBW(){
		assertThrows(IllegalArgumentException.class, () -> c.idealWeight(150, 'k'), "Género erróneo");
	}

	@Test
	@DisplayName("Test para la entrada de altura mínima.")
	public void test_min_heightIBW(){
		assertThrows(IllegalArgumentException.class, () -> c.idealWeight(40, 'H'), "Altura inferior a la mínima");
	}

	@Test
	@DisplayName("Test para la entrada de altura máxima.")
	public void test_max_heightIBW(){
		assertThrows(IllegalArgumentException.class, () -> c.idealWeight(300, 'H'), "Altura superior a la máxima");
	}

	@Test
	@DisplayName("Test de uso estándar en hombres.")
	public void test_avg_menIBW() throws Exception{
		float IBW = 190 - 100 - ((190 - 150) / 4);
		assertEquals(IBW, c.idealWeight(190, 'H'));

		IBW = 157 - 100 - ((157 - 150) / 4);
		assertEquals(IBW, c.idealWeight(157, 'H'));

		IBW = 222 - 100 - ((222 - 150) / 4);
		assertEquals(IBW, c.idealWeight(222, 'H'));
	}

	@Test
	@DisplayName("Test de uso estándar en mujeres")
	public void test_avg_womenIBW() throws Exception{
		float IBW = (float) (104 - 100 - ((104 - 150) / 2.5));
		assertEquals(IBW, c.idealWeight(104, 'M'));

		IBW = (float) (160 - 100 - ((160 - 150) / 2.5));
		assertEquals(IBW, c.idealWeight(160, 'M'));

		IBW = (float) (243 - 100 - ((243 - 150) / 2.5));
		assertEquals(IBW, c.idealWeight(243, 'M'));
	}

	@Test
	@DisplayName("Test para la entrada de peso negativo.")
	public void test_negative_weightBMR(){
		assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(-30, 156, 'M',67), "Peso negativo");
	}

	@Test
	@DisplayName("Test para la entrada de peso mínimo.")
	public void test_min_weightBMR(){
		assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(10, 156, 'M',50), "Peso inferior al mínimo");
	}

	@Test
	@DisplayName("Test para la entrada de peso máximo.")
	public void test_max_weightBMR(){
		assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(700, 156, 'M',23), "Peso superior al máximo");
	}

	@Test
	@DisplayName("Test para la entrada de altura negativa.")
	public void test_negative_heightBMR(){
		assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(58,-140,'H',80), "Altura negativa");
	}

	@Test
	@DisplayName("Test para la entrada de género erróneo.")
	public void test_wrong_genderBMR(){
		assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(69,189,'i',43), "Género erróneo");
	}

	@Test
	@DisplayName("Test para la entrada de altura mínima.")
	public void test_min_heightBMR(){
		assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(67,30,'H',55), "Altura inferior a la mínima");
	}

	@Test
	@DisplayName("Test para la entrada de altura máxima.")
	public void test_max_heightBMR(){
		assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(54,400,'M',76), "Altura superior a la máxima");
	}

	@Test 
	@DisplayName("Test de edad errónea")
	public void test_wrong_ageBMR(){
		assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(54,400,'M',1022), "Edad errónea");
	}

	@Test
	@DisplayName("Test de uso estándar en hombres.")
	public void test_avg_menBMR() throws Exception{
		float BMR = 10 * 40 + 6.25f * 159 - 5 * 33 + 5;
		assertEquals(BMR, c.basalMetabolicRate(40, 159, 'H', 33));

		BMR = 10 * 45 + 6.25f * 147 - 5 * 23 + 5;
		assertEquals(BMR, c.basalMetabolicRate(45, 147, 'H', 23));

		BMR = 10 * 80 + 6.25f * 180 - 5 * 79 + 5;
		assertEquals(BMR, c.basalMetabolicRate(80, 180, 'H', 79));
	}

	@Test
	@DisplayName("Test de uso estándar en mujeres.")
	public void test_avg_womenBMR() throws Exception{
		float BMR = (10 * 40) + (6.25f * 159) - (5 * 33) - 161;
		assertEquals(BMR, c.basalMetabolicRate(40, 159, 'M', 33));

		BMR = (10 * 45) + (6.25f * 147) - (5 * 23) - 161;
		assertEquals(BMR, c.basalMetabolicRate(45, 147, 'M', 23));

		BMR = (10 * 80) + (6.25f * 180) - (5 * 79) - 161;
		assertEquals(BMR, c.basalMetabolicRate(80, 180, 'M', 79));
	}
}