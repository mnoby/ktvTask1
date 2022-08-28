package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.careerSteps;


public class careersMenu {

    @Steps
    careerSteps cs;

    @Given("User visit Koltiva.com")
    public void user_visit_koltiva_com() {
        cs.openUrl();
    }
    @When("User Click Careers Menu")
    public void user_click_careers_menu() {
        cs.clickCareerBtn();
    }
    @Then("User success to access Careers Menu")
    public void user_success_to_access_careers_menu() {
        cs.asserts();
    }
}
