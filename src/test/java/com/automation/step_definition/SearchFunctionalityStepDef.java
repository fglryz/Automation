package com.automation.step_definition;

import com.automation.Pages.*;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFunctionalityStepDef {
    BasePage basePage=new BasePage();
    TShirtPage tShirtPage = new TShirtPage();
    DressPage dressPage=new DressPage();
    SummerDressPage summerDressPage=new SummerDressPage();
    ShoppingChartPage shoppingChartPage=new ShoppingChartPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("the user navigates to main page")
    public void theUserNavigatesToMainPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User clicks T-Shirt tab")
    public void userClicksTShirtTab() {
        tShirtPage.TShirtButton.click();
    }
    @And("User hovers over Faded Short Sleeve T-Shirts")
        public void userHoversOverFadedShortSleeveTShirts() {
            BrowserUtils.hover(tShirtPage.hoverTShirt);
        }
    @When("User clicks MORE button")
    public void userClicksMOREButton() {
        //BrowserUtils.sleep(10);
       basePage.moreButton();
    }
    @When("User clicks the add to cart button")
    public void userClicksTheAddToCartButton() {
        tShirtPage.addToChart.click();
       // BrowserUtils.sleep(10);
    }
    @When("User clicks Continue Shopping button")
    public void userClicksContinueShoppingButton() {
        tShirtPage.continueShoppingButton.click();
    }
    @When("User hovers over Dress Tab")
    public void userHoversOverDressTab() {

    }
    @When("User clicks Dress Tab")
    public void userClicksDressTab() {

        dressPage.dressesTab.click();
    }
    @When("User clicks Evening Dress")
    public void userClicksEveningDress() {

        tShirtPage.eveningDress.click();
        BrowserUtils.sleep(15);
    }
    @When("User hovers Printed  Dress")
    public void userHoversPrintedDress() {
        BrowserUtils.hover(dressPage.hoverprintedDress);
        dressPage.addToChart.click();
        dressPage.continueShoppingButton.click();
    }







    @When("User clicks Summer Dress")
    public void userClicksSummerDress() {
        summerDressPage.summerDresses.click();

    }

    @When("User hovers Printed Summer Dress")
    public void userHoversPrintedSummerDress() {
        BrowserUtils.hover(summerDressPage.hoverPrintedSummerDress);

    }




    @When("User clicks proceed to checkout button")
    public void userClicksProceedToCheckoutButton() {
        shoppingChartPage.proceedCheckout.click();
    }

    @When("User removes Printed Dress")
    public void userRemovesPrintedDress() {
        shoppingChartPage.removePrintedDress.click();
        BrowserUtils.sleep(10);

    }

    @When("User add the a Faded Short Sleeve T-Shirts")
    public void userAddTheAFadedShortSleeveTShirts() {
        shoppingChartPage.addButton1.click();
    }

    @Then("User sees the total price  of Printed Dress")
    public void userSeesTheTotalPriceOfPrintedDress() {
        shoppingChartPage.PSummerDressPrize.isDisplayed();
        BrowserUtils.sleep(5);

    }

    @Then("User sees the total price  of Fladed Short Sleeves TShirt")
    public void userSeesTheTotalPriceOfFladedShortSleevesTShirt() {
        shoppingChartPage.TshirtPrize.isDisplayed();
        BrowserUtils.sleep(5);
    }


    @Then("User sees the card total is {string}")
    public void userSeesTheCardTotalIs(String expectedResult) {
        String actualResult=shoppingChartPage.totalPrize.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }


    @And("selects {string},{string} and {string}")
    public void selectsAnd(String quantity, String size, String color) {
        basePage.quantityBox.clear();
        basePage.quantityBox.sendKeys("1");
        basePage.selectSize(size);
        basePage.selectColor(color);
    }

    @And("User hovers over {string}")
    public void userHoversOver(String choosenItem) {
        BrowserUtils.hover(tShirtPage.hoverTShirt);

    }

    @When("User clicks {string}")
    public void userClicks(String eveningDress) {
    }



}

