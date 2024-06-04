package healthcalc;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import uma.healthcalc.Gender;
import uma.healthcalc.HealthCalcImpl;
import uma.healthcalc.PersonImpl;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	
	private final HealthCalcImpl c = new HealthCalcImpl();
	
	@Test
	@DisplayName("Test para la entrada de altura negativa.")
	public void test_negative_heightIBW(){
		assertThrows(IllegalArgumentException.class, () -> c.getIdealBodyWeight(new PersonImpl(-150, Gender.FEMALE)), "Altura negativa");
	}

/*
@Test
@DisplayName("Test para la entrada de género erróneo.")
public void test_wrong_genderIBW(){
	assertThrows(IllegalArgumentException.class, () -> c.idealWeight(150, Gender.NO), "Género erróneo");
}
*/
	
	@Test
	@DisplayName("Test para la entrada de altura mínima.")
	public void test_min_heightIBW(){
		assertThrows(IllegalArgumentException.class, () -> c.getIdealBodyWeight(new PersonImpl(40, Gender.MALE)), "Altura inferior a la mínima");
	}

	@Test
	@DisplayName("Test para la entrada de altura máxima.")
	public void test_max_heightIBW(){
		assertThrows(IllegalArgumentException.class, () -> c.getIdealBodyWeight(new PersonImpl(300, Gender.FEMALE)), "Altura superior a la máxima");
	}

	@Test
	@DisplayName("Test de uso estándar en hombres.")
	public void test_avg_menIBW() throws Exception{
		double IBW = 190 - 100 - ((190 - 150) / 4d);
		assertEquals(IBW, c.getIdealBodyWeight(new PersonImpl(190, Gender.MALE)));

		IBW = 157 - 100 - ((157 - 150) / 4d);
		assertEquals(IBW, c.getIdealBodyWeight(new PersonImpl(157, Gender.MALE)));

		IBW = 222 - 100 - ((222 - 150) / 4d);
		assertEquals(IBW, c.getIdealBodyWeight(new PersonImpl(222,Gender.MALE)));
	}

	@Test
	@DisplayName("Test de uso estándar en mujeres")
	public void test_avg_womenIBW() throws Exception{
		double IBW = (double) (104 - 100 - ((104 - 150) / 2.5));
		assertEquals(IBW, c.getIdealBodyWeight(new PersonImpl(104,Gender.FEMALE)));

		IBW = (double) (160 - 100 - ((160 - 150) / 2.5));
		assertEquals(IBW, c.getIdealBodyWeight(new PersonImpl(160,Gender.FEMALE)));

		IBW = (double) (243 - 100 - ((243 - 150) / 2.5));
		assertEquals(IBW, c.getIdealBodyWeight(new PersonImpl(243,Gender.FEMALE)));
	}

	@Test
@DisplayName("Test para la entrada de peso negativo.")
public void test_negative_weightBMR(){
    assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(new PersonImpl(-30, 156, Gender.MALE, 67)), "Peso negativo");
}

@Test
@DisplayName("Test para la entrada de peso mínimo.")
public void test_min_weightBMR(){
    assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(new PersonImpl(10, 156, Gender.MALE, 50)), "Peso inferior al mínimo");
}

@Test
@DisplayName("Test para la entrada de peso máximo.")
public void test_max_weightBMR(){
    assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(new PersonImpl(700, 156, Gender.MALE, 23)), "Peso superior al máximo");
}

@Test
@DisplayName("Test para la entrada de altura negativa.")
public void test_negative_heightBMR(){
    assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(new PersonImpl(58, -140, Gender.MALE, 80)), "Altura negativa");
}

/*
@Test
@DisplayName("Test para la entrada de género erróneo.")
public void test_wrong_genderBMR(){
    assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(new PersonImpl(69, 189, Gender.OTHER, 43)), "Género erróneo");
}
*/

@Test
@DisplayName("Test para la entrada de altura mínima.")
public void test_min_heightBMR(){
    assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(new PersonImpl(67, 30, Gender.MALE, 55)), "Altura inferior a la mínima");
}

@Test
@DisplayName("Test para la entrada de altura máxima.")
public void test_max_heightBMR(){
    assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(new PersonImpl(54, 400, Gender.MALE, 76)), "Altura superior a la máxima");
}

@Test 
@DisplayName("Test de edad errónea")
public void test_wrong_ageBMR(){
    assertThrows(IllegalArgumentException.class, () -> c.basalMetabolicRate(new PersonImpl(54, 400, Gender.MALE, 1022)), "Edad errónea");
}

@Test
@DisplayName("Test de uso estándar en hombres.")
public void test_avg_menBMR() throws Exception{
    double BMR = 10 * 40 + 6.25f * 159 - 5 * 33 + 5;
    assertEquals(BMR, c.basalMetabolicRate(new PersonImpl(40, 159, Gender.MALE, 33)));

    BMR = 10 * 45 + 6.25f * 147 - 5 * 23 + 5;
    assertEquals(BMR, c.basalMetabolicRate(new PersonImpl(45, 147, Gender.MALE, 23)));

    BMR = 10 * 80 + 6.25f * 180 - 5 * 79 + 5;
    assertEquals(BMR, c.basalMetabolicRate(new PersonImpl(80, 180, Gender.MALE, 79)));
}

@Test
@DisplayName("Test de uso estándar en mujeres.")
public void test_avg_womenBMR() throws Exception{
    double BMR = (10 * 40) + (6.25f * 159) - (5 * 33) - 161;
    assertEquals(BMR, c.basalMetabolicRate(new PersonImpl(40, 159, Gender.FEMALE, 33)));

    BMR = (10 * 45) + (6.25f * 147) - (5 * 23) - 161;
    assertEquals(BMR, c.basalMetabolicRate(new PersonImpl(45, 147, Gender.FEMALE, 23)));

    BMR = (10 * 80) + (6.25f * 180) - (5 * 79) - 161;
    assertEquals(BMR, c.basalMetabolicRate(new PersonImpl(80, 180, Gender.FEMALE, 79)));
}
}