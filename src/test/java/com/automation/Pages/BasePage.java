package com.automation.Pages;

import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void selectColor(String colorName) {
        WebElement color = Driver.getDriver().findElement(By.cssSelector("a[name='" + colorName + "']"));
        color.click();
    }
    public void selectSize(String sizeName) {
        WebElement size = Driver.getDriver().findElement(By.cssSelector("#group_1"));
        Select select = new Select(size);
        select.selectByVisibleText(sizeName);
    }
    @FindBy(xpath = "//input[@class='text']")
    public WebElement quantityBox;
    public void moreButton(String moreButton) {
        WebElement more = Driver.getDriver().findElement(By.xpath("//span[text()='" + moreButton + "']"));
        more.click();

    }}
