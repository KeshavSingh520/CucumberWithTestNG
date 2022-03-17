package parallel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import util.DriverUtility;

public class LoginStepDefinition {

    LoginPage lp = new LoginPage(DriverUtility.getDriver().get());

    @Given("User is on Login page")
    public void user_is_on_login_page() {
        lp.userIsOnLoginPage();
        System.out.println("Thread id: "+Thread.currentThread().getId());
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        lp.enterUsernamePassword(username, password);
    }

    @When("Click on Login button")
    public void click_on_login_button() {
        lp.clickLoginButton();
    }

    @Then("User is on home page")
    public void user_is_on_home_page() {
        lp.checkUserIsOnHomePage();
        System.out.println("Thread id: "+Thread.currentThread().getId());
    }
}
