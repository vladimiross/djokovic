package com.a_practice.ui_tests;

import com.a_practice.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.a_practice.pages.CartPage;
import com.a_practice.pages.HomePage;

public class AddSingleItemToCartTest extends BaseTest {

	@Test
    public void addSingleItemToCartTest() {
	    int expectedNumberOfItemsInCart = 1;
	    String itemName = "Blouse";

        HomePage homePage = new HomePage();

        int actualNumberOfItemsInCart = homePage.openBaseURL()
                .searchForItem(itemName)
                .clickOnItemWithText(itemName)
                .addItemToCart()
                .proceedToCart()
                .getNumberOfItemsInCart();

        Assert.assertEquals(expectedNumberOfItemsInCart, actualNumberOfItemsInCart, "Wrong number of items in cart!");
    }
}
