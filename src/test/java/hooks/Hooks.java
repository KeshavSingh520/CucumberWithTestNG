package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import util.DriverUtility;

public class Hooks {

    @Before()
    public void setup() {
        DriverUtility.initBrowser();
        System.out.println("Launch browser");
    }

    @After()
    public void teardown(Scenario sc) {
        if(sc.isFailed()){
            String scenarioName = sc.getName().replaceAll(" ","_");
            byte[] screenshot = ((TakesScreenshot)DriverUtility.getDriver().get()).getScreenshotAs(OutputType.BYTES);
            sc.attach(screenshot,"image/png",scenarioName);
        }
        DriverUtility.quitBrowser();
        System.out.println("Quit browser");
        System.out.println(sc.getStatus());
    }
}
