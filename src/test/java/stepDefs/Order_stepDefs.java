package stepDefs;
import com.relevantcodes.extentreports.LogStatus;
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

public class Order_stepDefs
{
    WebElement LoginLink,UserName,Password,LoginBtn,Error;
    WebDriver driver= Hooks.wDriver;
    @Given("I have launched the application")
    public void i_have_launched_the_application()
    {

    }

    @When("I enter the location as {string}")
    public void i_enter_the_location_as(String string)throws Exception
    {

    }
    @Then("I should land on the Deals page")
    public void i_should_land_on_the_Deals_page()
    {
    }


}
