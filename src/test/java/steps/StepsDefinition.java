package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepsDefinition extends HelpMethods {

    @Given("User opens URL")
    public void userOpensURL() {
        startBrowser();
    }

    @When("User enters Username as {string}")
    public void user_enters_Username_as(String uname) {
        enterUsername(uname);
    }

    @When("User enters Password as {string}")
    public void user_enters_Password_as(String pass) throws InterruptedException {
        enterPassword(pass);
    }

    @When("User clicks on Login button")
    public void user_clicks_on_Login_button() {
        clickSubmit();
    }

    @Then("User can see the home page")
    public void user_can_see_the_home_page() {
        assertHomePageIsVisible();
    }

    @Then("User can see an error message")
    public void user_can_see_an_error_message() {
        assertErrorMessageIsVisible();
    }

    @When("User clicks the add to cart button on a product")
    public void user_clicks_the_add_to_cart_button_on_a_product() {
        clickAddToCart();
    }

    @Then("User can see a badge with the number of the added products appear on the cart icon on home page")
    public void user_can_see_a_badge_with_the_number_of_the_added_products_appear_on_the_cart_icon_on_home_page() {
        badgeDisplayed();
    }

    @When("User clicks on the cart icon on the home page screen")
    public void user_clicks_on_the_cart_icon_on_the_home_page_screen() {
        clickCartIcon();
    }

    @Then("User should see list of the products added to the cart")
    public void user_should_see_list_of_the_products_added_to_the_cart() {
        isProductDisplay();
    }

    @When("User clicks on checkout button")
    public void user_clicks_on_checkout_button() {
        clickCheckoutBtn();
    }

    @Then("User should be redirected to the checkout page")
    public void user_should_be_redirected_to_the_checkout_page() {
        assertCheckoutPageDisplay();
    }

    @When("User enters first name as {string}")
    public void user_enters_first_name_as(String fname) {
        enterFName(fname);
    }

    @When("User enters last name as {string}")
    public void user_enters_last_name_as(String lname) {
        enterLName(lname);
    }

    @When("User enters Zip code as {string}")
    public void user_enters_Zip_code_as(String postcode) {
        enterPostcode(postcode);
    }

    @When("User clicks on continue button")
    public void user_clicks_on_continue_button() {
        clickContinue();
    }

    @Then("User can view all the information needed for the order")
    public void user_can_view_all_the_information_needed_for_the_order() {
        assertOrderDisplay();
    }

    @When("User clicks on finish button")
    public void user_clicks_on_finish_button() {
        clickFinishButton();
    }

    @Then("User can see Thank you message")
    public void user_can_see_Thank_you_message() {
        assertThankyouMessageDisplay();
    }

    @When("User clicks on Back home button")
    public void user_clicks_on_Back_home_button() {
        clickBackHomeButton();
    }

    @Then("Close browser")
    public void close_browser() {

    }
}
