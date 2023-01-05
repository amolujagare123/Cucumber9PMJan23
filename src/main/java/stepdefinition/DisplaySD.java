package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisplaySD {

    @Given("^I am on the display page$")
    public void i_am_on_the_display_page() throws Throwable {
        System.out.println("I am on the display page");
    }

    @When("^I enter (.+) and (.+)$")
    public void i_enter_and(String name, String company) throws Throwable {
        System.out.println("name="+name+" / Company="+company);
    }

    @Then("^user should be displayed$")
    public void user_should_be_displayed() throws Throwable {
        System.out.println("user should be displayed");
    }

}
