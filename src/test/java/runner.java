
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        //plugin = {"pretty"},
        plugin = {"pretty"},
        features = "src/test/java/features",
        glue = "stepDefs",
        tags = {"@Regression"}
)


public class runner {
}
