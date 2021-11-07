package com.a_practice.ui_tests;

import com.a_practice.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.a_practice.pages.CartPage;
import com.a_practice.pages.HomePage;

public class DeleteSingleItemFromCartTest extends BaseTest {

	@Test
    public void deleteItemFromCartTest() {
        String searchItem = "Blouse";
        String expectedEmptyCartMessage = "Your shopping cart is empty.";

        HomePage homePage = new HomePage();

        String actualEmptyCartMessage = homePage.openBaseURL()
                .searchForItem(searchItem)
                .clickOnItemWithText(searchItem)
                .addItemToCart()
                .proceedToCart()
                .deleteFirstItemFromCart()
                .getEmptyCartMessage();
        
        Assert.assertEquals(actualEmptyCartMessage, expectedEmptyCartMessage);
    }
}
