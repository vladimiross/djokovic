package com.a_practice.ui_tests;

import com.a_practice.utils.DataUtil;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.a_practice.BaseTest;
import com.a_practice.pages.HomePage;

import java.util.Hashtable;


public class RegisterWithValidDataTest extends BaseTest {

    @Test(dataProviderClass = DataUtil.class, dataProvider="getUserData")
    public void registerTest(Hashtable<String,String> data) {
        String expectedUserName = data.get("firstName")+" "+data.get("lastName");

        HomePage homePage = new HomePage();

        String actualUserName = homePage.openBaseURL()
                .goToSigninPage()
                .goToCreateAccountPage("ENTER_YOUR_EMAIL_ADDRESSs")
                .enterUserData( data.get("firstName"),
                                data.get("lastName"),
                                data.get("password"),
                                data.get("address"),
                                data.get("city"),
                                data.get("state"),
                                data.get("zip"),
                                data.get("mobilePhone")
                                )
                .getUserName();

        Assert.assertEquals(actualUserName, expectedUserName);
    }
}
