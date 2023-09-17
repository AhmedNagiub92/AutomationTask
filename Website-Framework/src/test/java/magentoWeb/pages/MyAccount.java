package magentoWeb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccount extends BasePage {
    private final By succesMessage =By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public WebElement getSuccessMessage() {
        return findElement(succesMessage);
    }
}
