package com.automation.step_definition;

import com.automation.Pages.DressPage;
import com.automation.Pages.ShoppingChartPage;
import com.automation.Pages.SummerDressPage;
import com.automation.Pages.TShirtPage;
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

public class SearchFunctionalityStepDef {
    TShirtPage tShirtPage = new TShirtPage();
    DressPage dressPage=new DressPage();
    SummerDressPage summerDressPage=new SummerDressPage();
    ShoppingChartPage shoppingChartPage=new ShoppingChartPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("the user navigates to main page")
    public void theUserNavigatesToMainPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User clicks {string} tab")
    public void userClicksTab(String arg0) {
        tShirtPage.TShirtButton.click();
        BrowserUtils.sleep(10);
    }
    @And("User hovers over Faded Short Sleeve T Shirt")
    public void userHoversOverFadedShortSleeveTShirt() {
        BrowserUtils.hover(tShirtPage.hoverTShirt);

    }
    @When("User clicks MORE button")
    public void userClicksMOREButton() {
        tShirtPage.moreButton.click();
        BrowserUtils.sleep(10);
    }

    @And("selects one, M and Blue of the T-Shirt")
    public void selectsOneMAndBlueOfTheTShirt() {
        tShirtPage.quantity.clear();
        BrowserUtils.sleep(10);
        tShirtPage.quantity.sendKeys("1");
        BrowserUtils.sleep(10);
        Select select=new Select(dressPage.size);
        BrowserUtils.sleep(10);
        select.selectByVisibleText("M");
        BrowserUtils.sleep(10);
        tShirtPage.color.click();



    }
    @When("User clicks the add to cart button")
    public void userClicksTheAddToCartButton() {
        tShirtPage.addToChart.click();
        BrowserUtils.sleep(10);
    }
    @When("User clicks Continue Shopping button")
    public void userClicksContinueShoppingButton() {
        tShirtPage.continueShoppingButton.click();
    }

    @When("User clicks Dress button")
    public void userClicksDressButton() {
        dressPage.dressesTab.click();
        BrowserUtils.sleep(10);

    }
    @When("User clicks Evening Dress")
    public void userClicksEveningDress() {
        BrowserUtils.sleep(10);
        tShirtPage.eveningDress.click();
        BrowserUtils.sleep(15);
    }
    @When("User hovers over Printed Dress")
    public void userHoversOverPrintedDress() {
        BrowserUtils.hover(dressPage.hoverprintedDress);
        BrowserUtils.sleep(10);
        dressPage.addToChart.click();
        BrowserUtils.sleep(15);
        dressPage.continueShoppingButton.click();
    }
    @When("User clicks Dress Tab")
    public void userClicksDressTab() {
        summerDressPage.dressesTab.click();
    }


    @When("User clicks Summer Dress")
    public void userClicksSummerDress() {
        BrowserUtils.sleep(10);
        summerDressPage.summerDresses.click();
        BrowserUtils.sleep(10);
    }

    @When("User hovers Printed Summer Dress")
    public void userHoversPrintedSummerDress() {
        BrowserUtils.hover(summerDressPage.hoverPrintedSummerDress);
        BrowserUtils.sleep(10);
    }


    @When("User selects one, M and Orange of the T-Shirt")
    public void userSelectsOneMAndOrangeOfTheTShirt() {
        Select select=new Select(summerDressPage.size);
        select.selectByVisibleText("M");
        BrowserUtils.sleep(10);
        summerDressPage.dressColor.click();
    }

    @When("User clicks the add to chart button")
    public void userClicksTheAddToChartButton() {
        summerDressPage.addToChart.click();
        BrowserUtils.sleep(10);
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


}
