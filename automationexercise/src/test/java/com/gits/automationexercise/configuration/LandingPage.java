package com.gits.automationexercise.configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{
    public LandingPage(WebDriver driver){
        super(driver);
    }


  //===================Home Button=================

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(1) > a")
    public WebElement HomeButton;
    public WebElement getHomeButton (){
        return HomeButton;
    }

    //====================Products Button=================

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a")
    public WebElement ProductsButton;
    public WebElement getProductsButton (){
        return ProductsButton;
    }


    //====================Cart Button=================

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(3) > a")
    public WebElement CartButton;
    public WebElement getCartButton(){
        return CartButton;
    }



    //====================Sign Up/Login Button=================

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a")
    public WebElement SignUpButton;
    public WebElement getSignUpButton (){
        return SignUpButton;
    }




    //Logout Button
    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a")
    public WebElement logout_Button;
    public WebElement getLogout_Button () {
        return logout_Button;
    }


    // =============logged in as Username===============
    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a")
    public WebElement LoggedInAsUserName;
    public WebElement getLoggedInAsUserName(){
        return LoggedInAsUserName;
    }

    //================click on delete account button=============
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    public WebElement ClickOnDeleteAccountButton;
    public WebElement getClickOnDeleteAccountButton(){
        return ClickOnDeleteAccountButton;
    }


    //================Contact Us Button=============
    @FindBy(css = "li:nth-of-type(8) > a")
    public WebElement ContactUsButton;
    public WebElement getContactUsButton(){
        return ContactUsButton;
    }


    //====================Test Cases Button=================

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(6) > a")
    public WebElement TestCasesButton;
    public WebElement getTestCasesButton(){
        return TestCasesButton;
    }


    //====================API Testing=================

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(7) > a")
    public WebElement APITesting;
    public WebElement getAPITesting (){
        return APITesting;
    }


    //====================Video Tutorials Button=================

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(8) > a")
    public WebElement VideoTutorialsButton;
    public WebElement getVideoTutorialsButton(){
        return VideoTutorialsButton;
    }



}
