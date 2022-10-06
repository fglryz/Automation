package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingChartPage extends BasePage{
    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    public WebElement proceedCheckout;
    @FindBy(id = "total_price")
    public WebElement totalPrize;
    @FindBy(id = "total_product_price_1_1_0")
    public WebElement TshirtPrize;
    @FindBy(id = "total_product_price_5_19_0")
    public WebElement PSummerDressPrize;
    @FindBy(xpath = "(//td[@class='cart_delete text-center'])[2]")
    public WebElement removePrintedDress;

    @FindBy(xpath = "(//i[@class='icon-plus'])[1]")
    public WebElement addButton1;
}
