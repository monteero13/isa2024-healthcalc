package uma.healthcalc;

public class HealthCalcImpl implements CardiovascularMetrics, MetabolicMetrics {

	private static HealthCalcImpl instance;
	
	public HealthCalcImpl(){
	}

	public static HealthCalcImpl getInstance(){
		if(instance == null){
			instance = new HealthCalcImpl();
		}
		return instance;
	}

	@Override
	public double basalMetabolicRate(Person person) {
		Gender genero = person.gender();
		double BMR = 0;
		if (15 > person.weight() || person.weight() > 500) {
			throw new IllegalArgumentException(
					"Peso incorrecto: Solo se aceptan valores dentro del rango [15kg,500kg]");
		} else if (50 > person.height() || person.height() > 272) {
			throw new IllegalArgumentException(
					"Altura incorrecta: Solo se aceptan valores dentro del rango [40cm,275cm]");
		} else {
			if (genero != Gender.MALE && genero != Gender.FEMALE) {
				throw new IllegalArgumentException(
						"Género incorrecto: Solo se acepta entradas de género 'H' para hombres y 'M' para mujeres");
			} else if (0 > person.age() || person.age() > 100) {
				throw new IllegalArgumentException("Edad incorrecta: Solo se aceptan valores dentro del rango [0,100]");
			} else if (genero == Gender.MALE) {
				BMR = (10 * person.weight()) + (6.25d * person.height()) - (5 * person.age()) + 5;
			} else {
				BMR = (10 * person.weight()) + (6.25d * person.height()) - (5 * person.age()) - 161;
			}
		}
		return BMR;
	}

	@Override
	public double getIdealBodyWeight(Person person) {
		Gender genero = person.gender();
		if (person.height() > 272) {
			throw new IllegalArgumentException(
					"La altura supera el límite establecido puesto que el máximo recogido es de 1.72 metros");
		} else if (person.height() < 0) {
			throw new IllegalArgumentException("La altura introducida es negativa");
		} else if (person.height() < 50) {
			throw new IllegalArgumentException(
					"La altura se encuentra por debajo del límite establecido puesto que el mínimo recogido es de 0.5 metros");
		} else if (genero != Gender.MALE && genero != Gender.FEMALE) {
			throw new IllegalArgumentException("Solo se acepta entradas de género 'H' para hombres y 'M' para mujeres");
		} else {
			if (genero == Gender.MALE) {
				return person.height() - 100 - ((person.height() - 150) / 4d);
			} else {
				return person.height() - 100 - ((person.height() - 150) / 2.5d);
			}
		}
	}
}
