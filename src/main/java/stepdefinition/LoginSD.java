package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {
    WebDriver driver;
    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");
       /* driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");*/
    }
    @When("I enter correct username and correct password")
    public void i_enter_correct_username_and_correct_password() {
        System.out.println("I enter correct username and correct password");

        /*driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");
  */  }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
       // driver.findElement(By.name("submit")).click();
    }
    @Then("I should land on homepage")
    public void i_should_land_on_homepage() {
        System.out.println("I should land on homepage");

        /*String expected = "";
        String actual = driver.getCurrentUrl();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals("This is not a dashboard",expected,actual);
*/
    }


    @When("I enter incorrect username and incorrect password")
    public void iEnterIncorrectUsernameAndIncorrectPassword() {
        System.out.println("I enter incorrect username and incorrect password");
    }

    @Then("I should get an error")
    public void iShouldGetAnError() {
        System.out.println("I should get an error");

    }

    @When("I enter blank username and blank password")
    public void iEnterBlankUsernameAndBlankPassword() {
        System.out.println("I enter blank username and blank password");
    }

    @Then("I should get another error")
    public void iShouldGetAnotherError() {
        System.out.println("I should get another error");
    }

    @When("I enter username as {string} and password as {string}")
    public void iEnterUsernameAsAndPasswordAs(String username, String password) {
        System.out.println("username="+username);
        System.out.println("password="+password);
    }
}
