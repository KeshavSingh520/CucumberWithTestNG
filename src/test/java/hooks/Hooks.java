package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.DriverUtility;

public class Hooks {

    @Before()
    public void setup(Scenario sc) {
        DriverUtility.initBrowser();
        System.out.println("Launch browser");
    }

    @After()
    public void teardown(Scenario sc) {
        DriverUtility.quitBrowser();
        System.out.println("Quit browser");
        System.out.println(sc.getStatus());
    }
}
