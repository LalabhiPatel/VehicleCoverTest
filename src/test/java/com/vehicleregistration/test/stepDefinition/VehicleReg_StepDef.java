package com.vehicleregistration.test.stepDefinition;

import com.vehicleregistration.test.pages.VehicleRegPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class VehicleReg_StepDef {
    VehicleRegPage vehicleRegPage=new VehicleRegPage();
    @Given("^user is on vehicle registration page$")
    public void user_is_on_vehicle_registration_page() {
        String actual = vehicleRegPage.getCurrentUrl();
        assertThat(actual, is(equalToIgnoringCase("https://covercheck.vwfsinsuranceportal.co.uk/")));

    }

    @When("^user enter the vehicle registration no \"([^\"]*)\"$")
    public void user_enter_the_vehicle_registration_no(String regNo) {
       vehicleRegPage.rRegistrtionNo(regNo);
    }

    @When("^user click on find button$")
    public void user_click_on_find_button() {
       vehicleRegPage.fFindVehical();
    }

    @Then("^user should able to see his vehicle cover details$")
    public void user_should_able_to_see_his_vehicle_cover_details() {

        String actual = vehicleRegPage.rResultfor();
        assertThat(actual, is(equalToIgnoringCase(vehicleRegPage.regnumber)));
    }


}
