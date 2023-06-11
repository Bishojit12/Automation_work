package com.gits.automationexercise.testpages;
import com.gits.automationexercise.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage {
    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    //Account Created
    @FindBy(css = "#form > div > div > div > h2 > b")
    public WebElement accountCreated;
    public WebElement getAccountCreated(){
        return accountCreated;
    }


    //Continue Button
    @FindBy(css = "#form > div > div > div > div > a")
    public WebElement ClickOnContinueButton;
    public WebElement getClickOnContinueButton(){
        return ClickOnContinueButton;
    }

}
