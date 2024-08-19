package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks
{
    public static WebDriver wDriver;

    @Before
    public void SetUp()
    {
         wDriver = new ChromeDriver();
    }

    @After
    public void TearDown()
    {
        wDriver.quit();

    }

}
