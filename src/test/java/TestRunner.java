
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = { "ca.bank.stepdefs" },
        monochrome = true,
        tags="@test",
        plugin={"pretty",
        "html:scenarioReport.html"}
)
public class TestRunner {
}
