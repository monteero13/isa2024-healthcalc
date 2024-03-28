package test.java.healthcalc.BDD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.miapp.steps"
)
public class CucumberRun {
    public static void main(String[] args) {
        // Este método main es necesario para ejecutar la clase como una aplicación Java
        io.cucumber.core.cli.Main.main(args);
    }
}
