import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                features = ".",
                tags = {"@userJourney"},
                dryRun = false,
                strict = true,
                format = {"pretty", "html:target/Reports"}
                )
public class Run {
}
