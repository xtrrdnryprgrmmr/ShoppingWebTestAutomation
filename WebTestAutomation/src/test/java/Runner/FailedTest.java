package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = {"Test"},

        plugin = { "pretty",
                "html:./reports/cucumber-reports/cucumber-html/index.html",
                "rerun:target/failedrerun.txt"},
        monochrome =true,
        features = { "@target/failedrerun.txt" }

)

public class FailedTest {
}
