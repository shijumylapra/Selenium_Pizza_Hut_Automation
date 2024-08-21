package stepDefs;

import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Order_stepDefs {
    WebElement locationSearch, menuItem, basketItem, cart, itemPrice, checkout, startOrder;
    WebDriver driver = Hooks.wDriver;

    @Given("I have launched the application")
    public void i_have_launched_the_application() {
        driver.get("https://www.pizzahut.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Hooks.test.log(LogStatus.PASS, "PizzaHut website launched");
        this.run(3000);
    }

    @When("I enter the location as {string}")
    public void i_enter_the_location_as(String location) {
        locationSearch = driver.findElement(By.xpath("//input[@type='text']"));
        locationSearch.sendKeys(location + " Railway Station, Agarkar Nagar");
        this.run(5000);
    }

    @When("I select the very first suggestion from the list")
    public void i_select_the_very_first_suggestion_from_the_list() {
        locationSearch.sendKeys(Keys.ENTER);
        locationSearch.click();
       // startOrder = driver.findElement(By.xpath("//span[text()='Start your order']"));
       //startOrder.click();
    }

    @Then("I should land on the Deals page")
    public void i_should_land_on_the_Deals_page() {
        this.run(3000);
        //Validate Deal Page
        Assert.assertEquals("https://www.pizzahut.co.in/order/deals/", driver.getCurrentUrl());
    }

    @Then("I select the tab as {string}")
    public void i_select_the_tab_as(String mitem) {
        menuItem = driver.findElement(By.linkText(mitem));
        menuItem.click();
        this.run(5000);
    }

    @Then("I add {string} to the basket")
    public void i_add_to_the_basket(String bitem) {
        basketItem = driver.findElement(By.xpath("//button[@data-synth='button--" + bitem + "-recommended-pan-personal--one-tap']"));
        basketItem.click();
        this.run(5000);
    }

    @Then("I note down the price displayed on the screen")
    public void i_note_down_the_price_displayed_on_the_screen() {
        WebElement add = driver.findElement(By.className("amountdue"));
        Assert.assertTrue(add.isDisplayed());
    }

    @Then("I should see the pizza {string} is added to the cart")
    public void i_should_see_the_pizza_is_added_to_the_cart(String cartItem) {
        cart = driver.findElement(By.xpath("//*[contains(@title, 'Click to make changes')]"));
        assertEquals(cartItem, cart.isDisplayed());
        System.out.println(cartItem+" 33333333333"+cart.isDisplayed());
    }

    @Then("price is also displayed correctly")
    public void price_is_also_displayed_correctly() {
        itemPrice = driver.findElement(By.xpath("//*[contains(@data-synth, 'basket-value')]"));
        Assert.assertTrue(itemPrice.isDisplayed());
    }
    @Then("I click on the Checkout button")
    public void i_click_on_the_Checkout_button() {
        checkout = driver.findElement(By.xpath("//a[.//span[text()='Checkout']]"));
        checkout.click();
    }
    @Then("I should be landed on the secured checkout page")
    public void i_should_be_landed_on_the_secured_checkout_page()
    {
        //Validate secure page

    }
    @And("I enter the personal details {string} and {string} and {string} and address details {string} and {string}")
    public void iEnterThePersonalDetailsAndAndAndAddressDetailsAnd(String cname, String mob, String email, String address, String landmark)
    {
        WebElement name = driver.findElement(By.id("checkout__name"));
        name.sendKeys(cname);

        WebElement cmob = driver.findElement(By.id("checkout__phone"));
        cmob.sendKeys(mob);

        WebElement cemail = driver.findElement(By.id("checkout__email"));
        cemail.sendKeys(email);

        WebElement caddress = driver.findElement(By.id("checkout__deliveryAddress.interior"));
        caddress.sendKeys(address);

        WebElement clandmark = driver.findElement(By.id("checkout__deliveryAddress.notes"));
        clandmark.sendKeys(landmark);
    }

    void run(int time)
    {try {Thread.sleep(time);}
        catch (Exception e) {e.getMessage();}
    }
}
