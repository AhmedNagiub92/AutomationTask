package magentoWeb.tests.registerAndLogin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/magentoWeb/tests/registerAndLogin",
        glue = {"magentoWeb.tests"},
        plugin = {"html:reports/registerAndLogin-Report.html"},
        monochrome = true
)
public class RegisterAndLoginRunner extends AbstractTestNGCucumberTests{
}

