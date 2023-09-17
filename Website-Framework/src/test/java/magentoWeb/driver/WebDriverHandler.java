package magentoWeb.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import magentoWeb.utilities.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.io.IOException;

public class WebDriverHandler {

    public static WebDriver webDriver;

    private static final String chromeDriverPath = "../driverBinaries/chromedriver.exe";
    private static String chromeDriverType = "webdriver.chrome.demoblazeWeb.driver";

    private static final String edgeDriverPath = "../driverBinaries/msedgedriver.exe";
    private static String edgeDriverType = "webdriver.edge.demoblazeWeb.driver";

    private static final String safariDriverPath = "/usr/bin/safaridriver";
    private static String safariDriverType = "webdriver.safari.demoblazeWeb.driver";

    private static String browserType = "resources/config/configBrowser.properties";
    private String driverPath = "driverPath";

    public WebDriverHandler() throws IOException {
        getDriverType();
    }

    private void getDriverType() throws IOException {
        ConfigProperties configBrowser = new ConfigProperties(browserType);
        driverPath = configBrowser.getProperty(driverPath);

        switch (driverPath) {
            case chromeDriverPath:
                System.setProperty(chromeDriverType, chromeDriverPath);
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeCapabilities = new ChromeOptions();
                webDriver = new ChromeDriver(chromeCapabilities);
                webDriver.manage().window().maximize();
                break;

            case edgeDriverPath:
                System.setProperty(edgeDriverType, edgeDriverPath);

                EdgeOptions edgeCapabilities = new EdgeOptions();
                webDriver = new EdgeDriver(edgeCapabilities);
                System.setProperty("webdriver.edge.verboseLogging", "true");
                webDriver.manage().window().maximize();
                break;

            case safariDriverPath:
                System.setProperty(safariDriverType, safariDriverPath);

                SafariOptions safariCapabilities = new SafariOptions();
                webDriver = new SafariDriver(safariCapabilities);
                webDriver.manage().window().maximize();
                break;
        }

    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public void navigateTo(String link) {
        webDriver.navigate().to(link);
    }

    public void resetCache() {
        webDriver.manage().deleteAllCookies();
    }

    public static void close() {
        webDriver.quit();
    }

    public String userGetCurrentUrl() {
        return webDriver.getCurrentUrl();
    }
}
