package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = {"Test"},

        plugin = {"pretty",
                "html:target/cucumber/report.html",
                "rerun:target/failedrerun.txt"},
        monochrome = true,
        features = {"@target/failedrerun.txt"}

)

public class FailedTest {
}

