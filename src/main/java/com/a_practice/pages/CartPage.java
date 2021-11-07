package com.a_practice.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class CartPage extends BasePage {

    int totalQuantityInCart = 0;

	@FindBy(xpath = "//input[@class='cart_quantity_input form-control grey']")
    private List<WebElement> cartItemImages;

    @FindBy(css = ".cart_quantity_delete")
    private WebElement deleteItemFromCartButton;

    @FindBy(css = "p.alert.alert-warning")
    private WebElement getEmptyCartMessage;

    public int getNumberOfItemsInCart() {
        for (WebElement valueOfCart:cartItemImages){
            totalQuantityInCart += Integer.parseInt(valueOfCart.getAttribute("value"));
        }
        return totalQuantityInCart;
    }

    public CartPage deleteFirstItemFromCart() {
        click(deleteItemFromCartButton);
        return this;
    }

    public String getEmptyCartMessage(){
        waitForElementDisplayed(getEmptyCartMessage);
        return getEmptyCartMessage.getText();
    }
}
