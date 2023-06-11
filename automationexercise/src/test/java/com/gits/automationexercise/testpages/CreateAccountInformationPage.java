package com.gits.automationexercise.testpages;

import com.gits.automationexercise.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountInformationPage extends BasePage {
    public CreateAccountInformationPage(WebDriver driver){super(driver);}


    @FindBy(css = "#form > div > div > div > div.login-form > h2 > b")
    public WebElement EnterAccountInformationHeader;
    public WebElement getEnterAccountInformationHeader(){
        return EnterAccountInformationHeader;
    }

    @FindBy(css = "#id_gender1")
    public WebElement TitleGenderBox1;
    public WebElement getTitleGenderBox1(){
        return TitleGenderBox1;
    }

    @FindBy(css = "#id_gender2")
    public WebElement TitleGenderBox2;
    public WebElement getTitleGenderBox2(){
        return TitleGenderBox2;
    }

    @FindBy(css = "#name")
    public WebElement NameInput;
    public WebElement getNameInput(){
        return NameInput;
    }

    @FindBy(css = "#email")
    public WebElement EmailInput;
    public WebElement getEmailInput(){
        return EmailInput;
    }

    @FindBy(css = "#password")
    public WebElement InputPassword;
    public WebElement getInputPassword(){
        return InputPassword;
    }

    @FindBy(css = "#days")
    public WebElement SelectDay;
    public WebElement getSelectDay(){
        return SelectDay;
    }

    @FindBy(css = "#months")
    public WebElement SelectMonth;
    public WebElement getSelectMonth(){
        return SelectMonth;
    }

    @FindBy(css = "#years")
    public WebElement SelectYear;
    public WebElement getSelectYear(){
        return SelectYear;
    }

    @FindBy(css = "#newsletter")
    public WebElement Signup_NewsLetterCheckBox;
    public WebElement getSignup_NewsLetterCheckBox(){
        return Signup_NewsLetterCheckBox;
    }

    @FindBy(css = "#optin")
    public WebElement ReceiveSpecialOfferCheckBox;
    public WebElement getReceiveSpecialOfferCheckBox(){
        return ReceiveSpecialOfferCheckBox;
    }

    @FindBy(css = "#first_name")
    public WebElement FirstName;
    public WebElement getFirstName(){
        return FirstName;
    }

    @FindBy(css = "#last_name")
    public WebElement LastName;
    public WebElement getLastName(){
        return LastName;
    }

    @FindBy(css = "#company")
    public WebElement InputCompany;
    public WebElement getInputCompany(){
        return InputCompany;
    }

    @FindBy(css = "#address1")
    public WebElement InputAddress1;
    public WebElement getInputAddress1(){
        return InputAddress1;
    }

    @FindBy(css = "#address2")
    public WebElement InputAddress2;
    public WebElement getInputAddress2(){
        return InputAddress2;
    }

    @FindBy(css = "#country")
    public WebElement SelectCountry;
    public WebElement getSelectCountry(){
        return SelectCountry;
    }

    @FindBy(css = "#state")
    public WebElement InputState;
    public WebElement getInputState(){
        return InputState;
    }

    @FindBy(css = "#city")
    public WebElement InputCity;
    public WebElement getInputCity(){
        return InputCity;
    }

    @FindBy(css = "#zipcode")
    public WebElement InputZipCode;
    public WebElement getInputZipCode(){
        return InputZipCode;
    }

    @FindBy(css = "#mobile_number")
    public WebElement InputMobileNumber;
    public WebElement getInputMobileNumber(){
        return InputMobileNumber;
    }

    @FindBy(css = "#form > div > div > div > div.login-form > form > button")
    public WebElement ClickOnCreateAccountButton;
    public WebElement getClickOnCreateAccountButton(){
        return ClickOnCreateAccountButton;
    }
}



