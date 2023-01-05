package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserRegistrationSD {
    @Given("I am on the user registration page")
    public void i_am_on_the_user_registration_page() {
        System.out.println("I am on the user registration page");
    }
    @When("I enter below Data")
    public void i_enter_below_data(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> data = dataTable.asLists();

        System.out.println("First Name = " + data.get(0).get(0));
        System.out.println("Last Name = " + data.get(0).get(1));
        System.out.println("Phone = " + data.get(0).get(2));
        System.out.println("Email = " + data.get(0).get(3));

    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {
        System.out.println("I click on submit button");
    }
    @Then("User should be submitted")
    public void user_should_be_submitted() {
        System.out.println("User should be submitted");
    }
}
