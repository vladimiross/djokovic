package com.a_practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {

	@FindBy(xpath = "//button[@name='Submit']/span[contains(text(),'Add to cart')]")
    private WebElement addToCartButton;

    public CartConfirmationPage addItemToCart() {
        click(addToCartButton);
        return new CartConfirmationPage();
    }
}
