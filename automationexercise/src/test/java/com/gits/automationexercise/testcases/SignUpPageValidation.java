package com.gits.automationexercise.testcases;
import com.gits.automationexercise.configuration.BaseTest;
import com.gits.automationexercise.configuration.LandingPage;
import com.gits.automationexercise.testpages.SignUpPage;
import com.gits.automationexercise.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class SignUpPageValidation extends BaseTest {
    @Test
  public void signUpPageValidation() {
      LandingPage lp=new LandingPage(driver);
      SignUpPage sp=new SignUpPage(driver);


      //corresponding Page Url Validation
      String link = driver.getCurrentUrl();
      System.out.println("Given" + link);
      assertEquals(link, Data.BASE_URL);
      System.out.println("link is validate");
      sleepTime(1000);

      lp.getSignUpButton().click();

      //==========Header Validation============

      if (sp.getSignUpHeader().isDisplayed()) {
          String SignUpHeader = sp.getSignUpHeader().getText();
          Assert.assertTrue(true, SignUpHeader);
      } else {
          System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
      }
      sleepTime(2000);

        //Sending Values
        sp.getInputName().sendKeys(Data.NAME);
        sleepTime(1000);

        sp.getInputEmail().sendKeys(Data.EMAIL_ADDRESS);
        sleepTime(1000);

        sp.getLogInButton().click();
        sleepTime(2000);
  }






}
