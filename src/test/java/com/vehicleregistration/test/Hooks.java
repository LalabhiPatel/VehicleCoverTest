package com.vehicleregistration.test;

import com.vehicleregistration.test.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverManager driverManager =new DriverManager();
    @Before
    public void SetUp(){
        driverManager.openBrowser();
        driverManager.navigateTo("https://covercheck.vwfsinsuranceportal.co.uk/");
        driverManager.maxBroser();
        driverManager.applyImplicit();
        driverManager.sleep(300);

    }
    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
