package com.vehicleregistration.test.pages;

import com.vehicleregistration.test.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleRegPage extends DriverManager {
    public static String regnumber;


    @FindBy(xpath = "//input[@name='vehicleReg']")
    WebElement registrtionNo;

    @FindBy(xpath = "//div[@id='icon']")
    WebElement findVehical;

    @FindBy(xpath = "//div[@class='result']")
    WebElement resultfor;


    public void rRegistrtionNo(String regNo) {
        regnumber = regNo;
        registrtionNo.sendKeys(regNo);
    }

    public void fFindVehical() {
        findVehical.click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String rResultfor() {
        return resultfor.getText().substring(13, 20);
    }

}
