package com.a_practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//a[@class='account']/span")
    private WebElement accountName;

    public String getUserName(){
        waitForElementDisplayed(accountName);
        String customerName = accountName.getText();
        return customerName;
    }

}
