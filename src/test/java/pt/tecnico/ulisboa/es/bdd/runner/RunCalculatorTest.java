package pt.tecnico.ulisboa.es.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        format = { "pretty", "html:target/cucumber" },
        glue = "pt.tecnico.ulisboa.es.bdd.steps",
        features = "classpath:cucumber/calculator.feature"
)

public class RunCalculatorTest {

}
