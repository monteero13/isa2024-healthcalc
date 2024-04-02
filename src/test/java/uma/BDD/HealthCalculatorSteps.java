package uma.BDD;

import static org.junit.Assert.*;

import uma.HealthCalcImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthCalculatorSteps {

    private char gender;
    private int age;
    private float weight;
    private int height;
    private float calculatedValue;
	private final HealthCalcImpl healthCalculator = new HealthCalcImpl();
    private float calculatedTMB;

    @Given("que ingreso la altura de la persona como {int} cm")
    public void que_ingreso_la_altura_de_la_persona_como_cm(int height) {
        this.height = height;
    }

    @When("selecciono el genero {string} y presiono el boton de calcular")
    public void selecciono_el_genero_y_presiono_el_boton_de_calcular(String gender) {
        this.gender = gender.charAt(0);
        try {
            calculatedValue = healthCalculator.idealWeight(height, this.gender);
        } catch (Exception e) {
            // Manejo de la excepción
            e.printStackTrace();
        }
    }

    @Then("la calculadora muestra que el peso ideal para la persona es de aproximadamente {double} kg")
    public void la_calculadora_muestra_que_el_peso_ideal_para_la_persona_es_de_aproximadamente_kg(Double expectedWeight) {
        assertEquals(expectedWeight, calculatedValue,0.01);
    }

    @Given("que ingreso la edad de la persona como {int} anos, el peso como {float} kg y la altura como {int} cm")
    public void que_ingreso_la_edad_de_la_persona_como_anos_el_peso_como_kg_y_la_altura_como_cm(int age, float weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @When("selecciono el genero {string} y presiono el boton de calcular TMB")
    public void selecciono_el_genero_y_presiono_el_boton_de_calcular_TMB(String gender) {
        this.gender = gender.charAt(0);
        try {
            calculatedTMB = healthCalculator.basalMetabolicRate(weight, height, this.gender, age);
        } catch (Exception e) {
            // Manejo de la excepción
            e.printStackTrace();
        }
    }

    @Then("la calculadora muestra que la TMB para la persona es de aproximadamente {float} kcal\\/dia")
    public void la_calculadora_muestra_que_la_TMB_para_la_persona_es_de_aproximadamente_kcal_dia(float expectedTMB) {
        assertEquals(expectedTMB, calculatedTMB,0.01);
    }
}
