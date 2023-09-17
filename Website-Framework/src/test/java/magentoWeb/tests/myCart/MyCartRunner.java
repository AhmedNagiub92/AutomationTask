package magentoWeb.tests.myCart;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/magentoWeb/tests/myCart",
        glue = {"magentoWeb.tests"},
        plugin = {"html:reports/myCart-Report.html"},
        monochrome = true
)
public class MyCartRunner extends AbstractTestNGCucumberTests{
}


