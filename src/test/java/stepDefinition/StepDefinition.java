package stepDefinition;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on the netbanking login page$")
    public void user_is_on_the_netbanking_login_page() throws Throwable {
    	System.out.println("navigated to netbanking login page");

    }

    @When("^User enters username and password and clicks on login button$")
    public void user_enters_username_and_password_and_clicks_on_login_button() throws Throwable {
    	System.out.println("successfully logged in");
    }
    
    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and clicks on login button$")
    public void user_enters_something_and_something_and_clicks_on_login_button(String strArg1, String strArg2) throws Throwable {
       System.out.println(strArg1);
       System.out.println(strArg2);
    }


    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
    	System.out.println("validated homepage ");
    }

    @And("^All the card details are displayed$")
    public void all_the_card_details_are_displayed() throws Throwable {
    	System.out.println("validated all the cards ");
    }
    
    @And("^All the card details are displayed is \"([^\"]*)\"$")
    public void all_the_card_details_are_displayed_is_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }

}