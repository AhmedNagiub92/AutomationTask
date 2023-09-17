package magentoWeb.pages;

import magentoWeb.driver.WebDriverHandler;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {
    public BasePage() {}

    public static void waitUntilPageIsLoaded() {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(35));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public static void waitUntilElementIsClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(35));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitUntilTextIsAppeared(WebElement element, String Text) {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(35));
        wait.until(ExpectedConditions.textToBePresentInElement(element, Text));
    }

    public boolean elementIsDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean elementIsDisplayed(By locator){
        try {
            return WebDriverHandler.getWebDriver().findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    public boolean elementWithMultibleLocatorsIsDisplayed(By[] locators) throws Exception {

        for (By locator : locators) {
            try {
                return WebDriverHandler.getWebDriver().findElement(locator).isDisplayed();
            } catch (Exception e) {
             e.printStackTrace();
            }
        }
        return false;
    }

    public boolean elementIsSelected(WebElement element) {
        try {
            return element.isSelected();
        } catch (Exception e) {
            return false;
        }
    }

    public void scrollTo(WebElement element) {
        Actions actionProvider = new Actions(WebDriverHandler.getWebDriver());
        final int xOffset = 300;
        final int yOffset = 0;
        do {
            if (elementIsDisplayed(element)) {
                actionProvider.moveToElement(element, xOffset, yOffset);
                actionProvider.perform();
                break;
            }
            actionProvider.sendKeys(Keys.ARROW_DOWN).build().perform();
        }
        while (true);
    }

    public void scrollTo(By locator) {
        Actions actionProvider = new Actions(WebDriverHandler.getWebDriver());
        final int xOffset = 300;
        final int yOffset = 0;
        do {
            if (elementIsDisplayed(locator)) {
                actionProvider.moveToElement(WebDriverHandler.getWebDriver().findElement(locator), xOffset, yOffset);
                actionProvider.perform();
                break;
            }
            actionProvider.sendKeys(Keys.ARROW_DOWN).build().perform();
        }
        while (true);
    }

    public WebElement getElementByPartialText(String text) {

        String textXpath = "//*[contains(text(), \"" + text + "\")]";

        WebDriver driver = WebDriverHandler.getWebDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(textXpath)));

        return driver.findElement(By.xpath(textXpath));
    }

    public void clickOnElementWithPartialText(String text) {
        getElementByPartialText(text).click();
    }

    public WebElement findElementByListOfLocators(By[] locators) throws Exception {
        WebElement element = null ;

        for (By locator:locators) {
            try{
                element =findElement(locator);
            }catch (Exception e){}
            if (element!=null)
                return element;
        }
        throw new Exception("NoSuchElement : cann't locate the element with specified locators");
    }

    public WebElement findElement(By locator){
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return WebDriverHandler.getWebDriver().findElement(locator) ;
    }

    public List<WebElement> findElements(By locator) {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return WebDriverHandler.getWebDriver().findElements(locator) ;
    }
}
