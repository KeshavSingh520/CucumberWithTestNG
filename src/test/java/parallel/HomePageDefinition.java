package parallel;

import io.cucumber.java.en.Then;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import util.DriverUtility;

public class HomePageDefinition {

    HomePage hp = new HomePage(DriverUtility.getDriver().get());

    @Then("User search in search facebook input")
    public void user_search_in_search_facebook_input() {
        hp.searchFacebook();
    }
}
