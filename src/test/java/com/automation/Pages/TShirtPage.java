package com.automation.Pages;

import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TShirtPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public WebElement TShirtButton;

    @FindBy(xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[1]")
    public WebElement FadedShortSleeveTShirt;

    @FindBy(xpath ="//span[text()='More']" )
    public  WebElement moreButton;

    @FindBy(id = "quantity_wanted")
    public WebElement quantity;

    @FindBy(id = "group_1")
    public WebElement size;

    @FindBy(xpath = "//a[@name='Blue']")
    public WebElement color;

    @FindBy(xpath = "//a[@class='product_img_link']")
    public WebElement hoverTShirt;

    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement addToChart;

    @FindBy(xpath = "//span[@title='Continue shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "(//a[contains(text(),'Summer Dresses')])[1]")
    public WebElement eveningDress;



    @FindBy(id = "layered_id_attribute_group_1")
    public WebElement SSize;

    @FindBy(id = "layered_id_attribute_group_7")
    public WebElement BeigeColor;
    @FindBy(xpath = "(//li[@class='last'])[1]")
    public WebElement summerDress;
    @FindBy(xpath = "(//a[@title='Printed Summer Dress'])[1]")
    public WebElement hoverSummerDresses;

    @FindBy(xpath = "//input[@id='layered_id_attribute_group_13']")
    public WebElement OrangeColor;

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    public WebElement quantityBox;

    @FindBy(xpath = "//a[contains(@class,'button ajax_add_to_cart')]//span[text()='Add to cart']")
    public WebElement addToCartButton1;

    @FindBy(css = "#add_to_cart>button")
    public WebElement addToCartButton;





}
