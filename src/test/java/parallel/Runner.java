package parallel;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src\\test\\resources\\parallel"},
        glue = {"parallel","hooks"},
        plugin = {"pretty",
                "json:target/report/report.json",
                "html:target/report/index.html",
                "timeline:test-output-thread"},
        monochrome = true,
        dryRun = false
)
public class Runner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
