package com.gits.automationexercise.testcases;
import com.gits.automationexercise.configuration.BaseTest;
import com.gits.automationexercise.configuration.LandingPage;
import com.gits.automationexercise.testpages.AccountCreatedPage;
import com.gits.automationexercise.testpages.CreateAccountInformationPage;
import com.gits.automationexercise.testpages.SignUpPage;
import com.gits.automationexercise.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountInformationValidation extends BaseTest {
    @Test
    public void CreateAccountInformationValidation() {
        LandingPage lp = new LandingPage(driver);
        SignUpPage sp=new SignUpPage(driver);
        CreateAccountInformationPage cai = new CreateAccountInformationPage(driver);
        AccountCreatedPage acp=new AccountCreatedPage(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl,Data.BASE_URL);
        System.out.println("Home Page URL is visible");

        // Click on 'Signup / Login' button
        lp.getSignUpButton().click();
        sleepTime(1000);


        //Verify 'New User Signup!' is visible
        if (sp.getSignUpHeader().isDisplayed())
        {
            String newUserSignupText= sp.getSignUpHeader().getText();
            Assert.assertTrue(true,newUserSignupText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Sending Values
        sp.getInputName().sendKeys(Data.NAME);
        sleepTime(1000);

        sp.getInputEmail().sendKeys(Data.EMAIL_ADDRESS);
        sleepTime(1000);

        sp.getLogInButton().click();
        sleepTime(2000);



        // Fill details: Title, Name, Email, Password, Date of birth

        if (cai.getTitleGenderBox1().isDisplayed())
        {
            String titleGenderBox1= cai.getTitleGenderBox1().getText();
            Assert.assertTrue(true,titleGenderBox1);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,500)");

        //click on Gender box
        cai.getTitleGenderBox1().click();
        sleepTime(1000);
        //eaip.getTitleGenderBox2().click();
        //sleepTime(1000);

        // input Password
        cai.getInputPassword().sendKeys(Data.INPUT_PASSWORD);

        //Select Birth date

        cai.getSelectDay().sendKeys(Data.SELECT_DAY);
        cai.getSelectMonth().sendKeys(Data.SELECT_MONTH);
        cai.getSelectYear().sendKeys(Data.SELECT_YEAR);
        sleepTime(2000);


        //10. Select checkbox Sign up for our newsletter!
        cai.getSignup_NewsLetterCheckBox().click();
        sleepTime(1000);
        // 11. Select checkbox 'Receive special offers from our partners!'
        cai.getReceiveSpecialOfferCheckBox().click();
        sleepTime(1000);

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)");


        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        cai.getFirstName().sendKeys(Data.FIRST_NAME);
        cai.getLastName().sendKeys(Data.LAST_NAME);
        cai.getInputCompany().sendKeys(Data.COMPANY_NAME);
        cai.getInputAddress1().sendKeys(Data.ADDRESS_1);
        cai.getInputAddress2().sendKeys(Data.ADDRESS_2);
        cai.getSelectCountry().sendKeys(Data.COUNTRY.toUpperCase());
        cai.getInputState().sendKeys(Data.STATE);
        cai.getInputCity().sendKeys(Data.CITY);
        cai.getInputZipCode().sendKeys(Data.ZIP_CODE);
        cai.getInputMobileNumber().sendKeys(Data.MOBILE_NUMBER);
        sleepTime(3000);

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,500)");

        //13. Click 'Create Account button'
        cai.getClickOnCreateAccountButton().click();
        sleepTime(2000);

        //14. Verify that 'ACCOUNT CREATED!' is visible

        if (acp.getAccountCreated().isDisplayed()) {
            String AccountCreateText = acp.getAccountCreated().getText();
            Assert.assertTrue(true,AccountCreateText);
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        //15. Click 'Continue' button
        acp.getClickOnContinueButton().click();
        sleepTime(2000);

        // Verify that 'Logged in as username' is visible
        if (lp.getLoggedInAsUserName().isDisplayed())
        {
            String actualLoggedUserName = lp.getLoggedInAsUserName().getText();
            Assert.assertTrue(true,actualLoggedUserName);
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }



    }
}
