package com.a_practice.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	@FindBy(className = "login")
    private WebElement signInButton;

    @FindBy(id = "search_query_top")
    private WebElement searchBar;

    @FindBy(name = "submit_search")
    private WebElement searchButton;
    
    public SignInPage goToSigninPage() {
        click(signInButton);
        return new SignInPage();
    }

    public SearchPage searchForItem(String itemName) {
        sendKeys(searchBar, itemName);
        click(searchButton);
        return new SearchPage();
    }
}
