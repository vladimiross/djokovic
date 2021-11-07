package com.a_practice.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	@FindBy(css = ".product-name")
    private List<WebElement> searchItems;

    @FindBy(css = ".product_list .product-name")
    private List<WebElement> searchResult;


    public ItemPage clickOnItemWithText(String text) {
        click(searchItems.stream()
        				.filter(webElement -> webElement.getText().contains(text))
        				.findFirst()
        				.orElse(null));
        return new ItemPage();
    }

    public Boolean doEveryItemInListContainRelevantTitle(String text){
            boolean answer = searchResult.stream()
                    .allMatch(webElement -> webElement.getText().contains(text));
            return answer;
    }
}
