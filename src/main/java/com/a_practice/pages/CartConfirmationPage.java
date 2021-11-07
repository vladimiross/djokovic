package com.a_practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartConfirmationPage extends BasePage {
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedToCartButton;

    public CartPage proceedToCart() {
        click(proceedToCartButton);
        return new CartPage();
    }
}
