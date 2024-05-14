package uma.healthcalc;

/**
 * Calculator of some health parameters of persons.
 * 
 *
 *
 */
public interface HealthHospital {
	
	/**
	 * Calcula el peso ideal (PI) de una persona siguiendo la fórmula de Lorentz:
	 * Hombres: PI = altura - 100 - (altura - 150) / 4)
	 * Mujeres: PI = altura - 100 - (altura - 150) / 2.5)
	 *
	 * @param altura 	Altura de la persona (m).
	 * @param genero	Género de la persona ('h' o 'm').
	 * @return 		 	El peso ideal de una persona (g).
	 * @throws Exception 
	 */
	public int pesoIdeal (char genero, float altura) throws Exception;
	
	/**
	 * Calcula la tasa metabólica basal (BMR) de una persona con la siguiente fórmula:
	 * Hombres: BMR = 10 * peso + 6.25 * altura - 5 * edad + 5
	 * Mujeres: BMR = 10 * peso + 6.25 * altura - 5 * edad - 161
	 *   
	 * @param peso	    Peso de una persona (g).
	 * @param altura 	Altura de la persona (m).
	 * @param genero	Género de la persona ('h' o 'm').
	 * @param edad		Edad de la persona.
	 * @return	  		Tasa metabólica basal de la persona.
	 * @throws Exception
	 */
	public double bmr(char genero, int edad, float altura, int peso) throws Exception;
}
