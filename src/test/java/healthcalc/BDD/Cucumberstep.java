import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class CucumberStep {

    // Pasos para la primera feature: Cálculo del peso ideal de una persona
    @Given("^que ingreso la altura de la persona como (\\d+) cm$")
    public void ingresarAlturaPesoIdeal(int altura) {
        // Lógica para ingresar la altura para el cálculo del peso ideal
    }

    @When("^selecciono el género masculino y presiono el botón de calcular para el peso ideal$")
    public void calcularPesoMasculinoIdeal() {
        // Lógica para seleccionar género masculino y calcular el peso ideal
    }

    @When("^selecciono el género femenino y presiono el botón de calcular para el peso ideal$")
    public void calcularPesoFemeninoIdeal() {
        // Lógica para seleccionar género femenino y calcular el peso ideal
    }

    @Then("^la calculadora muestra que el peso ideal para la persona es de aproximadamente (.*) kg$")
    public void verificarPesoIdeal(double pesoIdeal) {
        // Lógica para verificar que la calculadora muestra el peso ideal esperado
    }

    // Pasos para la segunda feature: Cálculo de la tasa metabólica basal de una persona
    @Given("^que ingreso la edad de la persona como (\\d+) años$")
    public void ingresarEdadTMB(int edad) {
        // Lógica para ingresar la edad para el cálculo de la TMB
    }

    @When("^selecciono el género masculino y presiono el botón de calcular TMB$")
    public void calcularTMBMasculino() {
        // Lógica para seleccionar género masculino y calcular la TMB
    }

    @Then("^selecciono el género femenino y presiono el botón de calcular TMB$")
    public void calcularTMBFemenino() {
        // Lógica para seleccionar género femenino y calcular la TMB
    }

    @Then("^la calculadora muestra que la TMB para la persona es de aproximadamente (.*) kcal/día$")
    public void verificarTMB(double tmb) {
        // Lógica para verificar que la calculadora muestra la TMB esperada
    }
}
