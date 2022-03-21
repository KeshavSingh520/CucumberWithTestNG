package parallel;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import util.DriverUtility;

import java.util.List;

public class LoginStepDefinition {

    LoginPage lp = new LoginPage(DriverUtility.getDriver().get());
    int count = 0;

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

//    @Then("User is on home page")
//    public void user_is_on_home_page() {
//        lp.checkUserIsOnHomePage();
//        System.out.println("Thread id: "+Thread.currentThread().getId());
//    }

    @Then("User is on home page {string}")
    public void user_is_on_home_page(String string) {
        lp.checkUserIsOnHomePage(string);
        System.out.println("Thread id: "+Thread.currentThread().getId());
    }

    @When("User enters username and password")
    public void user_enters_username_and_password(DataTable dataTable) {
       List<List<String>> dataTable1 = dataTable.asLists(String.class);
       for(List<String> data: dataTable1){
           System.out.println(data.get(0)+"  "+data.get(1)+" "+ ++count);
           user_is_on_login_page();
           user_enters_and(data.get(0),data.get(1));
           click_on_login_button();
//           user_is_on_home_page();
       }
    }
}
