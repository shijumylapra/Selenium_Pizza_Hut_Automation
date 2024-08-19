
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        //plugin = {"pretty"},// console output
        plugin = {"pretty","html:target/html-cucumber"},// console output
        features = "src/test/java/features", // Generate HTML report under target folder
        glue = "Order_stepDefs",
        tags = {"@Regression"} // this tags called scenario level tags

)

public class runner {
}
