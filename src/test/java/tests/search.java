package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.searchSteps;

public class search {
    @Steps
    searchSteps srcStep;


    @Given("User open amazon.com")
    public void user_open_amazon_com() {
        srcStep.openUrl();
    }
//    @And("User choose product category")
//    public void user_choose_product_category() {
//        srcStep.category();
//    }
    @And("input Product Name {string}")
    public void input_product_name(String product) {
        srcStep.inputProduct(product);
    }
    @Then("User Click Search Button")
    public void user_click_search_button() {
        srcStep.clickSearchBtn();
    }

    @And("All of {string} is showing")
    public void all_of_is_showing(String product) {
        srcStep.validSearch(product);
    }
}
