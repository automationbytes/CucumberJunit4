package Steps;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Calculator;
import org.junit.After;
import org.junit.Assert;

public class CalcSteps {

    private Calculator calculator;
    private Integer result;





    @Before //scenario level
    public void setup(){
        System.out.println("Loaded Successfully");
        calculator = new Calculator();
    }

    @BeforeStep() //for each steps
    public void befrestep(){
        System.out.println("Before step is executed");
    }


    @AfterStep()
    public void afterstep(){
        System.out.println("After step is executed");
    }



    @Given("I launch the calculator app")
    public void i_launch_the_calculator_app() {
        //calling the class
        System.out.println("Loaded Successfully");
        calculator = new Calculator();
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {

        calculator.add(int1,int2);
    }
    @Then("I verify the result is {int}")
    public void i_verify_the_result_is(Integer sum) {
        Assert.assertEquals(sum,calculator.getResult());
    }

    @When("I sub  {int} and {int}")
    public void i_subs_and(Integer int1, Integer int2) {
        calculator.sub(int1,int2);
    }
}
