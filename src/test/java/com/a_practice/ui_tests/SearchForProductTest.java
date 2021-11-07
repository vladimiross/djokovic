package com.a_practice.ui_tests;

import com.a_practice.BaseTest;
import com.a_practice.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchForProductTest extends BaseTest {
    String itemName = "Blouse";

    @Test
    public void searchSingleProductTest(){
        HomePage homePage = new HomePage();

        boolean actualResultForSearchCritera = homePage.openBaseURL()
                .searchForItem(itemName)
                .doEveryItemInListContainRelevantTitle(itemName);

        Assert.assertTrue(actualResultForSearchCritera);
    }

}
