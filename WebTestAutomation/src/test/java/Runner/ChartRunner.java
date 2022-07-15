package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Feature"}, glue = {"Test"}, tags = "@AllStep", plugin = {"pretty",
        "html:target/cucumber/report.html",
        "rerun:target/failedrerun.txt"})
public class ChartRunner {

}
