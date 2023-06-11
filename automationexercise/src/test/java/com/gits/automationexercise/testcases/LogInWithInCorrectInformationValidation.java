package com.gits.automationexercise.testcases;

import com.gits.automationexercise.configuration.BaseTest;
import com.gits.automationexercise.configuration.LandingPage;
import com.gits.automationexercise.testpages.LoginToAccountPage;
import com.gits.automationexercise.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInWithInCorrectInformationValidation extends BaseTest {

    @Test
    public void TCF003_loginUserWithIncorrectMailAndPassword() {
        LandingPage lp = new LandingPage(driver);
        LoginToAccountPage ltp = new LoginToAccountPage(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println("Home Page URL is visible");

        //4. Click on 'Signup / Login' button
        lp.getSignUpButton().click();
        sleepTime(1000);

        //5. Verify 'Login to your account' is visible
        if (ltp.getLoginToAccountText().isDisplayed()) {
            String LoginToAccountText = ltp.getLoginToAccountText().getText();
            Assert.assertTrue(true, LoginToAccountText);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //6. Enter correct email address and password
        ltp.getInputLoginEmailAddress().sendKeys(Data.INPUT_INCORRECT_EMAIL);

        ltp.getInputLoginPassword().sendKeys(Data.INPUT_INCORRECT_PASSWORD);

        //7. Click 'login' button
        ltp.getClickOnLoginButton().click();
        sleepTime(1000);

        //incorrect Message Validation
        String incorectMassagetext = ltp.getIncorrectmessagetext().getText();
        System.out.println(incorectMassagetext);
        sleepTime(2000);

    }
}
