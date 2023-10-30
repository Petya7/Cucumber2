package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"classpath:features/"},
        glue = { "classpath:steps", "browserFactory"},
        tags = "not @ignore",
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html","json:target/cucumber.json"},
        monochrome = true
)


public class TestRunner {

    }
