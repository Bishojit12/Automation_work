package com.gits.automationexercise.testpages;

import com.gits.automationexercise.configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToProductInCartPage extends BasePage {

    public AddToProductInCartPage(WebDriver driver) {
        super(driver);
    }

    //Add to Cart
    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.single-products > div.productinfo.text-center > a")
    public WebElement addToCartButton1;
    public WebElement getAddToCartButton1() {
        return addToCartButton1;
    }

    @FindBy(css = "body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(4) > div > div.single-products > div.productinfo.text-center > a")
    public WebElement addToCartButton2;
    public WebElement getAddToCartButton2() {
        return addToCartButton2;
    }

    //View Cart
    @FindBy(css = "#cartModal > div > div > div.modal-body > p:nth-child(2) > a > u")
    public WebElement viewCartButton;
    public WebElement getViewCartButton() {
        return viewCartButton;
    }

    //Continue Shopping
    @FindBy(css = "#cartModal > div > div > div.modal-footer > button")
    public WebElement continueShoppingButton;
    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    //Cart Description 1
    @FindBy(css = "#product-1 > td.cart_description")
    public WebElement cartDescription_1;
    public WebElement getCartDescription_1() {
        return cartDescription_1;
    }


    //Cart price 1
    @FindBy(css = "#product-1 > td.cart_price > p")
    public WebElement cartPrice_1;
    public WebElement getCartPrice_1() {
        return cartPrice_1;
    }

    // Quantity 1
    @FindBy(css = "#product-1 > td.cart_quantity > button")
    public WebElement quantity_1;
    public WebElement getQuantity_1() {
        return quantity_1;
    }

    //Cart Total Price 1
    @FindBy(css = "#product-1 > td.cart_total > p")
    public WebElement cartTotalPrice_1;
    public WebElement getCartTotalPrice_1() {
        return cartTotalPrice_1;
    }

    //Cart Description 2
    @FindBy(css = "#product-2 > td.cart_description")
    public WebElement cartDescription_2;
    public WebElement getCartDescription_2() {
        return cartDescription_2;
    }

    //Cart price 2
    @FindBy(css = "#product-2 > td.cart_price > p")
    public WebElement cartPrice_2;
    public WebElement getCartPrice_2() {
        return cartPrice_2;
    }

    // Quantity 2
    @FindBy(css = "#product-2 > td.cart_quantity > button")
    public WebElement quantity_2;
    public WebElement getQuantity_2() {
        return quantity_2;
    }

    //Cart Total Price 2
    @FindBy(css = "#product-2 > td.cart_total > p")
    public WebElement cartTotalPrice_2;
    public WebElement getCartTotalPrice_2() {
        return cartTotalPrice_2;
    }
}
