package com.gits.automationexercise.testpages;

import com.gits.automationexercise.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
    public SignUpPage(WebDriver driver) {super(driver);
    }

 //=================LogIn Header=================
//    @FindBy(css = "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > h2")
//    public WebElement LogInHeader;
//    public WebElement getLogInHeader(){
//        return LogInHeader;
//    }

    //=================SignUp Header=================
    @FindBy(css = "#form > div > div > div:nth-child(3) > div > h2")
    public WebElement SignUpHeader;
    public WebElement getSignUpHeader(){
        return SignUpHeader;
    }

    //=================Input Name=================
    @FindBy(css = "#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)")
    public WebElement InputName;
    public WebElement getInputName(){
        return InputName;
    }

    //=================Input Email=================
    @FindBy(css = "#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)")
    public WebElement InputEmail;
    public WebElement getInputEmail(){
        return InputEmail;
    }


    //=================LogIn Button=================
    @FindBy(css = "#form > div > div > div:nth-child(3) > div > form > button")
    public WebElement LogInButton;
    public WebElement getLogInButton(){
        return LogInButton;
    }

}

