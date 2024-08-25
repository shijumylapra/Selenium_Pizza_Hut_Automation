package stepDefs;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks {
    public static ExtentReports report = new ExtentReports("reports.html", false);
    public static ExtentTest test;
    public static WebDriver wDriver;

    @Before
    public void SetUp(Scenario scenario) {
        wDriver = new ChromeDriver();
        test = report.startTest(scenario.getName());
    }

    @After
    public void TearDown() {
        report.endTest(test);
        report.close();
        wDriver.quit();

    }

}
