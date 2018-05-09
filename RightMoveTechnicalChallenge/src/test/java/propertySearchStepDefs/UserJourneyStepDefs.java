package propertySearchStepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import propertySearchStepImplmns.UserJourneyStepImplmns;

public class UserJourneyStepDefs {

    UserJourneyStepImplmns userJourneyStepImplmns = new UserJourneyStepImplmns();

    @Given("^I'm on home page$")
    public void i_m_on_home_page() throws Exception {
        userJourneyStepImplmns.i_m_on_home_page();
    }

    @When("^I provide postcode$")
    public void i_provide_postcode() throws Exception {
        userJourneyStepImplmns.i_provide_postcode();
    }

    @When("^I click for sale button$")
    public void i_click_for_sale_button()  {
        userJourneyStepImplmns.i_click_for_sale_button();
    }

    @When("^I select search radius$")
    public void i_select_search_radius() throws Exception {
        userJourneyStepImplmns.i_select_search_radius();
    }

    @When("^I select price range for sale$")
    public void i_select_price_range_for_sale() throws Exception {
        userJourneyStepImplmns.i_select_price_range_for_sale();
    }

    @When("^I select min and max number of bedrooms$")
    public void i_select_min_and_max_number_of_bedrooms() throws Exception{
        userJourneyStepImplmns.i_select_min_and_max_number_of_bedrooms();
    }

    @When("^I select property type$")
    public void i_select_property_type()throws Exception {
        userJourneyStepImplmns.i_select_property_type();
    }


    @When("^I select property timeline$")
    public void i_select_property_timeline() throws Exception{
        userJourneyStepImplmns.i_select_property_timeline();
    }

    @When("^I click find properties$")
    public void i_click_find_properties() {
        userJourneyStepImplmns.i_click_find_properties();
    }

    @When("^I sort the property list newest listed option$")
    public void i_sort_the_property_list_newest_listed_option() throws Exception {
        userJourneyStepImplmns.i_sort_the_property_list_newest_listed_option();
    }

    @When("^I click the first non - featured property$")
    public void i_click_the_first_non_featured_property() {
        userJourneyStepImplmns.i_click_the_first_non_featured_property();
    }

    @Then("^I should see the appropriate details$")
    public void i_should_see_the_appropriate_details() throws Exception{
        userJourneyStepImplmns.i_should_see_the_appropriate_details();
    }

    @When("^I click to rent button$")
    public void i_click_to_rent_button() {
       userJourneyStepImplmns.i_click_to_rent_button();
    }

    @When("^I select price range to rent$")
    public void i_select_price_range_to_rent() throws Exception{
        userJourneyStepImplmns.i_select_price_range_to_rent();
    }




}
