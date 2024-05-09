package stepDefinitions;

import io.cucumber.java.en.*;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;
import java.util.List;
import static org.junit.Assert.*;

public class BromcomHomeStepDef extends StepDefBasePage {

    @Given("The user navigates to {string}")
    public void theUserNavigatesTo(String url) {
        Driver.get().get(ConfigurationReader.get(url));
    }

    @When("The user can see those headers on the home page")
    public void theUserSeeThoseHeadersOnTheHomePage(List<String> headers) {
        bromcomHomePage.isVisible(headers);
    }

    @When("The user can click the {string} on the home page")
    public void theUserClickTheOnTheHomePage(String price) {
        bromcomHomePage.getHeaders(price).click();
    }

    @Then("The user can see the price packages can choose for her school.")
    public void theUserCanSeeThePricePackagesCanChooseForHerSchool(List<String> prices) {
        bromcomHomePage.isVisible(prices);
    }

    @When("The user can click  these headers {string} on the home page")
    public void the_user_can_click_these_headers_on_the_home_page(String headers) {
        if (headers.equals("Products") || headers.equals("Services") || headers.equals("Resources") || headers.equals("About Us")) {
            BrowserUtils.hover(bromcomHomePage.getHeaders(headers));
        } else {
            bromcomHomePage.getHeaders(headers).click();
        }
    }

    @Then("Verify that user can click the headers members and see {string}")
    public void verify_that_user_can_click_the_headers_members_and_see(String members) {
        assertTrue(bromcomHomePage.getHeaders(members).isDisplayed());
    }
}
