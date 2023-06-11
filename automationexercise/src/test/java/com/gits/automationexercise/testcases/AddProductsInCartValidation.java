package com.gits.automationexercise.testcases;

import com.gits.automationexercise.configuration.BaseTest;
import com.gits.automationexercise.configuration.LandingPage;
import com.gits.automationexercise.testpages.AddToProductInCartPage;
import com.gits.automationexercise.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class AddProductsInCartValidation extends BaseTest {

    @Test
    public void TCF012_addProductsInCart() throws AWTException {
        LandingPage lp = new LandingPage(driver);
        AddToProductInCartPage apcp = new AddToProductInCartPage(driver);


        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println("Home Page URL is visible");


        // Click on 'Product' button
        lp.getProductsButton().click();
        sleepTime(1000);


        // Hover over first product and click 'Add to cart'
        Robot robot = new Robot();
        robot.mouseWheel(8);

        //Add To Cart Button
        apcp.getAddToCartButton1().click();
        sleepTime(1000);

        //Click 'Continue Shopping' button
        apcp.getContinueShoppingButton().click();
        sleepTime(1000);

        //....2
        apcp.getAddToCartButton2().click();
        sleepTime(1000);


        // Click 'View Cart' button
        apcp.getViewCartButton().click();
        sleepTime(1000);
        robot.mouseWheel(5);

        // Verify both products are added to Cart

        //Cart  Description

        if (apcp.getCartDescription_1().isDisplayed()) {
            String CartDescription_1 = apcp.getCartDescription_1().getText();
            Assert.assertTrue(true, CartDescription_1);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //......

        if (apcp.getCartDescription_2().isDisplayed()) {
            String CartDescription_2 = apcp.getCartDescription_2().getText();
            Assert.assertTrue(true, CartDescription_2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //Verify their prices, quantity and total price
        if (apcp.getCartPrice_1().isDisplayed()) {
            String CartPrice_1 = apcp.getCartPrice_1().getText();
            Assert.assertTrue(true, CartPrice_1);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //.....
        if (apcp.getCartPrice_2().isDisplayed()) {
            String CartPrice_2 = apcp.getCartPrice_2().getText();
            Assert.assertTrue(true, CartPrice_2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        // Verify Both Quantity
        if (apcp.getQuantity_1().isDisplayed()) {
            String Quantity_1 = apcp.getQuantity_1().getText();
            Assert.assertTrue(true, Quantity_1);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        //.......
        if (apcp.getQuantity_2().isDisplayed()) {
            String Quantity_2 = apcp.getQuantity_2().getText();
            Assert.assertTrue(true, Quantity_2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Both Total Prices
        if (apcp.getCartTotalPrice_1().isDisplayed()) {
            String CartTotalPrice_1 = apcp.getCartTotalPrice_1().getText();
            Assert.assertTrue(true, CartTotalPrice_1);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


        // 2
        if (apcp.getCartTotalPrice_2().isDisplayed()) {
            String CartTotalPrice_2 = apcp.getCartTotalPrice_2().getText();
            Assert.assertTrue(true, CartTotalPrice_2);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);


        //Driver.back
        driver.navigate().back();
        sleepTime(1000);
    }
}
