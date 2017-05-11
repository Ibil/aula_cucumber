package pt.tecnico.ulisboa.es.bdd.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import pt.tecnico.ulisboa.es.bdd.Calculator;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class CalculatorSteps {


    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        assertNotNull(calculator);
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
        calculator.add(arg1, arg2);
    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int result) throws Throwable {
        assertEquals(result, calculator.getResult());
    }

    @Then("^the result will be (\\d+)$")
    public void the_result_will_be(int arg1) throws Throwable {
        assertEquals(arg1, calculator.getResult());
    }

    @Then("^the result is (\\d+)$")
    public void the_result_is(int arg1) throws Throwable {
        assertEquals(arg1, calculator.getResult());
    }

}
