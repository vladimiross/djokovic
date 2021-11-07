package com.a_practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(id = "email_create")
    private WebElement enterEmailField;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccountBtn;

    public CreateAccountPage goToCreateAccountPage(String email) {
        sendKeys(enterEmailField, email);
        click(createAccountBtn);
        return new CreateAccountPage();
    }
}
