package uma.healthcalc;

public class HealthCalcImpl implements HealthCalc {

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
	public float idealWeight(int height, char string) throws Exception {
		Character genero = Character.toUpperCase(string);
		if (height > 272) {
			throw new IllegalArgumentException(
					"La altura supera el límite establecido puesto que el máximo recogido es de 1.72 metros");
		} else if (height < 0) {
			throw new IllegalArgumentException("La altura introducida es negativa");
		} else if (height < 50) {
			throw new IllegalArgumentException(
					"La altura se encuentra por debajo del límite establecido puesto que el mínimo recogido es de 0.5 metros");
		} else if (genero != 'H' && genero != 'M') {
			throw new IllegalArgumentException("Solo se acepta entradas de género 'H' para hombres y 'M' para mujeres");
		} else {
			if (genero == 'H') {
				return height - 100 - ((height - 150) / 4);
			} else {
				return height - 100 - ((height - 150) / 2.5f);
			}
		}
	}

	@Override
	public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
		Character genero = Character.toUpperCase(gender);
		float BMR = 0;
		if (15 > weight || weight > 500) {
			throw new IllegalArgumentException(
					"Peso incorrecto: Solo se aceptan valores dentro del rango [15kg,500kg]");
		} else if (50 > height || height > 272) {
			throw new IllegalArgumentException(
					"Altura incorrecta: Solo se aceptan valores dentro del rango [40cm,275cm]");
		} else {
			if (genero != 'H' && genero != 'M') {
				throw new IllegalArgumentException(
						"Género incorrecto: Solo se acepta entradas de género 'H' para hombres y 'M' para mujeres");
			} else if (0 > age || age > 100) {
				throw new IllegalArgumentException("Edad incorrecta: Solo se aceptan valores dentro del rango [0,100]");
			} else if (genero == 'H') {
				BMR = (10 * weight) + (6.25f * height) - (5 * age) + 5;
			} else {
				BMR = (10 * weight) + (6.25f * height) - (5 * age) - 161;
			}
		}
		return BMR;
	}
}
