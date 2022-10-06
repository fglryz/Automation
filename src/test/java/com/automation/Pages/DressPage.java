package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressPage extends BasePage{
    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dressesTab;
    @FindBy(xpath = "//a[@class='product_img_link']")
    public WebElement hoverprintedDress;
    @FindBy(id = "quantity_wanted")
    public WebElement quantity;
    @FindBy(id = "group_1")
    public WebElement size;
    @FindBy(xpath = "//a[@name='Beige']")
    public WebElement dressColor;
    @FindBy(xpath ="//span[text()='More']" )
    public  WebElement moreButton;
    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement addToChart;
    @FindBy(xpath = "//span[@title='Continue shopping']")
    public WebElement continueShoppingButton;
}
