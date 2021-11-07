package com.a_practice.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateAccountPage extends BasePage{

    @FindBy(id = "customer_firstname")
    private WebElement customerFirstName;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastName;

    @FindBy(id = "passwd")
    private WebElement customerPassword;

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "address1")
    private WebElement cityAddress;

    @FindBy(id = "city")
    private WebElement cityName;

    @FindBy(id="id_state")
    private WebElement stateName;

    @FindBy(id = "postcode")
    private WebElement zipCode;


    @FindBy(id = "phone_mobile")
    private WebElement personalMobilePhone;

    @FindBy(id = "alias")
    private WebElement aliasAddress;

    @FindBy(id = "submitAccount")
    private WebElement registerBtn;

    @FindBy(id = "uniform-id_gender1")
    private WebElement genderMrBtn;

    public MyAccountPage enterUserData(String firstName,
                                           String lastName,
                                           String password,
                                           String address,
                                           String city,
                                           String state,
                                           String zip,
                                           String mobilePhone){
        click(genderMrBtn);
        sendKeys(customerFirstName, firstName);
        sendKeys(customerLastName, lastName);
        sendKeys(customerPassword, password);
        sendKeys(cityAddress, address);
        sendKeys(cityName, city);
        selectOption(stateName, state);
        sendKeys(zipCode, zip);
        sendKeys(personalMobilePhone, mobilePhone);
        click(registerBtn);

        return new MyAccountPage();


    }
}
